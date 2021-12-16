package projekan.models;

/**
 *
 * @author Nindi fenestiyan
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class jabatan extends baseModel{
    public jabatan() throws SQLException {
        super();
    }

    public int addJabatan(String divisi, String jabatan) throws SQLException {
        String query = "INSERT INTO jabatan " +
                "(divisi, jabatan) " +
                "VALUES  (?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, divisi);
        preparedStatement.setString(2, jabatan);

        return preparedStatement.executeUpdate();
    }

    public ResultSet getJabatan() throws SQLException {
        String query = "SELECT * FROM jabatan";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public int deleteJabatan() throws SQLException {
        String query = "DELETE FROM jabatan WHERE idjabatan = ?";
        int affectedrows = 0;
        int idjabatan;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Scanner input = new Scanner(System.in);
            System.out.print("\nMasukan Id Jabatan yang Akan Dihapus : ");
            idjabatan = input.nextInt();
            preparedStatement.setInt(1, idjabatan);
            affectedrows = preparedStatement.executeUpdate();
            System.out.println("\nBerhasil Menghapus Data");

        } catch (SQLException e) {
            System.out.println("Gagal Menghapus" + e.getMessage());
        }
        return affectedrows;

    }

    public void updateDataJabatan(int idjabatan, String divisi, String Jabatan) throws SQLException{
        String query = "update jabatan set divisi = ?, jabatan = ? where idjabatan = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, divisi);
        preparedStatement.setString(2, Jabatan);
        preparedStatement.setInt(3, idjabatan);

        preparedStatement.executeUpdate();

    }
}


