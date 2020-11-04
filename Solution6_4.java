import java.util.Scanner;

public class Solution6_4 {
    public static void reverse(int number) {
        int sum=0,tmp;
        while(number!=0){
            tmp=number%10;
            sum=sum*10+tmp;
            number/=10;
        }
        System.out.println("它的反向数为"+sum);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = cin.nextInt();
        reverse(num);
    }
}
