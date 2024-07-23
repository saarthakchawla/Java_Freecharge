package Java_Oops;

public class Method_Overloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greetings();
        obj.greetings("Saarthak");
        obj.greetings("Saarthak", 2);
    }

static class Greet{
        void greetings(){
            System.out.println("Hello, Good Morning");
        }
        void greetings(String name){
            System.out.println("Hello " + name + " , Good Morning" );
        }
        void greetings(String name, int count){
            for (int i = 0; i < count; i++) {
                System.out.println("Hello " + name + " , Good Morning" );
            }
        }
}
}
