import java.util.Stack;

class stack1 {
    
    public static void main(String[] args) {
        String str = "Hello";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            stack.push(str.charAt(i));
        }

        String reverseString = "";
        while(!stack.isEmpty()){
            reverseString = reverseString + stack.pop();
        }
        System.out.println("Reverse String : " + reverseString);

        System.out.println("String : " + str);
    }
}