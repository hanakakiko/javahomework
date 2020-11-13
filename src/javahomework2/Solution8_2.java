package javahomework2;

import java.util.Scanner;

public class Solution8_2 {
    public static double sumMajorDiagonal(double[][] m) {
        int n=m.length;
        double sum=0;
        for (int i = 0; i < n; i++) {
            sum+=m[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter a 4-by-4 matrix row by row:");
        double[][] m = new double[4][4];
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j]=cin.nextDouble();
            }
        }
        cin.close();
        System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(m));
    }
}
