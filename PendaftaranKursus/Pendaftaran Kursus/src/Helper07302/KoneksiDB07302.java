package Helper07302;
import java.sql.Connection;
import java.sql.DriverManager;
public class KoneksiDB07302 {
    public static Connection getconection(){
        Connection conn07302 = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_kursusinggris";
        String user = "root";
        String pass = "";
        try {
            Class.forName(driver);
            conn07302 = DriverManager.getConnection(url,user,pass);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn07302;
    }
}