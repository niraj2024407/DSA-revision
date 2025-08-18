package Recursion;

public class swapingrecursion2 {
    public static void printArray(int[] arr){
        helper(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
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
        int[] arr = { 5, 4, 3, 2, 1};
        printArray(arr);

    }
}
