package entities;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double width, double height) {
        super(width, height);
    }

    public double squareArea() {
        return super.area();
    }

    @Override
    public final double perimeter() {
        return super.perimeter();
    }
}
