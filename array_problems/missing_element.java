package array_problems;

//import java.util.HashSet;
import java.util.Arrays;


class missing_element{


    public static void main(String[] args){
        int[] nums =  {1,3,4,5};
        int n = nums.length;
        boolean[] presult = new boolean[n+2];
        for(int val : nums){
            if(val<=n){
                presult[val] = true;
            }
        }
        System.err.println(Arrays.toString(presult));
        for(int i = 0; i<=n+1; i++){
            if(!presult[i]){
                System.out.println(i);
            }
        }
    }
}