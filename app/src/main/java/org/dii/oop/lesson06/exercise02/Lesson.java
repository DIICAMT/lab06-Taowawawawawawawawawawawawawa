package main.java.org.dii.oop.lesson06.exercise02;
import main.java.org.dii.oop.shape.*;
import java.util.Scanner;
import java.util.ArrayList; //this exercise MUST use extended version of arrayList
import main.java.org.dii.oop.lesson06.exercise02.ExtendedArrList;

public class Lesson {
    public Lesson() {
    }

    public static void run() {
        Scanner in = new Scanner(System.in);
        ExtendedArrList<Shape> storage = new ExtendedArrList();
        char nameCircle = 'a';
        char nameRectangle = 'a';
        char nameSquare = 'a';

        while (true) {
            System.out.print("1. Circle\n2. Rectangle\n3. Square\n4. Display all shape\n5. Show summation of area\n6. Exit\nPlease select [1-6]: ");
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
                storage.listAllShapes();
            }

            if ("5".equals(choice)) {
                storage.sumArea();
            }

            if ("6".equals(choice)) {
                in.close();
                return;
            }

            System.out.println();
        }
    }
}