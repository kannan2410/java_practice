package array_problems;

import java.util.HashSet;
import java.util.Set;

class findduplicate {

    public static int duplicate(int[] nums){
        Set<Integer> seen = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(seen.contains(nums[i])){
                return nums[i];
            }
            else{
                seen.add(nums[i]);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(duplicate(nums));
    }
}
