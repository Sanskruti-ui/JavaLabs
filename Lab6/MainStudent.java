package Lab6;

public class MainStudent {
    public static void main(String[] args) {
        // Using default constructor
        Student student1 = new Student();

        // Using constructor with name and age
        Student student2 = new Student("Alice", 22);

        // Using constructor with name, age, and department
        Student student3 = new Student("Bob", 21, "Computer Science");

        // Printing details
        System.out.println("Student 1:");
        student1.printDetails();

        System.out.println("Student 2:");
        student2.printDetails();

        System.out.println("Student 3:");
        student3.printDetails();
    }
}

