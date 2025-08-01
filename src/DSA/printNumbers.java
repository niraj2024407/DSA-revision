package DSA;
public class printNumbers {
    public printNumbers() {
    }

    public static void printNumbers(int n) {
        if (n != 0) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {

        printNumbers(5);
    }
}