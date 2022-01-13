package Controller07302;
import Entity07302.PendudukEntity07302;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
public class PendudukController07302 {
    public void insertData(String nik,String nama, String alamat, String noTelp, String dosis, String jns_vaksin){
        PendudukEntity07302 pddkety = new PendudukEntity07302();
        pddkety.setNik(nik);
        pddkety.setNama(nama);
        pddkety.setAlamat(alamat);
        pddkety.setNoTelp(noTelp);
        pddkety.setDosis(dosis);
        pddkety.setJns_vaksin(jns_vaksin);
        AllObjectModel07302.pendudukModel.insertData(pddkety);
    }

    public DefaultTableModel daftarPenduduk(){
        DefaultTableModel datadaftarpenduduk = new DefaultTableModel();
        Object[] kolompenduduk = {"id", "nik", "nama", "alamat", "noTelp", "dosis", "jns_vaksin"};
        datadaftarpenduduk.setColumnIdentifiers(kolompenduduk);
        int size = getDataPenduduk().size();
        for (int i = 0; i< size; i++){
            Object[] data = new Object[8];
            data[0] = AllObjectModel07302.pendudukModel.getPenduduk().get(i).getId();
            data[1] = AllObjectModel07302.pendudukModel.getPenduduk().get(i).getNik();
            data[2] = AllObjectModel07302.pendudukModel.getPenduduk().get(i).getNama();
            data[3] = AllObjectModel07302.pendudukModel.getPenduduk().get(i).getAlamat();
            data[4] = AllObjectModel07302.pendudukModel.getPenduduk().get(i).getNoTelp();
            data[5] = AllObjectModel07302.pendudukModel.getPenduduk().get(i).getDosis();
            data[6] = AllObjectModel07302.pendudukModel.getPenduduk().get(i).getJns_vaksin();
            datadaftarpenduduk.addRow(data);
        }
        return datadaftarpenduduk;
    }
    public void delete07302(int id07302){
        AllObjectModel07302.pendudukModel.delete07302(id07302);
    }


    public void updateDosis(int i, String dosis, int id){
        AllObjectModel07302.pendudukModel.updateDosis(dosis,id);
    }
    public void updateNoTelp(String noTelp, int id){
        AllObjectModel07302.pendudukModel.updateNoTelp(noTelp,id);
    }
    public ArrayList<PendudukEntity07302> getDataPenduduk(int id) {
        return AllObjectModel07302.pendudukModel.getPenduduk(id);
    }
    public ArrayList<PendudukEntity07302> getDataPenduduk() {
        return AllObjectModel07302.pendudukModel.getPenduduk();
    }
    public int CekData(String nik){
        int cek = AllObjectModel07302.pendudukModel.cekData(nik);
        return cek;
    }

    //public void updateDosis(String dosis, int id) {
    //}
}
