package javahomework3;

import java.util.Date;

public class Solution9_3 {
    public static void main(String[] args) {
        Date date = new Date();
        long l=10000;
        for (int i = 0; i <8 ; i++) {
            date.setTime(l);
            System.out.println(date.toString());
            l*=10;
        }
    }
}
