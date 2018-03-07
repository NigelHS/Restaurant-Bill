/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurantbill;

/**
 *
 * @author nihow4926
 */
import java.text.DecimalFormat;
public class RestaurantBill {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double meal;
        double tax;
        double mealTotal;
        
        meal = 15.60;
        tax = 0.13*meal;
        mealTotal = meal + tax;
        DecimalFormat x = new DecimalFormat ("###.##");
        System.out.println("Meal: $" + meal + "\n"  + "tax: $" + x.format(tax) + "\n" + "Total: $" + x.format(mealTotal));
    }
    
}
    