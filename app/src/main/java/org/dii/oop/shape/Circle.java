package main.java.org.dii.oop.shape;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, int numSide, double radius) {
        super(name, numSide, 3.14 * radius * radius, 3.14 * radius * 2.0);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
}
