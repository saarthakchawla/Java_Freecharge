package Java_Methods;

import java.sql.SQLOutput;

public class LearnMaths {
    public static void main(String[] args) {

        int a  = 4;
        int b = 8;

        System.out.println(Math.min(a,b));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(3,4));
        System.out.println(Math.abs(-3));
        System.out.println(Math.random()); // [0,1)

        System.out.println(getRandom(12,16));

        System.out.println(Math.floor(5.9));
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.round(5.3));
    }

    public static int getRandom(int a, int b){
        return (int) (Math.random()*(b-a+1)) + a;
    }

}
