/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EMRAN
 */
public class TotalDrink {
    int iteam1,iteam2,iteam3,iteam4,iteam5;
    int Dairy_Milk_Shake=200;
    int Kit_Kat_Shake=150;
    int Oreo_Shake = 190;
    int Regular_Lassi = 90;
    int Coca_Cola  = 40;
    
    TotalDrink(int a,int b,int c,int d,int e){
        iteam1=a;
        iteam2=b;
        iteam3=c;
        iteam4=d;
        iteam5=e;
    }
   public int DrinkOrder(){
       int result = (Dairy_Milk_Shake*iteam1)+(Kit_Kat_Shake*iteam2)+(Oreo_Shake*iteam3)+(Regular_Lassi*iteam4)+(Coca_Cola*iteam5);
       return result;
   }
   public void recieptDrink(){
       System.out.println("Totall Drink");
   }
    
}
