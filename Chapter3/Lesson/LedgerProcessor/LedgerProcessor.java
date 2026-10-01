/**
 * Write a description of class LedgerProcessor here.
 *
 * @author (Zuwei Liang)
 * @version (9/30/2026)
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;

public class LedgerProcessor
{
    public static void main(String[] args)throws FileNotFoundException{
    //Adding throws allows Java handle an error
    //The file MUST be in the same folder as the project
        File dataFile = new File("transaction.txt");
        Scanner fileScan = new Scanner(dataFile);
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
    //Counter and accumulator variables
        int count = 0;
        double totalSales = 0.0;
        
        System.out.println("=== Daily Transaction Ledger ===");
        
    //The loop will run while there is another line in the file
    while (fileScan.hasNextLine()){
        String line = fileScan.nextLine();
        double price = Double.parseDouble(line);// convert String to double
        
        // Update our counter and accumulator
        count++;
        totalSales += price;
        
        System.out.println("Transaction #"+count+": "+money.format(price));
    }
    fileScan.close();
    
    double averageSales = totalSales / count;
    
    System.out.println("Totoal Item Sold: " + count);
    System.out.println("Total Rvenue: "+money.format(totalSales));
    System.out.println("Average Transaction: "+money.format(averageSales));
    }
}
