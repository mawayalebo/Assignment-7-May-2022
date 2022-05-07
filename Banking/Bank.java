package Banking;

public class Bank {
    //add main() function that creates an AccountManager and add 5 accounts.
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        manager.create(1, 1000, "Jack");
        manager.create(2, 2000, "Anna");
        manager.create(3, 3000, "Zein");
        manager.create(4, 4000, "Morris");
        manager.create(5, 5000, "Lebo");

        //Now print the details of all accounts in this Bank.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Account " + i + ": " + manager.accounts[i].ownerName + ", " + manager.accounts[i].balance);
        }
    }
}
