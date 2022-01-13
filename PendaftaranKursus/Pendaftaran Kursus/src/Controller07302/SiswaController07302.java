package Controller07302;
import Entity07302.DataSiswa07302;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
public class SiswaController07302 {
    public ArrayList<DataSiswa07302> getDataSiswa07302(){
        return AllObjectModel07302.siswamodel.getSiswa07302();
    }
    public void insertData0730(String nama07302, String kelas07302, String noinduk07302){
        DataSiswa07302 siswaEntity07302 = new DataSiswa07302();
        siswaEntity07302.setNama(nama07302);
        siswaEntity07302.setKelas(kelas07302);
        siswaEntity07302.setInduk(noinduk07302);
        AllObjectModel07302.siswamodel.insertData07302(siswaEntity07302);
    }

    public DefaultTableModel daftarSiswa07302(){
        DefaultTableModel dataDaftarSiswa07302 = new DefaultTableModel();
        Object[] kolom07302 = {"id", "nama", "kelas" ,"induk"};
        dataDaftarSiswa07302.setColumnIdentifiers(kolom07302);
        int size07302 = getDataSiswa07302().size();
        for (int i07302 = 0; i07302 < size07302; i07302++){
            Object[] data07302 = new Object[5];
            data07302[0] = AllObjectModel07302.siswamodel.getSiswa07302().get(i07302).getId();
            data07302[1] = AllObjectModel07302.siswamodel.getSiswa07302().get(i07302).getNama();
            data07302[2] = AllObjectModel07302.siswamodel.getSiswa07302().get(i07302).getKelas();
            data07302[3] = AllObjectModel07302.siswamodel.getSiswa07302().get(i07302).getInduk();
            dataDaftarSiswa07302.addRow(data07302);
        }
        return dataDaftarSiswa07302;
    }

    public void updateData07302(int urut07302, String data07302, int id07302){
        switch (urut07302){
            case 1:
                AllObjectModel07302.siswamodel.updateNama07302(data07302,id07302);
                break;
            case 2:
                AllObjectModel07302.siswamodel.updateKelas07302(data07302,id07302);
                break;
            case 3:
                AllObjectModel07302.siswamodel.updateInduk07302(data07302,id07302);
                break;
        }
    }

    public ArrayList<DataSiswa07302> getByid07302(int cek07302){
        return AllObjectModel07302.siswamodel.getsiswa07302(cek07302);
    }

    public void delete07302(int id07302){
        AllObjectModel07302.siswamodel.delete07302(id07302);
    }

}
