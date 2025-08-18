package Sorting;

class BubbleSort {
    BubbleSort() {
    }

    void bubbleSort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{64, 34, 25, 12};
        BubbleSort result = new BubbleSort();
        result.bubbleSort(arr);
        printArray(arr);
    }
}
