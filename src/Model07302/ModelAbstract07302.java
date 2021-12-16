package Model07302;
import Helper07302.KoneksiDb07302;
import java.sql.Connection;
public abstract class ModelAbstract07302 {
    Connection conn = KoneksiDb07302.getconnection();
    public abstract int updatenoTelp(String noTelp, int id);
}
