package array_problems;

import java.util.ArrayList;
import java.util.List;

public class common_element {
    public static void main(String[] args){
       int[] arr1 = {1,2,3,4,5};
       int[] arr2 = {2,3,5,7};

       List<Integer> result = new ArrayList<>();
       int left = 0, right =0;
       while(left < arr1.length && right < arr2.length){
            if(arr1[left] == arr2[right]){
                result.add(arr1[left]);
                left++;
                right++;
            }else if(arr1[left] < arr2[right]){
                left++;
            }else{
                right++;
            }
       }
       System.out.println("Common element : " + result);
    }
}
