package ecole;

import bdd.BaseDeDonnees;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static java.lang.Math.log10;

public abstract class PersonneRecrutable extends Personne implements Inscription {

    public PersonneRecrutable(String nom, String prenom, String numeroEtNomDeRue, int codePostal, String ville, String numeroDeTelephone, String email) {
        super(nom, prenom, numeroEtNomDeRue, codePostal, ville, numeroDeTelephone, email);
    }

    @Override
    public void genererIdentifiant(BaseDeDonnees bdd, int anneeInscription) {

        //"SELECT MatriculeEleve FROM eleves WHERE MatriculeEleve LIKE \'%" + anneeInscription + "%\'"

        Connection con = null;
        Statement stmt = null;
        ResultSet rset = null;

        try {

            con = bdd.getConnection();
            stmt = con.createStatement();

            rset = stmt.executeQuery(String.format("SELECT count(MatriculeEleve) FROM eleves WHERE MatriculeEleve LIKE '%%%d%%'", anneeInscription));

            if(rset.next()) {
                String nbrEleves = rset.getString(1);

                matricule = (anneeInscription * 10000) + Integer.parseInt(nbrEleves) + 1;

            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
