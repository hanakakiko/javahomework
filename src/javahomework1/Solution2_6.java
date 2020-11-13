package javahomework1;

import java.util.Scanner;

public class Solution2_6 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n=m;
        int mul=1;
        do
        {
            mul*=n%10;
        }while((n/=10)>0);
        System.out.println("The multiplication of all digits in "+m+" is "+mul);
    }
}
