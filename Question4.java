package CogentSubmissions;

import java.util.Arrays;

abstract class Marks {
    double[] marks = new double[16];
    abstract double getPercentage();
}

class A extends Marks {

    A(double mathMark, double englishMark, double scienceMark) {
        this.marks[0] = mathMark;
        this.marks[1] = englishMark;
        this.marks[2] = scienceMark;
    }

    A(double[] marks) {
        if (marks.length != 3) {
            System.out.println("Marks must contain 3 grades");
            throw new RuntimeException();
        }
        this.marks = marks;
    }

    @Override
    double getPercentage() {
        System.out.println("Maths mark: " + marks[0] + "%" +
                "\nEnglish mark: " + marks[1] + "%" +
                "\nScience mark: " + marks[2] +  "%");
        double ave = Arrays.stream(marks).average().orElse(-1.);
        System.out.println("Your average is " + ave + "%");
        return ave;
    }
}

class B extends Marks {

    B(double mathMark, double englishMark, double scienceMark, double historyMark) {
        this.marks[0] = mathMark;
        this.marks[1] = englishMark;
        this.marks[2] = scienceMark;
        this.marks[3] = historyMark;
    }

    B(double[] marks) {
        if (marks.length != 4) {
            System.out.println("Marks must contain 4 grades");
            throw new RuntimeException();
        }
        this.marks = marks;
    }

    @Override
    double getPercentage() {
        System.out.println("Maths mark: " + marks[0] + "%" +
                "\nEnglish mark: " + marks[1] + "%" +
                "\nScience mark: " + marks[2] + "%" +
                "\nHistory mark: " + marks[3] + "%");

        double ave = Arrays.stream(marks).average().orElse(-1.);
        System.out.println("Your average is " + ave + "%");
        return ave;
    }
}

public class Question4 {
    public static void main(String[] args) {
        double[] aMarks = {100., 92., 86.};
        A student1 = new A(aMarks);

        double[] bMarks = {75., 94., 83., 90.};
        B student2 = new B(bMarks);

        double ave1 = student1.getPercentage();
        double ave2 = student2.getPercentage();

    }
}
