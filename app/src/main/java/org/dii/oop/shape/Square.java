package main.java.org.dii.oop.shape;

public class Square extends Rectangle{
    private double side;

    public Square(String name, int numSide, double side) {
        super(name, numSide, side, side);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }
}
