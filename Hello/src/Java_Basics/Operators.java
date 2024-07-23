package Java_Basics;

import java.sql.SQLOutput;

public class Operators {
    public static void main(String[] args) {
        System.out.println(4+2);

        int a = 12;
        int b = 7;
        int c = a+b;
        System.out.println(c);

        double d = (double)a/(double)b;
        System.out.println(d);

        double e = a%b;
        System.out.println(e);

        a += b;
        System.out.println(a);

        a -= b;
        System.out.println(a);

        int firstNumber = 11;
        int secondNumber = 14;
        System.out.println(firstNumber == secondNumber);  // Relational
        System.out.println(firstNumber != secondNumber);

        boolean firstExpression = false;  // Logical
        boolean secondExpression = true;
        System.out.println(firstExpression && secondExpression);
        System.out.println(firstExpression || secondExpression);
        System.out.println(!firstExpression);

        int s = 12;
        s = s+1;  // s = 13
        s++;      // s = 14
        s--;      // s = 13
        s--;      // s = 12
        System.out.println(s);
    }
}
