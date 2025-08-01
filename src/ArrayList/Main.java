package ArrayList;

import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(a);
        var10000.println(var10001 + "->" + a.size());
        a.add(10);
        a.add(20);
        a.add(30);
        var10000 = System.out;
        var10001 = String.valueOf(a);
        var10000.println(var10001 + "->" + a.size());
        a.add(1, 40);
        var10000 = System.out;
        var10001 = String.valueOf(a);
        var10000.println(var10001 + "->" + a.size());
        int ans = (Integer)a.get(1);
        System.out.println(ans);
        a.set(3, 70);
        var10000 = System.out;
        var10001 = String.valueOf(a);
        var10000.println(var10001 + "->" + a.size());
        a.remove(1);
        var10000 = System.out;
        var10001 = String.valueOf(a);
        var10000.println(var10001 + "->" + a.size());
        ArrayList<String> l2 = new ArrayList();
        l2.add("hello");
        l2.add("cello");
        l2.add("geeks");
        var10000 = System.out;
        var10001 = String.valueOf(l2);
        var10000.println(var10001 + "->" + a.size());
        var10000 = System.out;
        var10001 = String.valueOf(a);
        var10000.println(var10001 + "->" + a.size());
    }
}
