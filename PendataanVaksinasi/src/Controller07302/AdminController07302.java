package Controller07302;
public class AdminController07302 {
    public void updatePassword(String password, int id){
        AllObjectModel07302.adminModel07302.updatePassword(password,id);
    }
    public void updateNoTelp(String noTelp, int id){
        AllObjectModel07302.adminModel07302.updateNoTelp(noTelp,id);
    }
    public int cekLogin(String nip, String password){
       int login = AllObjectModel07302.adminModel07302.cekLogin(nip,password);
       return login;
    }
    public void deleteData(int id){
        AllObjectModel07302.adminModel07302.deleteData(id);
    }
}
