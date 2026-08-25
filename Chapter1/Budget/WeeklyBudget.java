
/**
 * Weekly Budget
 * Dr.Miller
 * Last.Updated: 8/25/2026
 * )
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class WeeklyBudget
{
    // Calculate weekly lunch spending and remaining money
    public static void main(String[] args) {
        String name;
        double allowance, lunchPrice, totalCost, Remaining;
        int lunchesPerWeek;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        // Instantiate the Scanner object to read from the keyboard
        Scanner scan = new Scanner(System.in);
        
        //Read a String (object)
         System.out.print("Enter your name: ");
         name = scan.nextLine();
         
        //Read double (floating point number)
        System.out.print("Enter your weekly allowance: $");
        allowance = scan.nextDouble();
        
        System.out.print("Enter the prie of one school lunch: $");
        lunchPrice = scan.nextDouble();
        //read an integer
        System.out.print("Enter the number of school lunches you order in lunch: $");
        lunchesPerWeek = scan.nextInt();
        
        //Perform calculation (Arithmetic expressions)
        totalCost = lunchPrice * lunchesPerWeek;
        Remaining = allowance - totalCost;
        
        //printg allows placholders for strings using %s
        System.out.printf("--- Weekly Buget Summary for %s ---%n", name);
        
        System.out.printf("%-25s %s%n", "Weekly Allowance:",money.format(allowance));
        System.out.printf("%-25s %s%n","Total Spent on Lunches:",money.format(totalCost));
        System.out.printf("%-25s %s%n","Money Remaining",money.format(Remaining));
        
        
            }
}
