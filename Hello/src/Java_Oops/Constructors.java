package Java_Oops;

public class Constructors {
    public static void main(String[] args) {
        Complex num1 = new Complex(2,3);
        Complex num2 = new Complex(4);
        num1.print();
        num2.print();
        System.out.println("Adding 2 numbers: ");
        Complex result = num1.add(num2);
        System.out.println(num1);
        result.print();
    }

static class Complex{
        int a,b;

       /* public Complex(){
            a = 5;
            b = 9;
        }*/

        // Constructor Overloading

        public Complex(int real){
            a = real;
            b = 5;
        }

        /*public Complex(int real, int imaginary){
            a = real;
            b = imaginary;
        }*/

        // this -> removes ambiguity / current object ka reference always

        public Complex(int a, int b){
            this.a = a;
            this.b = b;
        }

        void print(){
            System.out.println(a+" + "+b+"i");
        }

        Complex add(Complex num2){
            System.out.println(this);
            this.print();
            num2.print();
            return new Complex(a+num2.a, b+num2.b );
        }
}

}
