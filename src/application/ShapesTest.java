package application;

import entities.Square;
import entities.Triangle;
import interfaces.Shape;

public class ShapesTest {
    public static void main(String[] args) {

        Shape t1 = new Triangle(3.0, 4.0);
        Shape s1 = new Square(5.0, 5.0);

        double t1area = t1.area();
        double t1perimeter = t1.perimeter();

        double s1area = s1.area();
        double s1perimeter = s1.perimeter();

        System.out.println("Area: " + t1area);
        System.out.println("Perimeter: " + t1perimeter);

        System.out.println("Area: " + s1area);
        System.out.println("Perimeter: " + s1perimeter);
    }
}
