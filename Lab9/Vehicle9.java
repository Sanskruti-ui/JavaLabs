package Lab9;

public class Vehicle9 {
    String make;
    String model;
    int year;
    int maximumSpeed;


    Vehicle9(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    void drive() {
        System.out.println("Vehicle is driving.");
    }
}

