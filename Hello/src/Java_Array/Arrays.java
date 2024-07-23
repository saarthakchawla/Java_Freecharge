package Java_Array;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age[];            // Declaration
        age = new int[5];     // Allocation

        int age2[] = new int[5];

        age[2] = 22;
        System.out.println(age[2]);
        System.out.println(age[0]);
        System.out.println("Length of array age: "+age.length);

        int marks[] = {98,12,45,12,65};
        System.out.println(marks[1]);
        // System.out.println(marks[8]); // Exception

        // Iterate in array

        String names[] = {"saar", "lucky", "unlucky", "happy", "golu"};
        for (int i = 0; i < (names.length) ; i++) {
            System.out.println("Name: " + names[i]);
        }

        // for each loop

        for (String name: names) {
            System.out.println("for each loop name: " + name);
        }
    }
}
