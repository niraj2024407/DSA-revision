package Strings;

import java.util.Scanner;

public class strings {
    public strings() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        String s = "abc,def,ghi,jkl mno ";
        String[] parts = s.split(", ");

        for(int i = 0; i < parts.length; ++i) {
            System.out.println(parts[i]);
        }

    }
}
