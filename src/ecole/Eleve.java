package ecole;

import bdd.BaseDeDonnees;
import bdd.ResultatRequete;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Eleve extends PersonneRecrutable {

    private Date dateDeNaissance;
    private String villeDeNaissance;
    private String paysDeNaissance;
    private String sexe;
    private String photo;
    private int numeroDeGroupe;

    private Personne personneResponsable;


    public Eleve(String nom, String prenom, String numeroEtNomDeRue, int codePostal, String ville, String numeroDeTelephone, String email, Date dateDeNaissance, String villeDeNaissance, String paysDeNaissance, String sexe, int numeroDeGroupe, String photo) {

        super(nom, prenom, numeroEtNomDeRue, codePostal, ville, numeroDeTelephone, email);

        this.dateDeNaissance = dateDeNaissance;
        this.villeDeNaissance = villeDeNaissance;
        this.paysDeNaissance = paysDeNaissance;
        this.sexe = sexe;
        this.photo = photo;
        this.personneResponsable = null;
        this.numeroDeGroupe = numeroDeGroupe;
    }

    public Eleve(String nom, String prenom, String numeroEtNomDeRue, int codePostal, String ville, String numeroDeTelephone, String email, Date dateDeNaissance, String villeDeNaissance, String paysDeNaissance, String sexe, int numeroDeGroupe) {

        super(nom, prenom, numeroEtNomDeRue, codePostal, ville, numeroDeTelephone, email);

        this.dateDeNaissance = dateDeNaissance;
        this.villeDeNaissance = villeDeNaissance;
        this.paysDeNaissance = paysDeNaissance;
        this.sexe = sexe;
        this.photo = "";
        this.personneResponsable = null;
        this.numeroDeGroupe = numeroDeGroupe;
    }

    public void definirPersonneResponsable(Personne p) {
        personneResponsable = p;
    }

    public static Eleve creerEleveDansBdd(BaseDeDonnees bdd, int anneeInscription, String nom, String prenom, String numeroEtNomDeRue, int codePostal, String ville, String numeroDeTelephone, String email,
                                          Date dateDeNaissance, String villeDeNaissance, String paysDeNaissance, String sexe, String motDePasse, int numeroGroupe, Personne personneResponsable) {

        // On crée l'élève avec les paramètres

        Eleve e = new Eleve(nom, prenom, numeroEtNomDeRue, codePostal, ville, numeroDeTelephone, email, dateDeNaissance, villeDeNaissance, paysDeNaissance, sexe, numeroGroupe);

        e.definirPersonneResponsable(personneResponsable);

        e.genererIdentifiant(bdd, anneeInscription);

        // On insert l'élève dans la bdd
        // TODO: Gérer la date de naissance de l'élève (conversion de dateDeNaissance de la classe Eleve au format YYYY-MM-DD)

        bdd.executerUpdate("INSERT INTO eleves(" +
                "MatriculeEleve, Nom, Prenom, Date_de_naissance, Ville_de_naissance, Pays_de_Naissance, Sexe," +
                "N_et_nom_de_rue, Code_Postal, Ville, Tel_fixe_ou_mobile, email, Motdepasse, NumeroGroupe," +
                "IdPersonneResponsable)" +
                " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",

                new ArrayList<String>(Arrays.asList("" + e.matricule, e.nom, e.prenom, "1998-01-20", e.villeDeNaissance,
                        e.paysDeNaissance, e.sexe, e.numeroEtNomDeRue, "" + e.codePostal, e.ville, e.numeroDeTelephone,
                        e.email, motDePasse, "" + e.numeroDeGroupe, "" + e.personneResponsable.matricule))

                );

        return e;
    }

}
