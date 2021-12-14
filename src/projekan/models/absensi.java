package projekan.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class absensi extends karyawan{
    public absensi() throws SQLException {
    }

    public int addAbsensi(int sakit, int masuk, int izin, int cuti, int jamLembur, int idKaryawan) throws SQLException {
        String query = "INSERT INTO absensi " +
                "(sakit, masuk, izin, cuti, jamLembur, idkaryawan) " +
                "VALUES  (?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, sakit);
        preparedStatement.setInt(2, masuk);
        preparedStatement.setInt(3, izin);
        preparedStatement.setInt(4, cuti);
        preparedStatement.setInt(5, jamLembur);
        preparedStatement.setInt(6, idKaryawan);

        return preparedStatement.executeUpdate();
    }

    public ResultSet getAbsensi() throws SQLException {
        String query = "SELECT * FROM absensi";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public int deleteAbsensi() {
        String query = "DELETE FROM absensi WHERE idkaryawan= ?";
        int affectedrows = 0;
        int idkaryawan;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Scanner input = new Scanner(System.in);
            System.out.print("\nMasukan Id Karyawan yang Akan Dihapus Data Absensinya: ");
            idkaryawan = input.nextInt();
            preparedStatement.setInt(1, idkaryawan);
            affectedrows = preparedStatement.executeUpdate();
            System.out.println("\nBerhasil Menghapus Data");


        } catch (SQLException e) {
            System.out.println("Gagal Menghapus" + e.getMessage());
        }
        return affectedrows;
    }

    public void updateDataAbsensi(int idAbsensi, int sakit, int masuk, int izin, int cuti, int jamLembur, int idKaryawan) throws SQLException{
        String query = "update absensi set sakit = ?, masuk = ?, izin = ?, cuti = ?, jamlembur = ?, idkaryawan = ? where idabsensi = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, sakit);
        preparedStatement.setInt(2, masuk);
        preparedStatement.setInt(3, izin);
        preparedStatement.setInt(4, cuti);
        preparedStatement.setInt(5, jamLembur);
        preparedStatement.setInt(6, idKaryawan);
        preparedStatement.setInt(7, idAbsensi);

        preparedStatement.executeUpdate();

    }
}