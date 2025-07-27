package Lab9;

public class Rectangle extends Shape{
    private int width;
    private int height;

    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Override getArea
    @Override
    public double getArea() {
        return width * height;
    }
}
