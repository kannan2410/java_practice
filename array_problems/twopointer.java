package array_problems;

import java.util.HashMap;

class twopointer{

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        HashMap<Integer,Integer> map = new HashMap<>();
        int target = 9;
        for(int num : nums){
            int need = target - num;
            if(map.containsKey(need)){
                System.err.println("[" + need + "," + num + "]");
            }
            map.put(num, 1);
        }
    }

}