package Java_Statements;

import java.util.*;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day number: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Today is Monday.");
                break;

            // case 1: case2 : -> ese bhi kar sakte

            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day Number");
        }
    }
}
