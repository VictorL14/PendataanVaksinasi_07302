package Model07302;
import Helper07302.KoneksiDb07302;
import Entity07302.PendudukEntity07302;
import java.sql.*;
import java.util.ArrayList;
public class PendudukModel07302 {
    private String sql;
    Connection conn = KoneksiDb07302.getconnection();

    public ArrayList<PendudukEntity07302>getPenduduk(){
        ArrayList<PendudukEntity07302> arraypenduduk = new ArrayList<>();
        try {
            Statement stat = conn.createStatement();
            sql = "SELECT * FROM penduduk";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                PendudukEntity07302 pendudukEntity = new PendudukEntity07302();
                pendudukEntity.setId(rs.getInt("id"));
                pendudukEntity.setNik(rs.getString("nik"));
                pendudukEntity.setNama(rs.getString("nama"));
                pendudukEntity.setAlamat(rs.getString("alamat"));
                pendudukEntity.setNoTelp(rs.getString("noTelp"));
                pendudukEntity.setDosis(rs.getString("dosis"));
                pendudukEntity.setJns_vaksin(rs.getString("jns_vaksin"));
                arraypenduduk.add(pendudukEntity);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return arraypenduduk;
    }

    public ArrayList<PendudukEntity07302>getPenduduk(int id){
        ArrayList<PendudukEntity07302> listpenduduk = new ArrayList<>();
        try {
            sql = "SELECT * FROM penduduk where id = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1,id);
            ResultSet rs = stat.executeQuery();
            while (rs.next()){
                PendudukEntity07302 pendudukEntity = new PendudukEntity07302();
                pendudukEntity.setId(rs.getInt("id"));
                pendudukEntity.setNik(rs.getString("nik"));
                pendudukEntity.setNama(rs.getString("nama"));
                pendudukEntity.setAlamat(rs.getString("alamat"));
                pendudukEntity.setNoTelp(rs.getString("noTelp"));
                pendudukEntity.setDosis(rs.getString("dosis"));
                pendudukEntity.setJns_vaksin(rs.getString("jns_vaksin"));
                listpenduduk.add(pendudukEntity);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }return listpenduduk;
    }

    public void insertData(PendudukEntity07302 PendudukEntity){
        try {
            sql = "INSERT INTO penduduk (nik, nama, alamat, noTelp, dosis, jns_vaksin) Values(?,?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, PendudukEntity.getNik());
            stat.setString(2, PendudukEntity.getNama());
            stat.setString(3, PendudukEntity.getAlamat());
            stat.setString(4, PendudukEntity.getNoTelp());
            stat.setString(5, PendudukEntity.getDosis());
            stat.setString(6, PendudukEntity.getJns_vaksin());
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e){
            System.out.println("Gagal Input Data");
            e.printStackTrace();
        }
    }

    public int updatenoTelp(String noTelp, int id){
        try {
            sql = "update penduduk SET noTelp =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,noTelp);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        }catch (SQLException e){
            System.out.println("Gagal Update noTelp");
            e.printStackTrace();
        }
        return id;
    }

    public void updateDosis(String dosis, int id){
        try {
            sql = "update penduduk SET dosis =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,dosis);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        }catch (SQLException e){
            System.out.println("Gagal Update noTelp");
            e.printStackTrace();
        }
    }
    public int cekData(String nik){
        int cek = 0;
        try {
            sql = "SELECT * FROM penduduk WHERE nik =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,nik);
            ResultSet rs = stat.executeQuery();
            if (rs.next()){
                cek = rs.getInt("id");
            }else{
                cek = 0;
            }
        } catch (SQLException e) {
            System.out.println("Gagal Update Nik!!!");
            e.printStackTrace();
        }
        return cek;
    }

}
