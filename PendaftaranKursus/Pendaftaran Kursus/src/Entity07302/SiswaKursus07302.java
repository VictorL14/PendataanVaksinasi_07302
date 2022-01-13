package Entity07302;
public abstract class SiswaKursus07302 {
    protected int id;
    protected String nama, kelas, induk;
    public SiswaKursus07302(){}
    public SiswaKursus07302(String nama, String kelas, String induk){
        this.nama = nama;
        this.kelas = kelas;
        this.induk = induk;
    }
    public int getId () {
        return id;
    }
    public void setId (int id){
        this.id = id;
    }
    public String getNama () {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getKelas () {
        return kelas;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public String getInduk() {
        return induk;
    }
    public void setInduk(String induk){
        this.induk = induk;
    }
}
