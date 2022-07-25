
import com.mysql.jdbc.ResultSet;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author EMRAN
 */
public class DataStore {

    ArrayList<String> mealsName = new ArrayList<String>();
    ArrayList<Integer> mealsPrice = new ArrayList<Integer>();
    ArrayList<String> drinksName = new ArrayList<String>();
    ArrayList<Integer> drinksPrice = new ArrayList<Integer>();

    public void getData() {

        try {
            Conn conn = new Conn();
            ResultSet rs = (ResultSet) conn.stmt.executeQuery("select * from foodlist where category='meals'");

            while (rs.next()) {
                mealsName.add(rs.getString(2));
                mealsPrice.add(rs.getInt(3));
                //System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
            }

            System.out.println(mealsName + " " + mealsPrice);
            // for(int i:id){
            //System.out.println(i);
            //}

            ResultSet rs1 = (ResultSet) conn.stmt.executeQuery("select * from foodlist where category='drink'");

            while (rs1.next()) {
                drinksName.add(rs1.getString(2));
                drinksPrice.add(rs1.getInt(3));
                //System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
            }

            conn.con.close();
            System.out.println(drinksName + " " + drinksPrice);


            // jTextArea1.print();
        } catch (Exception d) {
            System.out.print(d);

        }

    }
    
    public ArrayList<String> mealsname(){
        
        return mealsName;
        
    }
    
    public ArrayList<Integer> mealsprice(){
        
        return mealsPrice;
        
    }
    
    public ArrayList<String> drinksname(){
        
        return drinksName;
        
    }
    
    public ArrayList<Integer> deinksprice(){
        
        return drinksPrice;
        
    }
}
