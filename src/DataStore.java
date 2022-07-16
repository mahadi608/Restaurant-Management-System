
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
public class DataStore {
    
    public static void main(String[] args){
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            Statement stmt = con.createStatement();
            
            con.close();


            // jTextArea1.print();
        } catch (Exception d) {
            System.out.print(d);

        }
    }
    
}
