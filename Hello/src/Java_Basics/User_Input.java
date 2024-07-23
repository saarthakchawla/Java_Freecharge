package Java_Basics;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.print("Enter your age: ");

         int age = sc.nextInt();
         System.out.println("Age: " + age);

         System.out.println("Enter first number: ");
         float firstNumber = sc.nextFloat();
         System.out.println("Enter second number: ");
         long secondNumber = sc.nextLong();
         float result = firstNumber + secondNumber;
         System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is " + result);
         sc.close();
    }
}
