package main.java.org.dii.oop.shape;

public class Rectangle extends Shape{
    private double width;
    private double height;


    public Rectangle(String name, int numSide, double width,double height) {
        super(name, numSide, width*height, (width+height)*2);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }

}
