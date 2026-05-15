package array_problems;

import java.util.Arrays;

public class even_odd {

    public static int[] even_odd_num(int[] nums){
        int[] result = new int[nums.length];
        int even = 0;
        int odd = 1;

        for(int num : nums){
            if(num % 2 == 0){
                result[even] = num;
                even += 2;
            } else {
                result[odd] = num;
                odd += 2;
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums = {4,2,5,7};

        System.out.println(Arrays.toString(even_odd_num(nums)));
    }
}