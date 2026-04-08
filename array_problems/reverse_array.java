package array_problems;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int tem = nums[start];
            nums[start] = nums[end];
            nums[end] = tem;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
