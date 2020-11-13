package javahomework1;

import java.util.Scanner;

public class Solution2_7 {
    public static void main(String[] args) {
        System.out.print("Enter the number of minutes: ");
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        int days=minutes/(24*60);
        int years=days/365;
        days%=365;
        System.out.println(minutes+" minutes is approximately "+years+" and "+days+" days");
    }
}
