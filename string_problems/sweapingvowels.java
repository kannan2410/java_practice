package string_problems;

public class sweapingvowels {
    public static void main(String[] args){
        String ice = "IceCream";
        char[] arr = ice.toCharArray();
        int left = 0, right = arr.length-1;
        while(left<right){
            if(!isvowels(arr[left])){
                left++;
            }else if(!isvowels(arr[right])){
                right--;
            }else{
                char tap = arr[left];
                arr[left] = arr[right];
                arr[right] = tap;
                left++;
                right--;
            }
        }
        System.out.println(arr);

    }
    public static boolean  isvowels(char c){
        c = Character.toLowerCase(c); 
        return c == 'a' || c == 'e' || c =='i' || c == 'o' || c == 'u';
    }
}
