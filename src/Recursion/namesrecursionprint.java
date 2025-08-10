package Recursion;

public class namesrecursionprint {
    public static void func(int i, int n){
        if(i>n){
            return;
        }
        func(i+1, n);
        System.out.println("Raj");

    }


    public static void main(String[] args) {
        int n = 4;
        func(1, n);

    }
}
