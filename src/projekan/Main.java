package projekan;

/**
 *
 * @author Nindi fenestiyan
 */

import projekan.exception.Exception;
import projekan.models.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {
    static karyawan karyawan;
    static hrd hrd;
    static absensi absensi;
    static gaji gaji;
    static jabatan jabatan;

    public static void main(String[] args) {
        showMenu();
    }

    static void showMenu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. HRD");
        System.out.println("2. Karyawan");
        System.out.println("3. Jabatan");
        System.out.println("4. Absensi");
        System.out.println("5. Gaji");
        System.out.println("6. Cetak Gaji");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("PILIHAN (1/2/3/4/5/6/0)> ");

        try {
            int pilihan;
            Scanner input = new Scanner(System.in);
            pilihan = input.nextInt();
            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("\n========= SUB MENU HRD =========");
                    System.out.println("1. Tambah data");
                    System.out.println("2. Tampilkan data");
                    System.out.println("3. Hapus data");
                    System.out.println("4. Ubah data");
                    System.out.println("0. Keluar");
                    System.out.println("");
                    System.out.print("PILIHAN(1/2/3/4/0/) = ");


                    try {
                        hrd = new hrd();
                        pilihan = input.nextInt();
                        switch (pilihan) {
                            case 0:
                                System.exit(0);
                                break;
                            case 1:
                                inserthrd();
                                showDataHrd();
                                break;
                            case 2:
                                showDataHrd();
                                showMenu();
                                break;
                            case 3:
                                showDataHrd();
                                hapusDataHrd();
                                break ;
                            case 4:
                                showDataHrd();
                                ubahDataHrd();
                                break;
                            default:
                                System.out.println("Pilihan salah!");
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("\n========= SUB MENU KARYAWAN =========");
                    System.out.println("1. Tambah data");
                    System.out.println("2. Tampilkan data");
                    System.out.println("3. Hapus data");
                    System.out.println("4. Ubah data");
                    System.out.println("0. Keluar");
                    System.out.println("");
                    System.out.print("PILIHAN(1/2/3/4/0/) = ");

                    try {
                        karyawan = new karyawan();
                        pilihan = input.nextInt();
                        switch (pilihan) {
                            case 0:
                                System.exit(0);
                                break;
                            case 1:
                                insertKaryawan();
                                showDataKaryawan();
                                break;
                            case 2:
                                showDataKaryawan();
                                showMenu();
                                break;
                            case 3:
                                showDataKaryawan();
                                hapusDataKaryawan();
                                break;
                            case 4:
                                showDataKaryawan();
                                ubahDataKaryawan();
                                break;
                           default:
                                System.out.println("Pilihan salah!");
                                break;
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("\n========= SUB MENU JABATAN =========");
                    System.out.println("1. Tambah data");
                    System.out.println("2. Tampilkan data");
                    System.out.println("3. Hapus data");
                    System.out.println("4. Ubah data");
                    System.out.println("0. Keluar");
                    System.out.println("");
                    System.out.print("PILIHAN(1/2/3/4/0/) = ");

                    try {
                        jabatan = new jabatan();
                        pilihan = input.nextInt();
                        switch (pilihan) {
                            case 0:
                                System.exit(0);
                                break;
                            case 1:
                                insertJabatan();
                                showDataJabatan();
                                break;
                            case 2:
                                showDataJabatan();
                                showMenu();
                                break;
                            case 3:
                                showDataJabatan();
                                hapusDataJabatan();
                                break;
                            case 4:
                                showDataJabatan();
                                ubahDataJabatan();
                                break;
                            default:
                                System.out.println("Pilihan salah!");
                                break;
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("\n========= SUB MENU ABSENSI =========");
                    System.out.println("1. Tambah data");
                    System.out.println("2. Tampilkan data");
                    System.out.println("3. Hapus data");
                    System.out.println("4. Ubah data");
                    System.out.println("0. Keluar");
                    System.out.println("");
                    System.out.print("PILIHAN(1/2/3/4/0/) = ");

                    try {
                        absensi = new absensi();
                        karyawan = new karyawan();
                        pilihan = input.nextInt();
                        switch (pilihan) {
                            case 0:
                                System.exit(0);
                                break;
                            case 1:
                                showDataKaryawan();
                                insertAbsensi();
                                showDataAbsensi();
                                break;
                            case 2:
                                showDataAbsensi();
                                showMenu();
                                break;
                            case 3:
                                showDataAbsensi();
                                hapusDataAbsensi();
                                break;
                            case 4:
                                showDataAbsensi();
                                ubahDataAbsensi();
                                break;
                            default:
                                System.out.println("Pilihan salah!");
                                break;
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("\n========= SUB MENU GAJI =========");
                    System.out.println("1. Tambah data");
                    System.out.println("2. Tampilkan data");
                    System.out.println("3. Hapus data");
                    System.out.println("0. Keluar");
                    System.out.println("");
                    System.out.print("PILIHAN(1/2/3/0/) = ");

                    try {
                        gaji = new gaji();
                        karyawan = new karyawan();
                        pilihan = input.nextInt();
                        switch (pilihan) {
                            case 0:
                                System.exit(0);
                                break;
                            case 1:
                                showDataKaryawan();
                                insertgaji();
                                showDataGaji();
                                break;
                            case 2:
                                showDataGaji();
                                showMenu();
                                break;
                            case 3:
                                showDataGaji();
                                hapusDataGaji();
                                break;
                            default:
                                System.out.println("Pilihan salah!");
                                break;
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case 6:
                    cetakGaji();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    //HRD
    private static void showDataHrd() throws SQLException {
        ResultSet daftarHrd = hrd.getHrd();
        System.out.print("\nID   NAMA   JENIS KELAMIN  ASAL KOTA    NO.HP  \n");
        System.out.println("=================================================");
        while (daftarHrd.next()) {
            System.out.print(daftarHrd.getString("idhrd"));
            System.out.print("    ");
            System.out.print(daftarHrd.getString("nama"));
            System.out.print("    ");
            System.out.print(daftarHrd.getString("jeniskelamin"));
            System.out.print("    ");
            System.out.print(daftarHrd.getString("asalkota"));
            System.out.print("    ");
            System.out.print(daftarHrd.getString("nohandphone"));
            System.out.print("    ");
            System.out.println();
        }
    }

    private static void inserthrd() {
        try {
            Scanner input = new Scanner(System.in);
            hrd hrd = new hrd();
            // ambil input dari user
            System.out.print("Nama: ");
            String nama = input.next();
            System.out.print("Jenis Kelamin: ");
            String jenisKelamin = input.next();
            System.out.print("Asal Kota: ");
            String AsalKota = input.next();
            System.out.print("Nomer Handphone: ");
            String noHandphone = input.next();

            if (nama.isEmpty()) {
                throw new Exception("Nama tidak boleh kosong");
            }
            if (jenisKelamin.isEmpty()) {
                throw new Exception("Jenis kelamin tidak boleh kosong");
            }
            if (AsalKota.isEmpty()) {
                throw new Exception("Asal Kota tidak boleh kosong");
            }
            if (noHandphone.isEmpty()) {
                throw new Exception("Nomer handphone tidak boleh kosong");
            }

            int result = hrd.addHRD(nama, jenisKelamin, AsalKota, noHandphone);
            if (result > 0) {
                System.out.println("Berhasil update " + result + " baris.");
            }

        } catch (SQLException | Exception e) {
            System.out.println("terjadi kesalahan" + e.getMessage());
        }
    }

    public static void hapusDataHrd() throws SQLException {
        hrd hrd = new hrd();
        hrd.deleteHrd();
    }

    private static void ubahDataHrd() throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID HRD yang Akan Diubah: ");
        int idHrd = input.nextInt();

        hrd = new hrd();
        // ambil input dari user
        System.out.print("Nama: ");
        String nama = input.next();
        System.out.print("Jenis Kelamin: ");
        String jenisKelamin = input.next();
        System.out.print("Asal Kota: ");
        String AsalKota = input.next();
        System.out.print("Nomer Handphone: ");
        String noHandphone = input.next();

        hrd.updateDataHrd(idHrd, nama, jenisKelamin, AsalKota, noHandphone);
        System.out.println("Berhasil update");
    }


    //KARYAWAN
    private static void showDataKaryawan() throws SQLException {
        ResultSet daftarKaryawan = karyawan.getKaryawan();
        System.out.print("\n ID    NAMA   JENIS KELAMIN  ASAL KOTA    NO.HP      PERIODE    ID HRD   ID JABATAN \n");
        System.out.println("=======================================================================================");

        while (daftarKaryawan.next()) {
            System.out.print(daftarKaryawan.getInt("idkaryawan"));
            System.out.print("    ");
            System.out.print(daftarKaryawan.getString("nama"));
            System.out.print("    ");
            System.out.print(daftarKaryawan.getString("jeniskelamin"));
            System.out.print("    ");
            System.out.print(daftarKaryawan.getString("asalkota"));
            System.out.print("    ");
            System.out.print(daftarKaryawan.getString("nohandphone"));
            System.out.print("    ");
            System.out.print(daftarKaryawan.getInt("periode"));
            System.out.print("         ");
            System.out.print(daftarKaryawan.getInt("idhrd"));
            System.out.print("           ");
            System.out.print(daftarKaryawan.getInt("idjabatan"));
            System.out.print("           ");
            System.out.println();
        }
    }

    private static void insertKaryawan() {
        try {
            Scanner input = new Scanner(System.in);
            karyawan karyawan = new karyawan();
            hrd = new hrd();
            jabatan = new jabatan();
            // ambil input dari user
            System.out.print("Nama: ");
            String nama = input.next();
            System.out.print("Jenis Kelamin: ");
            String jenisKelamin = input.next();
            System.out.print("Asal Kota: ");
            String AsalKota = input.next();
            System.out.print("Nomer Handphone: ");
            String noHandphone = input.next();
            System.out.print("Periode: ");
            int periode = input.nextInt();
            System.out.print(" ");
            showDataHrd();
            System.out.print("Id HRD: ");
            int idHrd = input.nextInt();
            System.out.print("");
            showDataJabatan();
            System.out.println("Id Jabatan: ");
            int idJabatan = input.nextInt();

            if (nama.isEmpty()) {
                throw new Exception("Nama tidak boleh kosong");
            }
            if (jenisKelamin.isEmpty()) {
                throw new Exception("Jenis kelamin tidak boleh kosong");
            }
            if (AsalKota.isEmpty()) {
                throw new Exception("Asal Kota tidak boleh kosong");
            }
            if (noHandphone.isEmpty()) {
                throw new Exception("Nomer handphone tidak boleh kosong");
            }

            int result = karyawan.addKaryawan(nama, jenisKelamin, AsalKota, noHandphone, periode, idHrd, idJabatan);
            if (result > 0) {
                System.out.println("Berhasil update " + result + " baris.");
            }
        } catch (SQLException | Exception e) {
            System.out.println("terjadi kesalahan" + e.getMessage());
        }
    }

    public static void hapusDataKaryawan() throws SQLException {
        karyawan karyawan = new karyawan();
        karyawan.deleteKaryawan();
    }

    private static void ubahDataKaryawan() throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Karyawan yang Akan Diubah: ");
        int idKaryawan = input.nextInt();

        karyawan = new karyawan();
        hrd = new hrd();
        jabatan = new jabatan();
        // ambil input dari user
        System.out.print("Nama: ");
        String nama = input.next();
        System.out.print("Jenis Kelamin: ");
        String jenisKelamin = input.next();
        System.out.print("Asal Kota: ");
        String AsalKota = input.next();
        System.out.print("Nomer Handphone: ");
        String noHandphone = input.next();
        System.out.print("Periode: \n");
        int periode = input.nextInt();
        showDataHrd();
        System.out.print("Id HRD: \n");
        int idHrd = input.nextInt();
        showDataJabatan();
        System.out.print("Id Jabatan: ");
        int idJabatan = input.nextInt();

        karyawan.updateDataKaryawan(idKaryawan, nama, jenisKelamin, AsalKota, noHandphone, periode, idHrd, idJabatan);
        System.out.println("Berhasil update");
    }


    //Jabatan
    private static void showDataJabatan() throws SQLException {
        ResultSet daftarJabatan = jabatan.getJabatan();
        System.out.print("\nID   DIVISI   JABATAN  \n");
        System.out.println("=====================");

        while (daftarJabatan.next()) {
            System.out.print(daftarJabatan.getString("idjabatan"));
            System.out.print("    ");
            System.out.print(daftarJabatan.getString("divisi"));
            System.out.print("    ");
            System.out.print(daftarJabatan.getString("jabatan"));
            System.out.print("    ");
            System.out.println();
        }
    }

    private static void insertJabatan() {
        try {
            Scanner input = new Scanner(System.in);
            jabatan jabatan = new jabatan();

            String divisi, jbtan;
            // ambil input dari user
            System.out.print("Nama Divisi: ");
            divisi = input.next();
            System.out.print("Nama Jabatan: ");
            jbtan = input.next();
            int result = jabatan.addJabatan(divisi, jbtan);
            if (result > 0) {
                System.out.println("Berhasil update " + result + " baris.");
            }

        } catch (SQLException e) {
            System.out.println("terjadi kesalahan" + e.getMessage());
        }
    }

    public static void hapusDataJabatan() throws SQLException {
            jabatan jabatan = new jabatan();
            jabatan.deleteJabatan();
        }

    private static void ubahDataJabatan() throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Karyawan yang Akan Diubah: ");
        int idjabatan = input.nextInt();

        jabatan = new jabatan();
        // ambil input dari user
        System.out.print("Divisi: ");
        String divisi = input.next();
        System.out.print("Jabatan: ");
        String Jabatan = input.next();

        jabatan.updateDataJabatan(idjabatan, divisi, Jabatan);
        System.out.println("Berhasil update");

    }

    // absensi
    private static void showDataAbsensi() throws SQLException {
        ResultSet daftarAbsensi = absensi.getAbsensi();
        System.out.print("\nID ABSENSI ID KARYAWAN   SAKIT   MASUK   IZIN   CUTI  JAM LEMBUR    \n");
        System.out.println("===============================================================");

        while (daftarAbsensi.next()) {
            System.out.print(daftarAbsensi.getString("idabsensi"));
            System.out.print("           ");
            System.out.print(daftarAbsensi.getString("idkaryawan"));
            System.out.print("            ");
            System.out.print(daftarAbsensi.getString("sakit"));
            System.out.print("        ");
            System.out.print(daftarAbsensi.getString("masuk"));
            System.out.print("        ");
            System.out.print(daftarAbsensi.getString("izin"));
            System.out.print("        ");
            System.out.print(daftarAbsensi.getString("cuti"));
            System.out.print("     ");
            System.out.print(daftarAbsensi.getString("jamlembur"));
            System.out.print("       ");
            System.out.println();
        }
    }

    private static void insertAbsensi() {
        try {
            Scanner input = new Scanner(System.in);
            absensi absensi = new absensi();
            // ambil input dari user
            System.out.print("\nMasukan Id Karyawan: ");
            int idKaryawan = input.nextInt();
            System.out.print("Berapa Hari Sakit: ");
            int sakit = input.nextInt();
            System.out.print("Berapa Hari masuk: ");
            int masuk = input.nextInt();
            System.out.print("Berapa Hari Izin: ");
            int izin = input.nextInt();
            System.out.print("Bearapa Hari Cuti Dalam Sebulan: ");
            int cuti = input.nextInt();
            System.out.print("Berapa Jam Lembur dalam Sebulan: ");
            int jamLembur = input.nextInt();

            int result = absensi.addAbsensi(sakit, masuk, izin, cuti, jamLembur, idKaryawan);
            if (result > 0) {
                System.out.println("Berhasil Menambahkan Data " + result + " baris.");
            }

        } catch (SQLException e) {
            System.out.println("terjadi kesalahan" + e.getMessage());
        }
    }

    public static void hapusDataAbsensi() throws SQLException {
        absensi absensi = new absensi();
        absensi.deleteAbsensi();
    }

    private static void ubahDataAbsensi() throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Absensi yang Akan Diubah: ");
        int idAbsensi = input.nextInt();

        karyawan = new karyawan();
        absensi = new absensi();
        // ambil input dari user
        showDataKaryawan();
        System.out.print("\nMasukan Id Karyawan: ");
        int idKaryawan = input.nextInt();
        System.out.print("Berapa Hari Sakit: ");
        int sakit = input.nextInt();
        System.out.print("Berapa Hari masuk: ");
        int masuk = input.nextInt();
        System.out.print("Berapa Hari Izin: ");
        int izin = input.nextInt();
        System.out.print("Bearapa Hari Cuti Dalam Sebulan: ");
        int cuti = input.nextInt();
        System.out.print("Berapa Jam Lembur dalam Sebulan: ");
        int jamLembur = input.nextInt();

        absensi.updateDataAbsensi(idAbsensi, sakit, masuk, izin, cuti, jamLembur, idKaryawan);
        System.out.println("Berhasil update");

    }


    //Gaji
    private static void showDataGaji() throws SQLException {
        ResultSet daftarGaji = gaji.getGaji();
        System.out.print("\nID GAJI  ID KARYAWAN   GOLONGAN    GAJI POKOK    TUNJANGAN   CICILAN    \n");
        System.out.println("=======================================================================");

        while (daftarGaji.next()) {
            System.out.print(daftarGaji.getString("idgaji"));
            System.out.print("           ");
            System.out.print(daftarGaji.getString("idkaryawan"));
            System.out.print("           ");
            System.out.print(daftarGaji.getString("golongan"));
            System.out.print("        ");
            System.out.print(daftarGaji.getString("gajipokok"));
            System.out.print("      ");
            System.out.print(daftarGaji.getString("tunjangan"));
            System.out.print("        ");
            System.out.print(daftarGaji.getString("cicilanpinjaman"));
            System.out.print("       ");
            System.out.println();
        }
    }

    private static void insertgaji() {
        try {
            Scanner input = new Scanner(System.in);
            gaji gaji = new gaji();

            int golongan, gajiPokok, tunjangan, cicilanPinjaman, idkaryawan;
            System.out.print("\nMasukan Id Karyawan : ");
            idkaryawan = input.nextInt();
            System.out.print("Masukan Golongan : ");
            golongan = input.nextInt();

            switch (golongan) {
                case 1:
                    gajiPokok = 1800000;
                    tunjangan = 250000;
                    break;
                case 2:
                    gajiPokok = 2100000;
                    tunjangan = 300000;
                    break;
                case 3:
                    gajiPokok = 2500000;
                    tunjangan = 350000;
                    break;
                case 4:
                    gajiPokok = 3000000;
                    tunjangan = 400000;
                    break;
                default:
                    gajiPokok = 0;
                    tunjangan = 0;
            }

            System.out.print("Cicilan Pinjaman : ");
            cicilanPinjaman = input.nextInt();

            int result = gaji.addGaji (golongan, gajiPokok, tunjangan, cicilanPinjaman, idkaryawan);
            if (result > 0) {
                System.out.println("Berhasil update " + result + " baris.");
            }
        } catch (SQLException e) {
            System.out.println("terjadi kesalahan" + e.getMessage());
        }
    }

    public static void hapusDataGaji() throws SQLException {
        gaji gaji = new gaji();
        gaji.deleteGaji();
    }


    //Cetak Gaji
    public static void cetakGaji() throws SQLException {
        Scanner input = new Scanner(System.in);
        karyawan = new karyawan();
        hrd = new hrd();
        absensi = new absensi();
        jabatan = new jabatan();
        gaji = new gaji();

        DecimalFormat kurs_indonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kurs_indonesia.setDecimalFormatSymbols(formatRp);


        String namaKaryawan, namaHrd, jabatan, divisi, asalKota, noHandphone;
        int idkaryawan, sakit, izin, cuti, jamLembur, gajiPokok, bonus, tunjangan, cicilan, potAbsen, gajiBersih;

        showDataKaryawan();
        System.out.print("\nmasukan Id Karyawan: ");
        idkaryawan = input.nextInt();
        System.out.print("masukan Nama karyawan: ");
        namaKaryawan = input.next();
        System.out.print("masukan Asal kota: ");
        asalKota = input.next();
        System.out.print("masukan No Handphone: ");
        noHandphone = input.next();

        showDataJabatan();
        System.out.print("\nmasukan jabatan: ");
        jabatan = input.next();
        System.out.print("masukan divisi: ");
        divisi = input.next();

        showDataHrd();
        System.out.print("\nmasukan nama HRD: ");
        namaHrd = input.next();

        showDataAbsensi();
        System.out.print("\nmasukan berapa hari sakit: ");
        sakit = input.nextInt();
        System.out.print("masukan berapa hari izin: ");
        izin = input.nextInt();
        System.out.print("masukan berapa hari cuti dalam sebulan: ");
        cuti = input.nextInt();
        System.out.print("masukan berapa jam lembur dalam sebulan: ");
        jamLembur = input.nextInt();

        showDataGaji();
        System.out.print("\nmasukan Gaji Pokok: ");
        gajiPokok = input.nextInt();
        bonus = jamLembur * 20000;
        System.out.print("masukan tunjangan: ");
        tunjangan = input.nextInt();
        System.out.print("masukan cicilan ke perusahaan: ");
        cicilan = input.nextInt();
        potAbsen = (((izin)+(sakit)+(cuti))*70000);

        System.out.print("\n============RINCIAN SLIP GAJI============\n");
        System.out.println("ID Karyawab: " + idkaryawan + "\t\t\t\t " + "Alamat: " + asalKota);
        System.out.println("Nama: " + namaKaryawan + "\t\t\t\t\t " + "No.HP: " + noHandphone);
        System.out.println("Jabatan: " + jabatan + " (" + divisi + ")");

        System.out.println("\nPENGHASILAN");
        System.out.println("gaji Pokok = "+ kurs_indonesia.format(gajiPokok));
        System.out.println("Tunjangan  = "+ kurs_indonesia.format(tunjangan));
        System.out.println("Bonus      = "+ kurs_indonesia.format(bonus));

        System.out.println("\nPOTONGAN");
        System.out.println("Cicilan        = "+ kurs_indonesia.format(cicilan));
        System.out.println("Potongan Absen = "+ kurs_indonesia.format(potAbsen));
        gajiBersih =(((gajiPokok) + (tunjangan) + (bonus)) - ((cicilan) + (potAbsen)));

        System.out.println("------------------------------------------------");
        System.out.println("PENERIMAAN BERSIH: " + kurs_indonesia.format(gajiBersih) );
        System.out.println("\n \n \n \t\t\t\t\t\t\t\t\t\t HRD" );
        System.out.println("\n \n \t\t\t\t\t\t\t\t\t\t" + namaHrd );

    }
}
