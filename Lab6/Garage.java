package Lab6;

public class Garage extends Vehicle{
    void serviceVehicle( Vehicle Vehicle){
        Vehicle.start();
        System.out.println("Vehicle Serviced!!");
    }
}
