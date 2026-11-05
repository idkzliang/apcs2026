
/**
 * Write a description of class BankAccount here.
 *
 * @author (Zuwei Liang)
 * @version (a version number or a date)
 */

// Step 1: Class Header
public class BankAccount{
    // Step 2: Create the Class Variables
    // Ensapsulated Instance Data
    private String accountHolder;
    private double balance;
    private int transactionCount;
        
    //Constant definition
    private static final double MIN_BALANCE = 0.0;
    
    // Step 3: Create the Class Constructor(s)
    // Default Constructor (No Parameters)
    public BankAccount(){ 
        // this refers to the current instance of the class(object)
        this.accountHolder = "Unnamed";
        this.balance  = 0.0;
        this.transactionCount = 0;
        
    }
    
    // Overloaded Constructor with Parameters
    public BankAccount(String accountHolder, double initialBalance){
        this.accountHolder = accountHolder;
        if(initialBalance >= BankAccount.MIN_BALANCE)
            this.balance = initialBalance;
        else
            this.balance = BankAccount.MIN_BALANCE;
        this.transactionCount = 0;
        
    }
    
    public double getBalance() {
      return this.balance;
    }
    //Withdraw the given amount
    // Mutator method(method that chages a class variable)
    public boolean Withdraw(double amount){
        if(amount > 0 && balance >= amount){
            this.balance -= amount;
            this.transactionCount++;
            return true;
        }
        return false;
    }
    
    // Adds intersest to the account balance (Mutator method)
    public void applyInterest(double annualRate, int months){
        double monthlyRate = (annualRate/100.0)/12.0;
        for (int m = 1; m <= months; m++){
            this.balance += this.balance * monthlyRate;
        }
    }
    
    // The toString method determines what String is returned when you try to print a Bankaccount object
    public String toString() {
        return "Account: " + this.accountHolder+" | Balance; $"+ 
        String.format("%.2f", balance) + " | Transactions: "+
        this.transactionCount;
    }
    
    
}
