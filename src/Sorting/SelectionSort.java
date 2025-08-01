package Sorting;

public class SelectionSort {
    public SelectionSort() {
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; ++i) {
            int minIndex = i;

            for(int j = i + 1; j < n; ++j) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{64, 25, 12, 22, 11};
        selectionSort(arr);
        printArray(arr);
    }
}
