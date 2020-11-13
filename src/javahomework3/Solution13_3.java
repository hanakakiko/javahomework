package javahomework3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Solution13_3 {
    public static void main(String[] args) {//测试程序
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(34.5555555555);
        list.add(new BigInteger("123456789123456789"));
        list.add(new BigDecimal("0.123456789123456789"));
        sort(list);
        System.out.println(list);
    }

    public static void sort(ArrayList<Number> list) {
        int len=list.size();
        boolean flag;
        Number temp;
        for (int i = 0; i < len-1 ; i++) {//冒泡排序，每趟结束后最大的放在待排序列的最后
            flag=false;//如果某趟排序没有发生交换，则已经有序
            for (int j = 0; j < len-i-1 ; j++) {
                if(list.get(j).doubleValue()>list.get(j+1).doubleValue()){
                    temp=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}
