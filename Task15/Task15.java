

interface Shape {
    public double calculateArea();
    public double calculatePerimeter();
}


abstract class AbstractShape implements Shape {
    String color;
    

    public AbstractShape(String color) {
        this.color = color;
    }
}

class Circle extends AbstractShape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}


public class Task15 {

    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 5);
      
        System.out.println("--- Circle Details ---");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\n--- Rectangle Details ---");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}

