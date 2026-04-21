package array_problems;

public class gcd {
    public static int gcd_num(int a, int b){
        while(b!=0){
            int tem = b;
            b = a % b;
            a = tem;
        }
        return a;
    }
    public static void main(String[] args){
        int a = 60,b = 36;
        System.err.println(gcd_num(a,b));
    }
}
