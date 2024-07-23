package Java_Loops;

import java.util.*;

public class Break_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* for (int i = 2; i <= 20; i+=2) {   // Even Number
            System.out.println(i);
            if (i>=10) break;
        }*/

        for (int i = 2; i <= 20; i+=2) {   // Even Number
            if (i == 2 || i == 8) continue;
            if (i>=15) break;
            System.out.println(i);
        }

    }
}
