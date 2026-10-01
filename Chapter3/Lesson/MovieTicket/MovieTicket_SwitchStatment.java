
/**
 * Write a description of class MovieTicket_SwitchStatment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class MovieTicket_SwitchStatment{
    public static void main(String[] arg){
        final double REGULAR_PRICE = 12.50;
        final double DISCOUNT_PRICE = 8.00;
        final double IMAX_SURCHARGE = 5.00;
        final double IMAX_70MM_SURCHARGE = 8.00;
        
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("---Movie Ticket Calculator---");
        System.out.println("Select Movie Format:");
        System.out.println("1 - Standard Format");
        System.out.println("2 - IMAX");
        System.out.println("3 - IMAX 70mm (As Nolan Intended)");
        System.out.print("Enter choice (1-3): ");
        int format = scan.nextInt();
        
        System.out.print("Enter the customer's age: ");
        int age = scan.nextInt();
        
        System.out.print("Is this a matinee showtime? (y/n)" );
        String isMatinee = scan.next();
        boolean matinee = false;
        for(isMatinee.toLowerCase().equals("y");matinee == false;){
            matinee = true;
        }
        
        System.out.print("Does the customer have a pass? (y/n)" );
        String hasPass = scan.next();
        boolean pass = hasPass.toLowerCase().equals("y");
        
        double ticketPrice;
        int point = 2;
        
        while ((age < 13 || age >=65 || (matinee && pass))&& point != 1){
            point = 1;        
        }
        
        switch(format){
        }
            case 1:
                switch(point){
                case 1:
                    ticketPrice = DISCOUNT_PRICE;
                    System.out.println("Status: Discount Applied!");
                    break;
                case 2:
                    ticketPrice = REGULAR_PRICE;
                    System.out.println("Status: Regular Rate Applied.");
                    break;
                break;
            }
        }
        
    }
}
