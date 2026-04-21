package array_problems;

import java.util.Arrays;

public class rightrotate {
    public static void main(String[] args){
        int[] nums = {3,1,7,5,2};
        int n = nums.length;
        int temp = nums[n-1];
        for(int i = n-1; i>0; i--){
            nums[i] = nums[i-1];
        }
        nums[0] = temp;
        System.out.println(Arrays.toString(nums));
    }
}
