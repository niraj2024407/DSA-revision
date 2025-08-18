package Recursion;

public class swapingrecursion4 {
    public static void printArray(int[] arr, int n){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void helper(int[] arr, int n){
        int p1 = 0;
        int p2 = n-1;

        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        printArray(arr, n);

    }


    public static void main(String[] args) {

        int n = 5;
        int[] arr = { 5, 4, 3, 2, 1};
      helper(arr, n);

    }
}
