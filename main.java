
public class main{

    static void duplicate(int[] nums, int val){
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[result] = nums[i];
                result+=1;
            }
        }
        System.out.print(result);
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        duplicate(nums, val);
    }
}

