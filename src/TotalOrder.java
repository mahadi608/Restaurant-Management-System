
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EMRAN
 */
public class TotalOrder{
    ArrayList<Integer> mealsPrices = new ArrayList<Integer>();
    ArrayList<Integer> drinksPrices = new ArrayList<Integer>();
    ArrayList<Integer> iteams = new ArrayList<Integer>();
    int sum=0;
    DataStore data = new DataStore();
       
       
    
    
   public int mealsOrder(ArrayList<Integer> a){
       
       iteams = a;
       
       data.getData();
       
       mealsPrices = data.mealsPrice;
       
       for(int i=0;i<iteams.size();i++){
           
           sum = sum + (iteams.get(i)*mealsPrices.get(i));
       }
       
       
       System.out.println(sum);
       return sum;   
   }
   
   public int drinksOrder(ArrayList<Integer> a){
       
       iteams = a;
       
       data.getData();
       
       drinksPrices = data.drinksPrice;
       
       for(int i=0;i<iteams.size();i++){
           
           sum = sum + (iteams.get(i)*drinksPrices.get(i));
       }
       
       
       System.out.println(sum);
       return sum;   
   }
    
    
}
