//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Recursion;

import java.util.Scanner;

public class MainIncreasing {
    public MainIncreasing() {
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
        intIncreasing(n);
    }

    public static void printIncreasing(int n) {
        if (n != 0) {
            printIncreasing(n - 1);
            System.out.println(n);
        }
    }

    public static void intIncreasing(int n) {
        if (n != 0) {
            System.out.print(n + " ");
            intIncreasing(n - 1);
        }
    }
}
