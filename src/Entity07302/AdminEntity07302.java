package Entity07302;

public class AdminEntity07302 extends UserEntityAbstract07302{
    private String nip;
    private String password;

    public AdminEntity07302(){};
    public AdminEntity07302(int id, String nip, String nama, String alamat, String password, String noTelp){
        this.nip = nip;
        this.password = password;
    }
    public String getNip() {
        return nip;
    }
    public String getPassword() {
        return password;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
