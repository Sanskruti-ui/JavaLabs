package Lab9;

public class Square extends Shape{
    private int length;

    // Constructor
    public Square(int length) {
        this.length = length;
    }

    // Override getArea
    @Override
    public double getArea() {
        return length * length;
    }
}

