package Helper07302;

import java.sql.Connection;
import java.sql.DriverManager;

public class KoneksiDb07302 {
    public static Connection getconnection(){
        Connection conn = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_kursusinggris";
        String user = "root";
        String pass = "";
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Berhasil koneksi database");
        }catch (Exception e){
            System.out.println("Gagal Koneksi Database");
            e.printStackTrace();
        }
        return conn;
    }
}
