package array_problems;
class array_max{

    // Finding max number 
    public static void maxnum(String[] args) {
        int[] nums = { 3, 7, 2, 9, 1};
        int result = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] > result){
                result = nums[i];
            }
        }
        System.out.println(result);

    }

}