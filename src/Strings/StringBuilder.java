package Strings;

public class StringBuilder {
    public StringBuilder() {
    }

    public static void main(String[] args) {
        int n = 100000000;
        long start = System.currentTimeMillis();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();

        for(int i = 0; i < n; ++i) {
            sb.append(i);
        }

        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }
}
