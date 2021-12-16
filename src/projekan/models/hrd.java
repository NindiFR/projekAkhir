package projekan.models;

/**
 *
 * @author Nindi fenestiyan
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class hrd extends baseModel{
    public hrd() throws SQLException {
        super();
    }
    public int addHRD(String nama, String jenisKelamin, String AsalKota, String noHandphone) throws SQLException {
        String query = "INSERT INTO hrd " +
                "(nama, jenisKelamin, AsalKota, noHandphone) " +
                "VALUES  (?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, nama);
        preparedStatement.setString(2, jenisKelamin);
        preparedStatement.setString(3, AsalKota);
        preparedStatement.setString(4, noHandphone);

        return preparedStatement.executeUpdate();
    }

    public ResultSet getHrd() throws SQLException {
        String query = "SELECT * FROM hrd";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public int deleteHrd() {
        String query = "DELETE FROM hrd WHERE idhrd = ?";
        int affectedrows = 0;
        int idhrd;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Scanner input = new Scanner(System.in);
            System.out.print("\nMasukan Id HRD yang Akan Dihapus : ");
            idhrd = input.nextInt();
            preparedStatement.setInt(1, idhrd);
            affectedrows = preparedStatement.executeUpdate();
            System.out.println("\nBerhasil Menghapus Data");


        } catch (SQLException e) {
            System.out.println("Gagal Menghapus" + e.getMessage());
        }
        return affectedrows;

    }

    public void updateDataHrd(int idHrd, String nama, String jenisKelamin, String AsalKota, String noHandphone) throws SQLException{
        String query = "update hrd set nama = ?, jeniskelamin = ?,asalkota = ? , nohandphone = ? where idhrd = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, nama);
        preparedStatement.setString(2, jenisKelamin);
        preparedStatement.setString(3, AsalKota);
        preparedStatement.setString(4, noHandphone);
        preparedStatement.setInt(5, idHrd);

        preparedStatement.executeUpdate();

    }
}
