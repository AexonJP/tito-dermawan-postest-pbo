
package pertemuan6_b2;
import java.sql.Statement;
import java.sql.ResultSet;

public class CRUD {
    static Statement stmt;
    static public void tambah_data(String query){
       try {
           stmt = Koneksi.con();
           stmt.execute(query);
            System.out.println("Tambah Data Berhasil");
        } catch (Exception e) {
            System.out.println("Tambah Data Gagal");
        }
    }
    
    static public void get_data(String query){
       try {
           stmt = Koneksi.con();
           ResultSet rs = stmt.executeQuery(query);
           while (rs.next()) {                
                System.out.println("nama user : " + rs.getString("username"));
            }

        } catch (Exception e) {
            System.out.println("Tambah Data Gagal");
        }    
    }
    
    public static void main(String[] args) {
        tambah_data("INSERT INTO USER values('manusia','m')");
        get_data("SELECT * from user");
    }
}
