package DSA;
import java.util.Scanner;

public class MainMultiplication {
    public MainMultiplication() {
    }

    public static void multiplyRecursively(int n, int m) {
        int result = multiplyHelper(n, m);
        System.out.println(result);
    }

    private static int multiplyHelper(int n, int m) {
        return m == 0 ? 0 : n + multiplyHelper(n, m - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        multiplyRecursively(n, m);
    }
}

