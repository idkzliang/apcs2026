
/**
 * Generate a random cash prize
 *
 * Zuwei Liang
 * Date Modified: 8/26/2026
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Random;
public class PrizeGenerator
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("Welcome to the APCSA Prize Simulator!");
        System.out.println("-------------------------------------");
        System.out.println("Please enter your name");
        String name  = scan.nextLine();
        
        System.out.print("How much money do you have? $");
        double startBalance = scan.nextDouble();
        
        // Generate a random cash prize from $10 - $100
        //Math.random generates a number between 0 (inclusive) and 1 (exclusive)
        //(Math.random() * 91) generates a number between 0 and 90.999999....
        //(int) Math.random() * 91 generates a number between 0 and 90
        //10 + (int)(Math random() * 91) generates a number between 10 and 100
        Random rand = new Random();
        int prizeAmount = 10 + (int)(rand.nextInt() * 91);
        
        // Generate a random fee between $1 and $5
        
        int fee = 1 + (int)(rand.nextInt() * 5);
    }
}
