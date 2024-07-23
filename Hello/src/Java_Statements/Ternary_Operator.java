package Java_Statements;

import java.util.*;

public class Ternary_Operator {
    public static void main(String[] args) {
        int a = 1256;
        int b = 26;
        int c = 234;
        int max = 0;

        max = (a>b) ? (a>c) ? a : c: (b>c)? b : c ;
        System.out.println(max);
    }
}
