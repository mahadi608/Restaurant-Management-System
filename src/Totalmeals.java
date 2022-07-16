
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EMRAN
 */
public class Totalmeals{
    int j=0;
    String[] mealsname ;
    int[] mealsprice ;
    int[] mealsquntity ;
    int iteam1,iteam2,iteam3,iteam4,iteam5;
    int Beef_Pizza=500;
    int Chicken_Pizza=600;
    int Shrimp_Pizza = 550;
    int Chicken_Pasta = 395;
    int Beef_pasta = 450;
    
    Totalmeals(int a,int b,int c,int d,int e){
        iteam1=a;
        iteam2=b;
        iteam3=c;
        iteam4=d;
        iteam5=e;
    }
   public int mealsorder(){
       int result = (Beef_Pizza*iteam1)+(Chicken_Pizza*iteam2)+(Shrimp_Pizza*iteam3)+(Chicken_Pasta*iteam4)+(Beef_pasta*iteam5);
       return result;
   }
   
   public void recieptMeals(){
       
       
       
       
      /* try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            Statement stmt = con.createStatement();
            for(int i = 0 ; i < mealsname.length ; i++){
                
                String sql = "INSERT INTO `foodorder`(`FoodName`, `FoodPrice`, `Foodquntity`) "
                        + "VALUES ('"+mealsname[i]+"','"+mealsprice[i]+"','"+mealsquntity[i]+"')";
                stmt.executeUpdate(sql);
                
            }
            con.close();
                       
            
           // jTextArea1.print();
        } catch (Exception d) {
            System.out.print(d);
            
        }  */
       
   }
    
    
}
