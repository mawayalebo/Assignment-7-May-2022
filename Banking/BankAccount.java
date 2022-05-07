package Banking;
//bankaccount class
public class BankAccount {
    //instance variables: AccountNumber (an integer), balance a floating-point number), and “ownerName” (a String). 
    int AccountNumber;
    double balance;
    String ownerName;
    //Write proper constructor for this class
    BankAccount(int AccountNumber, double balance, String ownerName) {
        this.AccountNumber = AccountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }
    //Also write methods balance, add (to deposit an amount), and subtract (to withdraw an amount) and implement them.
    double balance() {
        return balance;
    }
    void add(double amount) {
        balance = balance + amount;
    }
    void subtract(double amount) {
        balance = balance - amount;
    }
    
}
