/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EMRAN
 */
public class Reciept extends FoodOrder implements GlobalConstants {
    int Meals1,Meals2,Meals3,Meals4,Meals5;
    int Drink1,Drink2,Drink3,Drink4,Drink5;
    String[] Mealsresult;
    String[] Drinkresult;
    
    public String[] Meals(int a,int b,int c,int d,int e){
        int[] Meals = {a,b,c,d,e};
        for(int i=0;i<Meals.length;i++){
            Mealsresult[i] = (Meals[i]!=0)?mealsarrg[i]:null;
        }
        return Mealsresult;
        
    }
    public String[] Drink(int a,int b,int c,int d,int e){
        int[] Drink={a,b,c,d,e};
        for(int i=0;i<Drink.length;i++){
            Drinkresult[i] = (Drink[i]!=0)?drinksarrg[i]:null;
        }
        return Drinkresult;
    }
    
    
    
    
}
