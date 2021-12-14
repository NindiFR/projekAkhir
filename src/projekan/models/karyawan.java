package projekan.models;

/**
 *
 * @author Nindi fenestiyan
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class karyawan extends baseModel {

    public karyawan() throws SQLException {
        super();
    }

    public int addKaryawan(String nama, String jenisKelamin, String AsalKota, String noHandphone, int periode, int idHrd,int idJabatan) throws SQLException {
        String query = "INSERT INTO karyawan " +
                "(nama, jenisKelamin, AsalKota, noHandphone, periode, idhrd, idjabatan) " +
                "VALUES  (?, ?,?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, nama);
        preparedStatement.setString(2, jenisKelamin);
        preparedStatement.setString(3, AsalKota);
        preparedStatement.setString(4, noHandphone);
        preparedStatement.setInt(5, periode);
        preparedStatement.setInt(6, idHrd);
        preparedStatement.setInt(7, idJabatan);


        return preparedStatement.executeUpdate();
    }

    public ResultSet getKaryawan() throws SQLException {
        String query = "SELECT * FROM karyawan";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeQuery();
    }

//    private void displayKaryawan(ResultSet rs) throws SQLException {
//        while (rs.next()) {
//            System.out.println(rs.getInt("idkaryawan") + "\t"
//                    + rs.getString("nama"));
//
//        }
//    }
//
//    public void getRekapKaryawan() {
//        int idkaryawan;
//        String query = "SELECT idkaryawan, nama "
//                + "FROM karyawan "
//                + "WHERE idkaryawan = ?";
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            {
//                Scanner input = new Scanner(System.in);
//                System.out.print("Masukan Id Karyawan : ");
//                idkaryawan = input.nextInt();
//                preparedStatement.setInt(1, idkaryawan);
//                ResultSet rs = preparedStatement.executeQuery();
//                displayKaryawan(rs);
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }

    public int deleteKaryawan() {
        String query = "DELETE FROM karyawan WHERE idkaryawan = ?";
        int affectedrows = 0;
        int idkaryawan;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Scanner input = new Scanner(System.in);
            System.out.print("\nMasukan Id Karyawan yang Akan Dihapus : ");
            idkaryawan = input.nextInt();
            preparedStatement.setInt(1, idkaryawan);
            affectedrows = preparedStatement.executeUpdate();
            System.out.println("\n Berhasil Menghapus Data");


        } catch (SQLException e) {
            System.out.println("Gagal Menghapus" + e.getMessage());
        }
        return affectedrows;
    }

    public void updateDataKaryawan(int idKaryawan, String nama, String jenisKelamin, String AsalKota, String noHandphone, int periode, int idHrd, int idJabatan) throws SQLException{
        String query = "update karyawan set nama = ?, jeniskelamin = ?,asalkota = ? , nohandphone = ?, periode = ?, idhrd = ?, idjabatan = ? where idkaryawan = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, nama);
        preparedStatement.setString(2, jenisKelamin);
        preparedStatement.setString(3, AsalKota);
        preparedStatement.setString(4, noHandphone);
        preparedStatement.setInt(5, periode);
        preparedStatement.setInt(6, idHrd);
        preparedStatement.setInt(7, idJabatan);
        preparedStatement.setInt(8, idKaryawan);

        preparedStatement.executeUpdate();

    }
}


