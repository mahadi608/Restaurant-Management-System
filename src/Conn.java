
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EMRAN
 */
public class Conn {
    String userName = "root";
    String pass = null;
    String dbName = "java";
    Statement stmt;
    Connection con;

    public Conn () {
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbName, userName, pass);
             stmt = con.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
