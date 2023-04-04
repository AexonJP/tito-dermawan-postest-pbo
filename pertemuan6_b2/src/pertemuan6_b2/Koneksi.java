
package pertemuan6_b2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Koneksi {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/ambulan";
    static final String USER = "root";
    static final String PASS = "";
    static Connection con;
    static Statement stmt;
    static ResultSet rs;
    
    public static Statement con(){
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = con.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi Gagal");
        }
        return stmt;
    }
    public static void buat_tabel(){
        try {
            String sql = "CREATE TABLE user(username varchar(100), password varchar(100))";
            
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = con.createStatement();
            stmt.execute(sql);

            System.out.println("Buat Tabel Berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi Gagal");
        }
    }    
    public static void insert_data(){
        try {
            String sql = "INSERT INTO user values('manusia','ambulan')";
            
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = con.createStatement();
            stmt.execute(sql);

            System.out.println("Buat Tabel Berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi Gagal");
        }
    }    
        
    public static void main(String[] args) {
        con();
//        buat_tabel();
        insert_data();
    }
    
}
