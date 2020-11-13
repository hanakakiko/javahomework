package javahomework2;

import java.util.Scanner;

public class Solution6_17 {
    public static void printMatrix(int n) {
        for(int i = 0 ; i < n ; i++){
            for (int j = 0; j < n ; j++) {
                System.out.print((int)(Math.random()+0.5)+" ");
                if(j == n-1){
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter n:");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        cin.close();
        printMatrix(n);
    }
}
