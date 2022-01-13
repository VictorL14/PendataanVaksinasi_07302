package Model07302;

import Entity07302.DataSiswa07302;
import Helper07302.KoneksiDB07302;
import java.sql.*;
import java.util.ArrayList;
public class SiswaModel07302 {
        private String sql07302;
        public Connection conn07302 = KoneksiDB07302.getconection();

        public ArrayList<DataSiswa07302> getSiswa07302(){
            ArrayList<DataSiswa07302> siswa = new ArrayList<>();
            try {
                Statement stat = conn07302.createStatement();
                sql07302 = "SELECT * FROM siswa";
                ResultSet rs = stat.executeQuery(sql07302);
                while (rs.next()){
                    DataSiswa07302 kursus = new DataSiswa07302();
                    kursus.setId(rs.getInt("id"));
                    kursus.setNama(rs.getString("nama"));
                    kursus.setKelas(rs.getString("kelas"));
                    kursus.setInduk(rs.getString("induk"));
                    siswa.add(kursus);
                }
            }catch (SQLException e){
                System.out.println(e);
            }
            return siswa;
        }

    public ArrayList<DataSiswa07302> getsiswa07302(int id07302){
        ArrayList<DataSiswa07302> arrsiswa07302 = new ArrayList<>();
        try {
            sql07302 = "SELECT * FROM siswa where id =?";
            PreparedStatement stat = conn07302.prepareStatement(sql07302);
            stat.setInt(1, id07302);
            ResultSet rs = stat.executeQuery();
            while (rs.next()){
                DataSiswa07302 siswa07302 = new DataSiswa07302();
                siswa07302.setId(rs.getInt("id"));
                siswa07302.setNama(rs.getString("nama"));
                siswa07302.setKelas(rs.getString("kelas"));
                siswa07302.setInduk(rs.getString("induk"));
                arrsiswa07302.add(siswa07302);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return arrsiswa07302;
    }


    public void insertData07302(DataSiswa07302 DataSiswa07302){
        try {
            sql07302 = "INSERT INTO siswa (nama, kelas, induk) VALUE(?, ?, ?)";
            PreparedStatement stat = conn07302.prepareStatement(sql07302);
            stat.setString(1,DataSiswa07302.getNama());
            stat.setString(2,DataSiswa07302.getKelas());
            stat.setString(3,DataSiswa07302.getInduk());
            int rows = stat.executeUpdate();
            System.out.println(rows + " row(s) updated!!");
        }catch (SQLException e){
            System.out.println("GAGAL INPUT DATA!!");
            e.printStackTrace();
        }
    }

    public void updateNama07302(String nama07302, int id07302){
        try {
            sql07302 = "update siswa SET nama =? WHERE id =?";
            PreparedStatement stat = conn07302.prepareStatement(sql07302);
            stat.setString(1,nama07302);
            stat.setInt(2,id07302);
            stat.executeUpdate();
        }catch (SQLException e){
            System.out.println("GAGAL UBAH NAMA!!");
            e.printStackTrace();
        }
    }

    public void updateKelas07302(String kelas07302, int id07302){
        try {
            sql07302 = "update siswa SET kelas =? WHERE id =?";
            PreparedStatement stat = conn07302.prepareStatement(sql07302);
            stat.setString(1,kelas07302);
            stat.setInt(2,id07302);
            stat.executeUpdate();
        }catch (SQLException e){
            System.out.println("GAGAL UBAH KELAS!!");
            e.printStackTrace();
        }
    }

    public void updateInduk07302(String alamat07302, int id07302){
        try {
            sql07302 = "update siswa SET induk =? WHERE id =?";
            PreparedStatement stat = conn07302.prepareStatement(sql07302);
            stat.setString(1,alamat07302);
            stat.setInt(2,id07302);
            stat.executeUpdate();
        }catch (SQLException e){
            System.out.println("GAGAL UBAH NoInduk!!");
            e.printStackTrace();
        }
    }

    public void delete07302(int id07302){
        try {
            sql07302 = "DELETE FROM siswa where id =?";
            PreparedStatement stat = conn07302.prepareStatement(sql07302);
            stat.setInt(1,id07302);
            stat.executeUpdate();
        }catch (SQLException e){
            System.out.println("GAGAL HAPUS" + " DATA!!");
            e.printStackTrace();
        }
    }
}
