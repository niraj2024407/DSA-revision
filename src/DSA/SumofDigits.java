package DSA;

public class SumofDigits {


    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            int rec = n % 10;
            return sumDigits(n / 10) + rec;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(12345));
    }
}
