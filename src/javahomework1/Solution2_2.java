package javahomework1;

import java.util.Scanner;

public class Solution2_2 {
    public static void main(String[] args) {
        System.out.println("Enter length of the sizes and height of the Equilateral");
        System.out.print("triangle:");
        Scanner scanner = new Scanner(System.in);
        double length=scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = Math.sqrt(3) / 4 * Math.pow(length, 2);
        System.out.println("The area is "+area);
        System.out.println("The volume of the Triangular prism is "+area*height);
    }
}
