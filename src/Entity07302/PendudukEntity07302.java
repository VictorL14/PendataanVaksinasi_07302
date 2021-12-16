package Entity07302;

public class PendudukEntity07302 extends UserEntityAbstract07302{
    private String nik;
    private String dosis;
    private String jns_vaksin;

    public PendudukEntity07302(){};
    public PendudukEntity07302(int id, String nik, String nama, String alamat, String noTelp, String dosis, String jns_vaksin){
        this.nik = nik;
        this.dosis = dosis;
        this.jns_vaksin = jns_vaksin;
    }
    public String getNik() {
        return nik;
    }
    public String getDosis() {
        return dosis;
    }
    public String getJns_vaksin() {
        return jns_vaksin;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    public void setJns_vaksin(String jns_vaksin) {
        this.jns_vaksin = jns_vaksin;
    }
}
