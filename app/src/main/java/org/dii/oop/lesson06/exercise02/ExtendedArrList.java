//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package main.java.org.dii.oop.lesson06.exercise02;


import main.java.org.dii.oop.shape.*;
import java.io.PrintStream;
import java.util.ArrayList;

public class ExtendedArrList<E> extends ArrayList<Shape> {
    public ExtendedArrList() {
    }

    public void listAllShapes() {
        System.out.println("List all shape: \n");

        for(int i = 0; i < this.size(); ++i) {
            Shape temp = (Shape)this.get(i);
            PrintStream var10000 = System.out;
            String var10001 = temp.getName();
            var10000.println("Name: " + var10001 + ", Number of side: " + temp.getNumSide() + ", Area: " + temp.getArea() + ", Perimeter: " + temp.getPerimeter());
        }

    }

    public void sumArea() {
        double area = 0.0;

        for(int i = 0; i < this.size(); ++i) {
            Shape temp = (Shape)this.get(i);
            area += temp.getArea();
        }

        System.out.println("summation of area is " + area);
    }
}
