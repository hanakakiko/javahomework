package javahomework2;

import java.util.Scanner;

public class Solution7_10 {
    public static int indexOfSmallestElement(double[] array){
        int n=array.length;
        int min=0;
        for (int i = 1; i < n; i++) {
            if(array[i]<array[min]){
                min=i;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.print("请输入10个数字：");
        double[] array = new double[10];
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            double v = cin.nextDouble();
            array[i]=v;
        }
        cin.close();
        System.out.println("该数组中最小元素的下标为"+indexOfSmallestElement(array)+"（下标从0开始）");
    }
}
