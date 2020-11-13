package javahomework1;

import java.util.Scanner;

public class Solution2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();
        double bmi = (weight * 0.45359237) / Math.pow((height * 0.0254), 2);
        System.out.println("BMI is "+String.format("%.4f",bmi));
    }
}
