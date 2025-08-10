package Recursion;

public class functionaladdrecursion {
    public static int func(int n){
        if(n==0){
            return 0;
        }
        int rec = func(n-1);
        return n+rec;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println((func(n)));
    }
}
