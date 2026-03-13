abstract class Shape {

    // Abstract method
    abstract double calculate_area();

    // Concrete method
    void display_info() {
        System.out.println("Shape Information");
    }
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculate_area() {
        return 3.14 * radius * radius;
    }
}

// Rectangle subclass (renamed to avoid conflict)
class Rect extends Shape {
    double length;
    double breadth;

    Rect(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculate_area() {
        return length * breadth;
    }
}

public class ShapeDemo {

    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rect r = new Rect(4, 6);

        c.display_info();
        System.out.println("Area of Circle: " + c.calculate_area());

        r.display_info();
        System.out.println("Area of Rectangle: " + r.calculate_area());

        // Trying to create object of abstract class (will cause error if uncommented)
        // Shape s = new Shape();
    }
}