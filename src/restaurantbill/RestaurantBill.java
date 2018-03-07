/* 
 * Nigel Howarth Shute
 *RestaurantBill.java
 *07/03/2018
 * This program calculates the price of a meal with tax and prints the bill.
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
        mealTotal = meal + tax; //adds the meal price and the tax
        DecimalFormat x = new DecimalFormat ("###.##");
        System.out.println("Meal: $" + meal + "\n"  + "tax: $" + x.format(tax) + "\n" + "Total: $" + x.format(mealTotal));
    }
    
}
    