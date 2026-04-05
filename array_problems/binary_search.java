package array_problems;

public class binary_search {

    public static int binary(int[] nums,int k){
        int start = 0;
        int end = nums.length;
        int answer = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]<k){
                start = mid+1;
            }else if(nums[mid]==k ){
                answer = mid;
                end = mid -1;
            }else{
                end = mid-1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 2, 2, 5};
        int k = 2;
        int result = binary(nums, k);
        System.out.println(result);
        }
    }
