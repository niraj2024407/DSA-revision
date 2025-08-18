package Recursion;

public class swapingrecursion {
    public static void printArray(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void helper(int[] arr, int start, int end){
        if(start>=end) {
            return;
        }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;

            helper(arr, start+1, end-1);

    }


    public static void main(String[] args) {

        int n=5;
        int[] arr = { 5, 4, 3, 2, 1};
        helper(arr, 0, n-1);
        printArray(arr, n);

    }
}
