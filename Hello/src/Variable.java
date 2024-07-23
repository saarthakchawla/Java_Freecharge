public class Variable {
    public static void main(String[] args) {
        boolean is_passed = false;
        int count = 12;
        byte marks = 15;
        System.out.println(count);
        System.out.println(marks);

        //byte marks2 = 130; // lossy conversion from int to byte

        float pi = 3.141592653589793f;
        double pi2 = 3.141592653589793;
        System.out.println(pi);
        System.out.println(pi2);

        int abc = 23;
        long intabc = (long)abc;
        System.out.println(intabc);

        long number = 24;
        int longNumber = (int) number; // Type Casting
        System.out.println(longNumber);  // Explicit Conversion

        int age = 129;
        byte newAge = (byte)age;
        System.out.println(newAge); // Data Loss

        /* int age = 129;
        byte newAge = (byte)age;
        System.out.println(newAge); */
    }
}
