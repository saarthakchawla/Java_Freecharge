package Java_Loops;

import java.util.*;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;

        while(i<5){
            System.out.println(i);
            i++;
        }

        System.out.println("Here i = 5 and we move in do while");

        do {
            System.out.println(i);
            i++;
        } while (i<4);
        System.out.println("Out of loop");
    }
}
