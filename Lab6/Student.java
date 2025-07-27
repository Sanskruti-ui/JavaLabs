package Lab6;

public class Student {
    String name;
    int age;
    String department;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }

    // Constructor with name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    // Constructor with name, age, and department
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

