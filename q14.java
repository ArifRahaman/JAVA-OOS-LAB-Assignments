package JAVAOOS;

// Shape interface
interface Shape {
    double area();
    void draw();
    void rotate();
    void move(int x, int y);
    int getX();
    int getY();
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;
    private int x;
    private int y;

    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void rotate() {
        System.out.println("Rotating a circle");
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Moving a circle to (" + x + ", " + y + ")");
    }

    // Getter methods for Circle
    public double getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private double width;
    private double height;
    private int x;
    private int y;

    public Rectangle(double width, double height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void rotate() {
        System.out.println("Rotating a rectangle");
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Moving a rectangle to (" + x + ", " + y + ")");
    }

    // Getter methods for Rectangle
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class q14 {
    public static void main(String[] args) {
        // Create two Circle objects
        Circle circle1 = new Circle(5, 1, 2);
        Circle circle2 = new Circle(8, 3, 4);

        // Create three Rectangle objects
        Rectangle rectangle1 = new Rectangle(4, 6, 7, 8);
        Rectangle rectangle2 = new Rectangle(3, 5, 10, 12);
        Rectangle rectangle3 = new Rectangle(7, 9, 15, 18);

        // Display details before moving
        displayDetails(circle1);
        displayDetails(circle2);
        displayDetails(rectangle1);
        displayDetails(rectangle2);
        displayDetails(rectangle3);

        // Move shapes
        circle1.move(5, 7);
        circle2.move(10, 15);
        rectangle1.move(8, 10);
        rectangle2.move(12, 14);
        rectangle3.move(20, 25);

        // Display details after moving
        displayDetails(circle1);
        displayDetails(circle2);
        displayDetails(rectangle1);
        displayDetails(rectangle2);
        displayDetails(rectangle3);
    }

    // Helper method to display details of shapes
    private static void displayDetails(Shape shape) {
        System.out.println("Shape details:");
        System.out.println("Area: " + shape.area());
        System.out.println("Position: (" + shape.getX() + ", " + shape.getY() + ")");
        shape.draw();
        shape.rotate();
        System.out.println();
    }
}
