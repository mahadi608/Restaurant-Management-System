
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
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
    boolean setVisible = true;
    //JFrame f;

    public Conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName, userName, pass);
            stmt = con.createStatement();

        } catch (Exception e) {
            //f=new JFrame(); 
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Please Check Your Internet Connection.",
                    "Internet Connection Alert",
                    JOptionPane.WARNING_MESSAGE);
            setVisible = false;
        }
    }
}
