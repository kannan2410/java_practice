package array_problems;

import java.util.ArrayList;

public class shufflestring {
    public static void main(String[] args){
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        ArrayList<Character> letter = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            letter.add(' ');
        }
        for(int i = 0; i<s.length(); i++){
            letter.set(indices[i], s.charAt(i));
        }
        String res = "";
        for(char c:letter){
            res+=c;
        }
        System.out.println(res);
    }
}
