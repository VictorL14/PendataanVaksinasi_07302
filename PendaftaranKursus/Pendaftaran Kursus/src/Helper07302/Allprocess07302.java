package Helper07302;
import Controller07302.SiswaController07302;
import Entity07302.DataSiswa07302;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class Allprocess07302 {
    public static SiswaController07302 data07302 = new SiswaController07302();
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input07302 = new BufferedReader(inputStreamReader);
    static Scanner scan07302 = new Scanner(System.in);
    static Statement stmt;
    static Connection conn07302;
    static String url = "jdbc:mysql://localhost:3306/db_kursusinggris";
    static String user = "root";
    static String pass = "";

    public static void procc07302(){
        try {
            conn07302 = DriverManager.getConnection(url, user, pass);
            stmt = conn07302.createStatement();
            while (!conn07302.isClosed()) {
                showMenu07302();
            }
            stmt.close();
            conn07302.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showMenu07302() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("0. Exit");
        System.out.println();
        System.out.print("PILIHAN> ");
        int pilihan = scan07302.nextInt();
        switch (pilihan) {
            case 0:
                System.out.println("Berhasil EXIT");
                System.exit(0);
                break;
            case 1:
                insert07302();
                break;
            case 2:
                showData07302();
                break;
            case 3:
                update07302();
                break;
            case 4:
                delete07302();
                break;
            default:
                System.out.println("Pilihan salah!");
        }
    }

    static void insert07302() {
        try {
            System.out.print("Nama: ");
            String nama07302 = input07302.readLine().trim();
            System.out.print("Kelas: ");
            String kelas07302 = input07302.readLine().trim();
            System.out.print("NoInduk: ");
            String induk07302 = input07302.readLine().trim();
            String sql = "INSERT INTO siswa (nama, kelas, induk) VALUE('%s', '%s', '%s')";
            sql = String.format(sql, nama07302, kelas07302, induk07302);
            stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showData07302(){
        for (DataSiswa07302 siswa07302 : data07302.getDataSiswa07302()){
            System.out.println("-------------------------------------------------------");
            System.out.println("id= " + siswa07302.getId());
            System.out.println("nama= " + siswa07302.getNama());
            System.out.println("kelas = " + siswa07302.getKelas());
            System.out.println("induk = " + siswa07302.getInduk());
        }
    }

    static void update07302() {
        try {
            System.out.print("Masukan nama dari data Yang ingin diedit: ");
            int idsiswa = Integer.parseInt(input07302.readLine());
            System.out.print("Nama: ");
            String nama07302 = input07302.readLine().trim();
            System.out.print("Kelas: ");
            String kelas07302 = input07302.readLine().trim();
            System.out.print("NoInduk: ");
            String induk07302 = input07302.readLine().trim();
            String sql = String.format("UPDATE siswa SET nama='%s', kelas='%s' , induk='%s' WHERE id=%d", nama07302, kelas07302, induk07302, idsiswa);
            stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void delete07302() {
        try {
            System.out.print("ID yang mau dihapus: ");
            int id07302 = Integer.parseInt(input07302.readLine());
            String sql = String.format("DELETE FROM siswa WHERE id=%d", id07302);
            stmt.execute(sql);
            System.out.println("Data telah terhapus...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
