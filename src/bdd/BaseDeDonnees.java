package bdd;

import java.sql.*;
import java.util.ArrayList;

public class BaseDeDonnees {

    /**
     * URL de connection
     */
    private final static String URL = "jdbc:mysql://localhost:3306/projet_bdd?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    /**
     * Nom du user
     */
    private final static String LOGIN = "root";

    /**
     * Mot de passe du user
     */
    private final static String PASSWORD = "";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, LOGIN, PASSWORD);
    }

    public void executerEtAfficherRequete(String req) {

        Connection con = null;
        Statement stmt = null;

        try {
            con = getConnection();
            stmt = con.createStatement();
            final ResultSet rset = stmt.executeQuery(req);

            while (rset.next()) {
                int n = rset.getMetaData().getColumnCount();

                for(int i = 1; i <= n; i++)
                    System.out.print(rset.getString(i) + " ");

                System.out.print('\n');
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

    public ResultatRequete executerRequete(String req) {

        Connection con = null;
        Statement stmt = null;
        ResultSet rset = null;
        ResultatRequete resultatRequete = new ResultatRequete();

        try {
            con = getConnection();
            stmt = con.createStatement();
            rset = stmt.executeQuery(req);

            resultatRequete.chargerDepuisResultSet(rset);

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

        return resultatRequete;
    }

    public ResultatRequete executerRequetePreparee(String req,  ArrayList<String> parameters) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rset = null;
        ResultatRequete resultatRequete = new ResultatRequete();

        try {
            con = getConnection();
            stmt = con.prepareStatement(req);

            for (int i = 0; i < parameters.size(); i++) {
                stmt.setString(i + 1, parameters.get(i));
            }

            rset = stmt.executeQuery();

            resultatRequete.chargerDepuisResultSet(rset);

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

        return resultatRequete;
    }

    public void executerUpdate(String req) {

        Connection con = null;
        Statement stmt = null;
        ResultSet rset = null;

        try {
            con = getConnection();
            stmt = con.createStatement();
            stmt.executeUpdate(req);

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

    public void executerUpdate(String req, ArrayList<String> parameters) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rset = null;

        try {
            con = getConnection();
            stmt = con.prepareStatement(req);

            for (int i = 0; i < parameters.size(); i++) {
                stmt.setString(i + 1, parameters.get(i));
            }


            stmt.executeUpdate();

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
