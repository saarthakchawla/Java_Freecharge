package Java_Statements;

import java.util.*;

public class Nested_ifelse {
    public static void main(String[] args) {

        // Find the largest in given 3 numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.println();

        if (a > b) {
            if (a > c) {
                System.out.println("Largest Number: " + a);
            } else {
                System.out.println("Largest Number: " + c);
            }
        } else{
            System.out.printf("Largest Number: " + b);
        }
    }
}
