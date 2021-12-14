package projekan.models;

import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

public class karyawan extends baseModel {
    public karyawan() throws SQLException{
        super();
    }

    public int addKaryawan(String nip, String nama, String jenisKelamin, String AsalKota, String noHandphone, String periode) throws SQLException {
       String query = "INSERT INTO karyawan " +
               "(nip, nama, jenisKelamin, AsalKota, noHandphone, periode) " +
               "VALUES  (?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, nip);
        preparedStatement.setString(2, nama);
        preparedStatement.setString(3, jenisKelamin);
        preparedStatement.setString(4, AsalKota);
        preparedStatement.setString(5, noHandphone);
        preparedStatement.setString(6, periode);

        return preparedStatement.executeUpdate();
//    }
//    public ResultSet getKaryawan() throws SQLException {
//        String query = "SELECT * FROM karyawan";
//
//        PreparedStatement preparedStatement = connection.prepareStatement(query);
//        return preparedStatement.executeQuery();
    }
}
