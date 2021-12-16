package Model07302;
import Entity07302.AdminEntity07302;
import Helper07302.KoneksiDb07302;
import java.util.ArrayList;
import java.sql.*;
public class AdminModel07302 {
    private String sql;
    Connection conn = KoneksiDb07302.getconnection();
    public void insertData(AdminEntity07302 adminEntity){
        try {
            sql = "INSERT INTO admin (nip, nama, alamat, password, noTelp) Values(?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, adminEntity.getNip());
            stat.setString(2, adminEntity.getNama());
            stat.setString(3, adminEntity.getAlamat());
            stat.setString(4, adminEntity.getPassword());
            stat.setString(5, adminEntity.getNoTelp());
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e){
            System.out.println("Gagal Input Data");
            e.printStackTrace();
        }
    }

    public void updatePassword(String password, int id){
        try {
            sql = "update admin SET password =? WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,password);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        }catch (SQLException e){
            System.out.println("Gagal Update noTelp");
            e.printStackTrace();
        }
    }

    public int updatenoTelp(String noTelp, int id){
        try {
            sql = "update admin SET noTelp =? WHERE id =?";
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

    public int cekLogin(String nip, String password){
        int cek = 0;
        try {
            sql = "SELECT * FROM admin WHERE nip =? and password = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,nip);
            stat.setString(2,password);
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

    public void deleteData(int id){
        try {
            sql = "DELETE FROM admin WHERE id =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            int rows = stat.executeUpdate();
            System.out.println(rows + "row(s) updated!");
        } catch (SQLException e) {
            System.out.println("Gagal Hapus!!!");
            e.printStackTrace();
        }
    }
}



