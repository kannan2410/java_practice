package array_problems;

import java.util.Arrays;

public class leftrotate {
    public static void main(String[] args){
        int[] nums = {3,1,7,5,2};
        int n = nums.length;
        int temp = nums[0];
        for(int i = 0; i<n-1; i++){
            nums[i] = nums[i+1];
        }
        nums[n-1] = temp;
        System.out.println(Arrays.toString(nums));
    }
}
