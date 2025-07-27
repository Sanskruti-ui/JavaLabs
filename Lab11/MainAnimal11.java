package Lab11;
import java.util.Scanner;
public class MainAnimal11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose an animal:");
            System.out.println("1. Animal");
            System.out.println("2. Dog");
            System.out.println("3. Cat");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            Animal11 animal;

            switch (choice) {
                case 1:
                    animal = new Animal11();
                    animal.makeSound();
                    break;
                case 2:
                    animal = new Dog11();
                    animal.makeSound();
                    break;
                case 3:
                    animal = new Cat11();
                    animal.makeSound();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);
    }
}
