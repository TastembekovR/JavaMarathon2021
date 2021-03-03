package day9.Task2;

public class Rectangle extends Figure {
    public Rectangle(double a, double b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    double a;
    double b;

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }
}
