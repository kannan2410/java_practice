package array_problems;

import java.util.*;

public class findmissingnum {
    public static void main(String[] args){
        int[] nums = { 1,2,1,2,5,8};
        Set<Integer> result = new HashSet<>();
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        for(int num : nums){
            result.add(num);
            if(num<min) min = num;
            if(num>max) max = num;
        }
        System.out.print("[");
        boolean first = true;
        for(int i = min; i<=max; i++){
            if(!result.contains(i)){
                if(!first){
                    System.out.print(",");
                }
                System.out.print(i);
                first = false;
            }
        }
        System.out.print("]");
    }
}
