
abstract class Shape {
    abstract double calculateArea();
}


class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    double calculateArea() {
        return length * width;
    }
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }


    double calculateArea() {
        return side * side;
    }
}


class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class area {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Circle circle = new Circle(2.5);
        Square square = new Square(4.0);
        Triangle triangle = new Triangle(4.0, 5.0);

       
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
