public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(700); // Initial balance of 700
        ATM atm = new ATM(myAccount);

        atm.checkBalance();  // Check balance
        atm.deposit(400);    // Deposit 400
        atm.withdraw(200);   // Withdraw 200
        atm.checkBalance();  // Check balance again
    }
}
