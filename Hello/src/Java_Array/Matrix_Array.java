package Java_Array;

import java.util.*;

public class Matrix_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*int marks[][] = new int[4][3];

        marks[0][0] = 12;
        marks[0][1] = 98;
        marks[0][2] = 34;

        marks[1][0] = 12;
        marks[1][1] = 98;
        marks[1][2] = 34;

        marks[2][0] = 12;
        marks[2][1] = 98;
        marks[2][2] = 34;*/

        int marks[][] = {
                {12,98,34},
                {34,56,87},
                {45,76,41},
                {14,67,36}
        };
        System.out.println(marks[2][1]);
        System.out.println(marks[0][2]);
        // System.out.println(marks[1][3]);

    }
}
