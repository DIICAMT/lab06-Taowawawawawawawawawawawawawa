package main.java.org.dii.oop.lesson06.exercise01;
import main.java.org.dii.oop.shape.*;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Lesson {
    public Lesson() {
    }

    public static void run() {
        ArrayList<Shape> storage = new ArrayList();
        Scanner in = new Scanner(System.in);
        char nameCircle = 'a';
        char nameRectangle = 'a';
        char nameSquare = 'a';

        while(true) {
            System.out.print("1. Circle\n2. Rectangle\n3. Square\n4. Display all shape\n5. exit\nPlease select [1-5]: ");
            String choice = in.nextLine().trim();
            System.out.println();
            String strSide;
            double side;
            String name;
            if ("1".equals(choice)) {
                System.out.print("Enter radius: ");
                strSide = in.nextLine();
                side = Double.parseDouble(strSide);
                name = "Circle_" + Character.toString(nameCircle);
                Circle a = new Circle(name, 0, side);
                storage.add(a);
                ++nameCircle;
            }

            if ("2".equals(choice)) {
                System.out.print("Enter width: ");
                strSide = in.nextLine();
                System.out.print("Enter height: ");
                String strHeight = in.nextLine();
                double width = Double.parseDouble(strSide);
                double height = Double.parseDouble(strHeight);
                name = "Rectangle_" + Character.toString(nameRectangle);
                Rectangle a = new Rectangle(name, 4, width, height);
                storage.add(a);
                ++nameRectangle;
            }

            if ("3".equals(choice)) {
                System.out.print("Enter side: ");
                strSide = in.nextLine();
                side = Double.parseDouble(strSide);
                name = "Square_" + Character.toString(nameSquare);
                Square a = new Square(name, 4, side);
                storage.add(a);
                ++nameSquare;
            }

            if ("4".equals(choice)) {
                System.out.print("List all shape: ");
                System.out.println("List all shape: \n");

                for(int i = 0; i < storage.size(); ++i) {
                    PrintStream var10000 = System.out;
                    String var10001 = ((Shape)storage.get(i)).getName();
                    var10000.println("Name: " + var10001 + ", Number of side: " + ((Shape)storage.get(i)).getNumSide() + ", Area: " + ((Shape)storage.get(i)).getArea() + ", Perimeter: " + ((Shape)storage.get(i)).getPerimeter());
                }
            }

            if ("5".equals(choice)) {
                in.close();
                return;
            }

            System.out.println();
        }
    }
}
