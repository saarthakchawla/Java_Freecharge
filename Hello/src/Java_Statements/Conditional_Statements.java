package Java_Statements;

import java.sql.SQLOutput;
import java.util.*;

public class Conditional_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age>=18) {
            System.out.println("Hey! You can Vote.");
        }
        else {
            System.out.println("Hey! You cannot vote.");
        }*/

        System.out.print("Enter day in number: ");
        int day = sc.nextInt();

        if (day == 6 || day == 7){
            System.out.println("Hurray! It's a off");
        }
        else if (day == 1 || day == 3 || day == 5) {
            System.out.println("wfh today!");
        }
        else {
            System.out.println("Work from office today!");
        }
    }
}
