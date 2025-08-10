package Recursion;

public class factorial {
    public static int func(int n){
        if(n==0){
            return 1;
        }
        int rec = func(n-1);
        return n*rec;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(func(n));
    }
}
