package Java_Loops;

import java.util.*;

public class Nested_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int count = 1; count <= 5; count++) {
            for (int i = 1; i < 6; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            int j = 0;
            while (j<=5){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }

    }
}
