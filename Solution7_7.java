public class Solution7_7 {
    public static void main(String[] args) {
        int n=100;
        int[]counts=new int[10];
        for (int i = 0; i < 10; i++) {
            counts[i]=0;
        }
        while(n-->0){
            counts[(int)(Math.random()*10)]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"出现的的次数为"+counts[i]+"次");
        }
    }
}
