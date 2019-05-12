package bdd;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ResultatRequete {

    private ArrayList<ArrayList<String>> tableauResultat;

    public ResultatRequete() {
        tableauResultat = new ArrayList<>();
    }

    public ArrayList<ArrayList<String>> getTableauResultat() {
        return tableauResultat;
    }

    public void setTableauResultat(ArrayList<ArrayList<String>> tableauResultat) {
        this.tableauResultat = tableauResultat;
    }

    public String get(int ligne, int colonne) {
        if(tableauResultat.size() <= ligne) {
            throw new IndexOutOfBoundsException();
        }

        if(tableauResultat.get(ligne).size() <= colonne) {
            throw new IndexOutOfBoundsException();
        }

        return tableauResultat.get(ligne).get(colonne);
    }

    public ArrayList<String> getLigne(int ligne) {
        if(tableauResultat.size() <= ligne) {
            throw new IndexOutOfBoundsException();
        }

        return tableauResultat.get(ligne);
    }

    void chargerDepuisResultSet(ResultSet rset)  {

        try {

            while (rset.next()) {

                int n = rset.getMetaData().getColumnCount();

                tableauResultat.add(new ArrayList<>());

                for(int i = 1; i <= n; i++) {
                    tableauResultat.get(tableauResultat.size() - 1).add(rset.getString(i));
                }

                System.out.print('\n');
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
