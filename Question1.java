package Day9;

import java.util.InputMismatchException;
import java.util.Scanner;

class Rectangle {

    public static void printArea(double length, double width) {
        int area = (int) ((int) length * width);
        System.out.println("Rectangle area is approximately: " + area);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = -1.;
        while (length == -1.) {
            System.out.println("Enter length");
            try {
                length = scanner.nextDouble();

            } catch (InputMismatchException ex) {
                System.out.println("Invalid number");
            }
        }
        double width = -1.;
        while (width == -1.) {
            System.out.println("Enter width");
            try {
                width = scanner.nextDouble();

            } catch (InputMismatchException ex) {
                System.out.println("Invalid number");
            }
        }
        Rectangle.printArea(length, width);

    }
}
