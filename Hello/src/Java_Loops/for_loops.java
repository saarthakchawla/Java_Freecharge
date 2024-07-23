package Java_Loops;

import java.util.*;

public class for_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<=10; i++){
            System.out.println("Hello World! " + i);
        }

        // Table of n
        System.out.print("Enter a int value between 1 to 20: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }

        // sum of n natural numbers

        int sum = 0;
        for (int i = 1 ; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);

    }
}
