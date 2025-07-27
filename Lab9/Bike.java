package Lab9;

import Lab9.Vehicle9;

public class Bike extends Vehicle9 {
    Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

