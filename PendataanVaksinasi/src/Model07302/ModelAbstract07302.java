package Model07302;
import Helper07302.KoneksiDb07302;
import java.sql.Connection;
public abstract class ModelAbstract07302 {
    public Connection conn = KoneksiDb07302.getconection();
    public abstract void updatenoTelp(String noTelp,int id);
    public abstract void updateNoTelp(String noTelp, int id);
}
