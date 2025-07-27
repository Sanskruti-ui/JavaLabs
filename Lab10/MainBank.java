package Lab10;

public class MainBank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Amit", "ICICI", 10000);
        BankAccount acc2 = new BankAccount("Sneha", "HDFC", 15000);
        BankAccount acc3 = new BankAccount("Ravi", "SBI", 8000);

        // Perform transactions on acc1
        acc1.deposit(2000);
        acc1.withdraw(500);
        acc1.displayAccountInfo();

        // Perform transactions on acc2
        acc2.deposit(3000);
        acc2.withdraw(10000);
        acc2.displayAccountInfo();

        // Perform transactions on acc3
        acc3.deposit(1500);
        acc3.withdraw(9000);  // This should trigger an insufficient balance message
        acc3.displayAccountInfo();
    }
}
