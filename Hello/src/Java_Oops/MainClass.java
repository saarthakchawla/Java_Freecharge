package Java_Oops;

public class MainClass {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.age = 5;
        d1.color = "Cream";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "Leo";
        d2.walk();

        Complex c1 = new Complex();
        c1.print(2,4);
    }


static class Dog{
    String name;
    int age;
    String color;

    void walk(){
        System.out.println(name + " is walking");
    }
    void bark(){
        System.out.println(name + " is barking");
    }
}

static class Complex{
        void print(int a, int b){
            System.out.println(a+" + "+b+"i");
        }
}

}
