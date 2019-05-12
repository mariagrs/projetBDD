package ecole;

import bdd.BaseDeDonnees;
import bdd.ResultatRequete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class Personne {

    protected int matricule;
    protected String nom;
    protected String prenom;

    protected String numeroEtNomDeRue;
    protected int codePostal;
    protected String ville;
    protected String numeroDeTelephone;
    protected String email;

    public Personne(String nom, String prenom, String numeroEtNomDeRue, int codePostal, String ville, String numeroDeTelephone, String email) {

        this.nom = nom;
        this.prenom = prenom;
        this.numeroEtNomDeRue = numeroEtNomDeRue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.numeroDeTelephone = numeroDeTelephone;
        this.email = email;
    }

    public static Personne creerPersonneResponsableDansBdd(BaseDeDonnees bdd, String nom, String prenom, String numeroEtNomDeRue, int codePostal, String ville, String numeroDeTelephone, String email) {

        Personne p = new Personne(nom, prenom, numeroEtNomDeRue, codePostal, ville, numeroDeTelephone, email);


        // On insert la personne dans la bdd

        bdd.executerUpdate("INSERT INTO responsables(Nom, Prenom, N_et_Nom_de_rue, Code_Postal, Ville, Tel_fixe_ou_mobile, Email)" +
                                " VALUES(?, ?, ?, ?, ?, ?, ?)",

                                new ArrayList<String>( Arrays.asList(nom, prenom, numeroEtNomDeRue, Integer.toString(codePostal), ville, numeroDeTelephone, email) )
                );


        // On récupère l'id de la personne qu'on vient d'ajouter à la bdd

        p.matricule = Integer.parseInt(bdd.executerRequete("SELECT MAX(IdPersonneResponsable) FROM responsables").get(0,0));

        return p;
    }

    public static Personne chercherPersonneResponsable(BaseDeDonnees bdd, int id) {

        Personne p;

        ResultatRequete resultatRequete;

        // On récupère les données de la personne dans la bdd avec l'id passé en paramètre

        resultatRequete = bdd.executerRequetePreparee("SELECT * from responsables WHERE IdPersonneResponsable = ?", new ArrayList<String>(Collections.singletonList(Integer.toString(id))));

        ArrayList<String> resultat = resultatRequete.getLigne(0);

        p = new Personne(resultat.get(1),resultat.get(2), resultat.get(3), Integer.parseInt(resultat.get(4)), resultat.get(5), resultat.get(6), resultat.get(7));

        p.matricule = Integer.parseInt(resultat.get(0));

        return p;
    }
}
