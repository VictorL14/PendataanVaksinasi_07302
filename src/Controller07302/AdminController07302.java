package Controller07302;
import Entity07302.AdminEntity07302;
public class AdminController07302 {
    public void insertData(String nip, String nama, String alamat, String password, String noTelp){
        AdminEntity07302 adminentities = new AdminEntity07302();
        adminentities.setNip(nip);
        adminentities.setNama(nama);
        adminentities.setAlamat(alamat);
        adminentities.setPassword(password);
        adminentities.setNoTelp(noTelp);
        AllObjectModel07302.adminModel.insertData(adminentities);
    }

    public void updatePassword(String password, int id){
        AllObjectModel07302.adminModel.updatePassword(password, id);
    }

    public void updatenoTelp(String noTelp, int id){
        AllObjectModel07302.adminModel.updatenoTelp(noTelp, id);
    }

    public int login(String nip, String password){
        int log = AllObjectModel07302.adminModel.cekLogin(nip, password);
        return log;
    }

    public void deleteData(int id){
        AllObjectModel07302.adminModel.deleteData(id);
    }

}
