package Day9;

import java.util.Scanner;



public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isEmpty()) {
            System.out.println("Please enter your name");
            name = scanner.next();
        }
        int rollNum = -1;
        while (rollNum == -1) {
            System.out.println("Enter roll number...");
            rollNum = scanner.nextInt();
        }
        String field = "";
        while (field.isEmpty()) {
            System.out.println("Please enter your field of interest");
            field = scanner.next();
        }

        System.out.println("Hey, my name is " + name + "and my roll number is "
                + rollNum + ". My field of interest is " + field);
    }
}
