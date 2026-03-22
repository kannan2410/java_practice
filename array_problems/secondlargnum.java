package array_problems;

public class secondlargnum {
    public static void main(String[] args){
        int[] nums = {10, 5, 20, 8};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > first){
                second = first;
                first = num;
            }else if(num > second && num != first){
                second = num;
            }
        }
        System.out.println("First Maximum number : " + first);
        System.out.println("Second Maximum number : " + second);
    }
}
