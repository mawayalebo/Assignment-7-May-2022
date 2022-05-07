package Banking;
//class AccountManager that contains an array of BankAccount
public class AccountManager {
    BankAccount[] accounts = new BankAccount[6];
    
    //Write methods create (to create an account), delete(to terminate an account), deposit (to deposit an amount to an account) and withdraw (to withdraw an amount from an account).
    void create(int AccountNumber, double balance, String ownerName) {
        BankAccount account = new BankAccount(AccountNumber, balance, ownerName);
        accounts[AccountNumber] = account;
    }
    void delete(int AccountNumber) {
        accounts[AccountNumber] = null;
    }
    void deposit(int AccountNumber, double amount) {
        accounts[AccountNumber].add(amount);
    }
    void withdraw(int AccountNumber, double amount) {
        accounts[AccountNumber].subtract(amount);
    }
    
}
