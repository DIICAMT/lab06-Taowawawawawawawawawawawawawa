package main.java.org.dii.oop.shape;

public class Shape {
    private String name;
    private int numSide;
    private double area = 0.0;
    private double perimeter = 0.0;

    public Shape(Shape temp) {
        this.name = temp.getName();
        this.numSide = temp.getNumSide();
        this.area = temp.getArea();
        this.perimeter = temp.getPerimeter();
    }

    public Shape(String name, int numSide, double area, double perimeter) {
        this.name = name;
        this.numSide = numSide;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getName() {
        return this.name;
    }

    public int getNumSide() {
        return this.numSide;
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }
}
