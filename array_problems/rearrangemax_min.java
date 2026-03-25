package array_problems;

import java.util.*;

public class rearrangemax_min {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        List<Integer> result = new ArrayList<>();
        int left = 0, right = nums.length-1;
        while(left <= right){
            result.add(nums[right]);
            right--;
            if(left <= right){
                result.add(nums[left]);
                left++;
            }
        }
        System.out.println(result);
    }
}
