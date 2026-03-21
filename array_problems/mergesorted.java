package array_problems;

public class mergesorted {
    
    public static void main(String[] args){

        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        int n = arr1.length;
        int m = arr2.length;

        while(arr1[n-1]> arr2[0]){

            int temp = arr1[n-1];
            arr1[n-1] = arr2[0];
            arr2[0] = temp;

            int last = arr1[n-1];
            int i = n-2;
            while(i>=0 && arr1[i]>last){
                arr1[i+1] = arr1[i];
                i--;
            }
            arr1[i+1] = last;

            int first = arr2[0];
            int j = 1;
            while(j<m && arr2[j]<first){
                arr2[j-1] = arr2[j];
                j++; 
            }
            arr2[j-1] = first;
        }
        System.out.print("First : [");
        for(int i =0; i<n; i++){
            if(i!= n-1){
                System.out.print(arr1[i]+",");
            }else{
                System.out.print(arr1[i]);
            }
        }
        System.out.println("]");

        System.out.print("Second : [");
       for(int i =0; i<m; i++){
            if(i!= m-1){
                System.out.print(arr2[i]+",");
            }else{
                System.out.print(arr2[i]);
            }
        }
        System.out.print("]");

    }
}
