public class ATM {
    private BankAccount account;

    // Constructor to initialize the ATM with a bank account
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Method for withdrawing money
    public void withdraw(double amount) {
        if (amount > account.getBalance()) {
            System.out.println("Insufficient balance for this withdrawal.");
        } else if (amount <= 0) {
            System.out.println("Enter a valid amount to withdraw.");
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("You have successfully withdrawn " + amount);
        }
    }

    // Method for depositing money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount to deposit.");
        } else {
            account.setBalance(account.getBalance() + amount);
            System.out.println("You have successfully deposited " + amount);
        }
    }

    // Method for checking the balance
    public void checkBalance() {
        System.out.println("Your current balance is: " + account.getBalance());
    }
}
