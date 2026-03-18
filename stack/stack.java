package stack;
class stack {
    static int[] stack = new int[100];
    static int top = -1;

    public static void push(int value){
        top = top + 1;
        stack[top] = value;
    }

    public static int pop(){
        int remove = stack[top];
        top = top - 1;
        return remove;
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        System.out.print("[");
        for(int i=0; i<=top;i++){
            if(i==top){
                System.out.print(stack[i]);
            }else{
                System.out.print(stack[i]+",");
            }
        }
        System.out.print("]");
        System.out.println();
        System.out.println("remove value: "+ pop());
        System.out.print("[");
        for(int i=0; i<=top;i++){
            if(i==top){
                System.out.print(stack[i]);
            }else{
                System.out.print(stack[i]+",");
            }
        }
        System.out.print("]");
    }
}