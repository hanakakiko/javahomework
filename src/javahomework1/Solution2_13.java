package javahomework1;

import java.util.Scanner;

public class Solution2_13 {
    public static void main(String[] args) {
        System.out.print("Enter the monthly saving amount: ");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        final double RATE=0.003125;
        double value=0;
        String[] mouths=new String[]{"first","second","third","fourth","fifth","sixth"};
        for(String i:mouths)
        {
            System.out.println("After the "+i+" month, the account value is "+(value=((amount+value)*(1+RATE))));
        }
    }
}
