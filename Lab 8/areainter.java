
interface Shape {
    double calculateArea();
}


class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}


class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class areainter {
    public static void main(String[] args) {
        
        Shape rectangle = new Rectangle(5.0, 3.0);
        Shape circle = new Circle(2.5);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(4.0, 5.0);

       
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
