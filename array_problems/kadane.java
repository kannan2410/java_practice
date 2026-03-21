package array_problems;

public class kadane {
    
    public static int maxSubArray(int[] nums) {
        int current = 0;
        int maxnum = nums[0];

        for(int i = 0; i < nums.length; i++){
            current += nums[i];

            if(current > maxnum){
                maxnum = current;
            }

            if(current < 0){
                current = 0;
            }
        }

        return maxnum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums)); 
    }
}