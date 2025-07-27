package Lab10;

public class BankAccount {
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

    // Constructor
    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    // Method to get balance
    public double getBalance() {
        return accountBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited ₹" + amount + " into " + accountHolderName + "'s account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrew ₹" + amount + " from " + accountHolderName + "'s account.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount for " + accountHolderName);
        }
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("\nAccount Holder: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Current Balance: ₹" + accountBalance);
    }
}
