package projekan.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class gaji extends baseModel {
    public gaji() throws SQLException {
        super();
    }


    public int addGaji(int golongan, int gajiPokok, int tunjangan, int cicilanPinjaman, int idkaryawan) throws SQLException {
        String query = "INSERT INTO gaji " +
                "(golongan, gajiPokok, tunjangan, cicilanPinjaman,idkaryawan) " +
                "VALUES  ( ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, golongan);
        preparedStatement.setInt(2, gajiPokok);
        preparedStatement.setInt(3, tunjangan);
        preparedStatement.setInt(4, cicilanPinjaman);
        preparedStatement.setInt(5, idkaryawan);


        return preparedStatement.executeUpdate();
    }

    public ResultSet getGaji() throws SQLException {
        String query = "SELECT * FROM gaji";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public int deleteGaji() {
        String query = "DELETE FROM gaji WHERE idkaryawan = ?";
        int affectedrows = 0;
        int idkaryawan;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Scanner input = new Scanner(System.in);
            System.out.print("\nMasukan Id Karyawan yang Akan Dihapus : ");
            idkaryawan = input.nextInt();
            preparedStatement.setInt(1, idkaryawan);
            affectedrows = preparedStatement.executeUpdate();
            System.out.println("\nBerhasil Menghapus Data");


        } catch (SQLException e) {
            System.out.println("Gagal Menghapus" + e.getMessage());
        }
        return affectedrows;

    }
}
