package Lab6;

public class MainVehicle {
    public static void main(String[] args) {
        Car myCar=new Car();
        Motarcycle myMotarcycle=new Motarcycle();
        Garage myGarage=new Garage();

        System.out.println("---- Servicing Car ----");
        myGarage.serviceVehicle(myCar);

        System.out.println("---- Servicing Motorcycle ----");
        myGarage.serviceVehicle(myMotarcycle);

    }
}
