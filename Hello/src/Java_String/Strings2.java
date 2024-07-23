package Java_String;

import java.util.Scanner;

public class Strings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();
        // sc.next(); -> String[0]

        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();

        System.out.println("Full name: " + firstName + " " + lastName);

    }
}
