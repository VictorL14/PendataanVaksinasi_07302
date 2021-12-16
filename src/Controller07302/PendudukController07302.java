package Controller07302;
import Entity07302.PendudukEntity07302;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
public class PendudukController07302 {
    public void insertData(String nik, String nama, String alamat, String noTelp, String dosis, String jns_vaksin){
        PendudukEntity07302 pendudukEntities = new PendudukEntity07302();
        pendudukEntities.setNik(nik);
        pendudukEntities.setNama(nama);
        pendudukEntities.setAlamat(alamat);
        pendudukEntities.setNoTelp(noTelp);
        pendudukEntities.setDosis(dosis);
        pendudukEntities.setJns_vaksin(jns_vaksin);
        AllObjectModel07302.pendudukModel.insertData(pendudukEntities);
    }
    public void updateDosis(String dosis, int id){
        AllObjectModel07302.pendudukModel.updateDosis(dosis, id);
    }
    public void updatenoTelp(String noTelp, int id){
        AllObjectModel07302.pendudukModel.updatenoTelp(noTelp, id);
    }
    public ArrayList<PendudukEntity07302>getDataPenduduk(){
        return AllObjectModel07302.pendudukModel.getPenduduk();
    }
    public int data(String nik){
        AllObjectModel07302.pendudukModel.cekData(nik);
        return 0;
    }
    public ArrayList<PendudukEntity07302>getById(int cekdata){
        return AllObjectModel07302.pendudukModel.getPenduduk(cekdata);
    }
    public DefaultTableModel daftarPenduduk(){
        DefaultTableModel dataDaftarPenduduk = new DefaultTableModel();
        Object[] kolom = {"ID","NIK","NAMA","ALAMAT","NOTELP","DOSIS","JNS_VAKSIN"};
        dataDaftarPenduduk.setColumnIdentifiers(kolom);

        int size = getDataPenduduk().size();
        for(int i = 0; i < size;i++){
            Object[] data = new Object[7];
            data[0] = AllObjectModel07302.pendudukModel.getPenduduk().get(i).getId();
            data[1] = AllObjectModel07302.pendudukModel.getPenduduk().get(i).getNik();
            data[2] = AllObjectModel07302.pendudukModel.getPenduduk().get(i).getNama();
            data[3] = AllObjectModel07302.pendudukModel.getPenduduk().get(i).getAlamat();
            data[4] = AllObjectModel07302.pendudukModel.getPenduduk().get(i).getNoTelp();
            data[5] = AllObjectModel07302.pendudukModel.getPenduduk().get(i).getDosis();
            data[6] = AllObjectModel07302.pendudukModel.getPenduduk().get(i).getJns_vaksin();
            dataDaftarPenduduk.addRow(data);
        }
        return dataDaftarPenduduk;
    }
}
