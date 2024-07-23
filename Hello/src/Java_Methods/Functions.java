package Java_Methods;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        for(String arg: args){
            System.out.println(arg);
        }

        greet();

        float avg_function = average(3,6, true);
        System.out.println(avg_function);
    }


    public static void greet(){
        System.out.println("Hello, Good Morning!");
    }

    public static float average(int a, int b, boolean should_average){
        if (should_average == false){
            return -1;
        }
        return (a+b)/2f;
    }

    static int minimum (int a, int b){
        return a<b ? a : b;
    }


}
