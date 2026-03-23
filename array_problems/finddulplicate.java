package array_problems;

import java.util.*;
class finddulplicate {
    public static void main(String[] args){
        int[] nums = {1,2,2,3,3};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(!seen.add(nums[i])){
                duplicate.add(nums[i]);
            }
        }
        System.out.println("Duplicate value : " + duplicate);
    }
}