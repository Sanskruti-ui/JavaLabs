package Lab9;

public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 8);

        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}

