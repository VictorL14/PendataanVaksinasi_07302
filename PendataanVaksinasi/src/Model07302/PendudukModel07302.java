package Model07302;
import Entity07302.PendudukEntity07302;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class PendudukModel07302 extends ModelAbstract07302 {
    private String sql;
    public void insertData(PendudukEntity07302 pendudukEntity07302){
        try{
            sql = "INSERT INTO penduduk(nik, nama, alamat, noTelp, dosis, jns_vaksin)" +
                    "VALUE(?,?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, pendudukEntity07302.getNik());
            stat.setString(2, pendudukEntity07302.getNama());
            stat.setString(3, pendudukEntity07302.getAlamat());
            stat.setString(4, pendudukEntity07302.getNoTelp());
            stat.setString(5, pendudukEntity07302.getDosis());
            stat.setString(6, pendudukEntity07302.getJns_vaksin());
            stat.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void updateDosis(String dosis, int id){
        try{
            sql = "UPDATE penduduk SET dosis = ? WHERE id = ? ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, dosis);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows+" row(s) updated ");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList<PendudukEntity07302> getPenduduk(int id){
        ArrayList<PendudukEntity07302> arrPenduduk = new ArrayList<>();
        try{
            sql = "SELECT * FROM penduduk where id = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                PendudukEntity07302 pendudukEntity07302 = new PendudukEntity07302();
                pendudukEntity07302.setId(rs.getInt("id"));
                pendudukEntity07302.setNama(rs.getString("nama"));
                pendudukEntity07302.setAlamat(rs.getString("alamat"));
                pendudukEntity07302.setNoTelp(rs.getString("noTelp"));
                pendudukEntity07302.setNik(rs.getString("nik"));
                pendudukEntity07302.setDosis(rs.getString("dosis"));
                pendudukEntity07302.setJns_vaksin(rs.getString("jns_vaksin"));
                arrPenduduk.add(pendudukEntity07302);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return arrPenduduk;
    }

    public ArrayList<PendudukEntity07302> getPenduduk(){
        ArrayList<PendudukEntity07302> arrPenduduk = new ArrayList<>();
        try{sql = "SELECT * FROM penduduk";
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                PendudukEntity07302 pendudukEntity07302 = new PendudukEntity07302();
                pendudukEntity07302.setId(rs.getInt("id"));
                pendudukEntity07302.setNama(rs.getString("nama"));
                pendudukEntity07302.setAlamat(rs.getString("alamat"));
                pendudukEntity07302.setNoTelp(rs.getString("noTelp"));
                pendudukEntity07302.setNik(rs.getString("nik"));
                pendudukEntity07302.setDosis(rs.getString("dosis"));
                pendudukEntity07302.setJns_vaksin(rs.getString("jns_vaksin"));
                arrPenduduk.add(pendudukEntity07302);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return arrPenduduk;
    }

    @Override
    public void updatenoTelp(String noTelp, int id) {
        try{
            sql = "UPDATE penduduk SET noTelp = ? WHERE id = ? ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, noTelp);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows+" row(s) updated ");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateNoTelp(String noTelp, int id){
        try{
            sql = "UPDATE penduduk SET noTelp = ? WHERE id = ? ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, noTelp);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows+" row(s) updated ");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void delete07302(int id){
        try {
            sql = "DELETE FROM penduduk where id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1,id);
            stat.executeUpdate();
        }catch (SQLException e){
            System.out.println("GAGAL HAPUS" + " DATA!!");
            e.printStackTrace();
        }
    }

    public int cekData(String nik){
        int cek = 0;
        try{
            sql = "SELECT * FROM penduduk WHERE nik = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,nik);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                cek = rs.getInt("id");
            }else {cek = 0;}
        }catch (SQLException e){
            e.printStackTrace();
        }
        return cek;
    }
}
