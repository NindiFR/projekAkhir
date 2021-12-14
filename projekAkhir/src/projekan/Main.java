package projekan;

//import projekan.models.baseModel;
import projekan.models.karyawan;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
//        karyawan karyawan = new karyawan();
        System.out.println("Koneksi berhasil");
//            int result = karyawan.addKaryawan("123", "nindi", "perempuan", "stb", "09876", "12");
//            if (result > 0) {
//                System.out.println("Berhasil update " + result + " baris.");
//            }
//        } catch (SQLException e) {
//            System.out.println("Terjadi Kesalahan " + e.getMessage());
//        }
//    }
//}

        showMenu();
    }

    static void showMenu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("PILIHAN> ");

        try {
            karyawan karyawan = new karyawan();
//            karyawan = new karyawan();
            int pilihan;
            Scanner input = new Scanner(System.in);
            pilihan = input.nextInt();
            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    insertkaryawan();
                    break;
//                case 2:
//                    showData();
//                    break;
//                case 3:
//                    updateBuku();
//                    break;
//                case 4:
//                    deleteBuku();
//                    break;
                default:
                    System.out.println("Pilihan salah!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void insertkaryawan() throws SQLException {
        Scanner input = new Scanner(System.in);
        try {
            karyawan karyawan = new karyawan();
            System.out.println("Koneksi berhasil");
            // ambil input dari user
            System.out.print("NIP: ");
            String nip = input.nextLine();
            System.out.print("Nama ");
            String nama = input.nextLine();
            System.out.print("Jenis kelamin: ");
            String jenisKelamin = input.nextLine();
            System.out.print("Asal kota ");
            String AsalKota = input.nextLine();
            System.out.print("No Handphone: ");
            String noHandphone = input.nextLine();
            System.out.print("Periode ");
            String periode = input.nextLine();

            int result = karyawan.addKaryawan(nip, nama, jenisKelamin, AsalKota, noHandphone, periode);
            if (result > 0) {
                System.out.println("Berhasil update " + result + " baris.");
            }

        } catch (SQLException e) {
            System.out.println("terjadi kesalahan" + e.getMessage());
        }
    }

}