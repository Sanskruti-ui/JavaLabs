package Lab9;

import Lab9.Vehicle9;

public class Car extends Vehicle9 {
    Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}
