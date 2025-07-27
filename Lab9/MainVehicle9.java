package Lab9;

public class MainVehicle9 {
    public static void main(String[] args) {
        Car car = new Car("Tata", "Altroz", 2022, 200);
        Bike bike = new Bike("TVS", "Iqube", 2025, 100);


        car.drive();
        bike.drive();


        System.out.println("Car: " + car.make + " " + car.model + ", Year: " + car.year + ", Max Speed: " + car.maximumSpeed);
        System.out.println("Bike: " + bike.make + " " + bike.model + ", Year: " + bike.year + ", Max Speed: " + bike.maximumSpeed);
    }
}

