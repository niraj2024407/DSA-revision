package DSA;
public class fibonacci {
    public fibonacci() {
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n == 1 ? 1 : fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}

