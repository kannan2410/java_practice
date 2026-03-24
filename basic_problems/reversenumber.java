package basic_problems;

public class reversenumber {
    public static void main(String[] args){
        int number = 168;
        int result = 0;
        while(number>0){
            int last_digit = number%10;
            result = result * 10 + last_digit;
            number = number/10;
        }
        System.out.println(result);
    }
}
