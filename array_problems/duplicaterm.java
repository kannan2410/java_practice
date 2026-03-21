package array_problems;

import java.util.HashSet;
import java.util.Set;

class duplicaterm {
    
    // public static Set<Integer> duplicate(int[] nums){
    //     Set<Integer> result = new HashSet<>();
    //     for(int i =0; i<nums.length; i++){
    //         if(!result.contains(nums[i])){
    //             result.add(nums[i]);
    //         }
    //     }
    //     return result;
    // }

    // public static void main(String[] args){
    //     int[] nums = {1,1,2,2,3};
    //     Set<Integer> out = duplicate(nums);
    //     System.out.println("Remove duplicate values : " + duplicate(nums));
    //     System.out.println("Length of array : " + out.size());
    // }


    public static int duplicate(int[] nums){
        int fast = 0;
        for(int slow = 1; slow<nums.length; slow++){
            if(nums[fast] != nums[slow]){
                fast++;
                nums[fast] = nums[slow];
            }
        }
        return fast+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3};
        int result = duplicate(nums);
        System.out.println("Length of array : " + result);
        System.out.print("[");
        for(int i = 0; i<result; i++){
            if(i!= result-1){
                System.out.print(nums[i]+",");    
            }else{
                System.out.print(nums[i]);
            }
        }
        System.out.print("]");
        
    }

}
