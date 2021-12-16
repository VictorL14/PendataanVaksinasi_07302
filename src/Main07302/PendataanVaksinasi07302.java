package Main07302;
import Controller07302.*;
import Entity07302.PendudukEntity07302;
import java.util.Scanner;
public class PendataanVaksinasi07302 {
    public static Scanner input = new Scanner(System.in);
    public static AdminController07302 admin = new AdminController07302();
    public static PendudukController07302 penduduk = new PendudukController07302();
    public static void main(String[] args){
        int pilih;
        do{
            System.out.println("PENDATAAN VAKSINASI");
            System.out.println("1. Registasi");
            System.out.println("2. Login");
            System.out.println("3. Keluar");
            pilih = input.nextInt();
            switch (pilih){
                case 1:
                    insertData();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Berhasil keluar");
            }
        }while (pilih <= 2);
    }

    static void insertData(){
        System.out.println("nik =");
        String nik = input.next();
        System.out.println("nama =");
        String nama = input.next();
        System.out.println("alamat =");
        String alamat = input.next();
        System.out.println("noTelp =");
        String noTelp = input.next();
        System.out.println("dosis =");
        String dosis = input.next();
        System.out.println("jns_vaksin =");
        String jns_vaksin = input.next();
        penduduk.insertData(nik, nama, alamat, noTelp, dosis, jns_vaksin);
    }

    public static void login(){
        int pilih;
        do{
            System.out.println("1. Login Admin");
            System.out.println("2. keluar");
            pilih = input.nextInt();
            if(pilih == 1) {
                loginAdmin();
            }else if(pilih == 2){
                System.out.println("KELUAR");
            }else{
                System.out.println("inputan salah");
            }
        }while (pilih<=2);
    }

    static void loginAdmin(){
        System.out.println("nip : ");
        String nip = input.next();
        System.out.println("password : ");
        String pass = input.next();
        int cek = admin.login(nip, pass);
        if(cek != 0){
            System.out.println("berhasil login");
        }else{

            System.out.println("gagal login");
        }
    }


    static void showData(){//MENAMPILKAN DATA PENDUDUK
        for (PendudukEntity07302 pendudukentities : penduduk.getDataPenduduk()){
            System.out.println("======================================");
            System.out.println("ID           = " + pendudukentities.getId());
            System.out.println("NIK          = " + pendudukentities.getNik());
            System.out.println("Nama         = " + pendudukentities.getNama());
            System.out.println("Alamat       = " + pendudukentities.getAlamat());
            System.out.println("NoTelp       = " + pendudukentities.getNoTelp());
            System.out.println("Dosis        = " + pendudukentities.getDosis());
            System.out.println("Jenis Vaksin = " + pendudukentities.getJns_vaksin());
        }
    }

    static void showData(int id){//MENAMPILKAN DATA PENDUDUK
        for (PendudukEntity07302 pendudukentities : penduduk.getById(id)){
            System.out.println("======================================");
            System.out.println("ID           = " + pendudukentities.getId());
            System.out.println("NIK          = " + pendudukentities.getNik());
            System.out.println("Nama         = " + pendudukentities.getNama());
            System.out.println("Alamat       = " + pendudukentities.getAlamat());
            System.out.println("NoTelp       = " + pendudukentities.getNoTelp());
            System.out.println("Dosis        = " + pendudukentities.getDosis());
            System.out.println("Jenis Vaksin = " + pendudukentities.getJns_vaksin());
        }
    }

    static void deleteData(){
        showData();
        System.out.println("Hapus id : ");
        int id = input.nextInt();
        admin.deleteData(id);
    }

    static void updatedosispenduduk(int id){
        System.out.println("Masukkan Dosis Baru : ");
        String dos = input.next();
        penduduk.updateDosis(dos, id);
    }

    static void updatenotelppenduduk(int id){
        System.out.println("Masukkan noTelp Baru :");
        String tel = input.next();
        penduduk.updatenoTelp(tel, id);
    }

    static void updatepasswordadmin(int id){
        System.out.println("Masukkan Password Baru : ");
        String pas = input.next();
        admin.updatePassword(pas, id);
    }

    static void updatenotelpadmin(int id) {
        System.out.println("Masukkan noTelp Baru :");
        String tel = input.next();
        admin.updatenoTelp(tel, id);
    }
}
