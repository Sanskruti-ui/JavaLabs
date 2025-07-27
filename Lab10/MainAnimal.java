package Lab10;
import java.util.Scanner;
public class MainAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose an animal:");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            System.out.println("3. Generic Animal");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            Animal animal;

            switch (choice) {
                case 1:
                    animal = new Dog();
                    animal.makeSound();
                    break;
                case 2:
                    animal = new Cat();
                    animal.makeSound();
                    break;
                case 3:
                    animal = new Animal();
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
