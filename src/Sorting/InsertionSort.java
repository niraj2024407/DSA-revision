package Sorting;

public class InsertionSort {
    public InsertionSort() {
    }

    void sort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; ++i) {
            int result = arr[i];

            int j;
            for(j = i - 1; j >= 0 && arr[j] > result; --j) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = result;
        }

    }

    void printArray(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 11, 13, 5, 6};
        InsertionSort result = new InsertionSort();
        result.sort(arr);
        result.printArray(arr);
    }
}
