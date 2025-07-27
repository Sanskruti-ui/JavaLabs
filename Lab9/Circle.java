package Lab9;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14159 * radius * radius;
    }
}

