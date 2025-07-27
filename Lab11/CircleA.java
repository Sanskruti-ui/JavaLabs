package Lab11;

public class CircleA extends ShapeA {
    private double radius;

    // Constructor
    public CircleA(double radius) {
        this.radius = radius;
    }

    // Override calculateArea()
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
