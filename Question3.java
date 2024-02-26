package Day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Average {
    public List<Double> nums = new ArrayList<>();

    void average() {
        Double sum = 0.0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        System.out.println("The average of your numbers is: " + (sum / nums.size()));
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Average ave = new Average();
        while (ave.nums.size() < 3) {
            System.out.println("Enter a number");
            double num = scanner.nextDouble();
            ave.nums.add(num);
        }
        ave.average();
    }
}
