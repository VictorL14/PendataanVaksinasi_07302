package Entity07302;
public class PendudukEntity07302 extends UserEntityAbstract07302 {
    public String nik, dosis, jns_vaksin;
    public PendudukEntity07302(){}
    @Override
    public int getId() {
        return super.getId();
    }
    @Override
    public void setId(int id) {
        super.setId(id);
    }
    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getDosis() {
        return dosis;
    }
    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    public String getJns_vaksin() {
        return jns_vaksin;
    }
    public void setJns_vaksin(String jns_vaksin) {
        this.jns_vaksin = jns_vaksin;
    }
}
