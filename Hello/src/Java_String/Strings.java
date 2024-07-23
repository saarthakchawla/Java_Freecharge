package Java_String;

public class Strings {
    public static void main(String[] args) {

        String name = "Anuj";
        String sameName = "Anuj";

        String newName = new String("Anuj");

        System.out.println(name);
        System.out.println(newName);

        System.out.println("Saarthak Chawla");

       /* if (name == sameName){
            System.out.println("Both are same");
        }

        if (name == newName){
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are not same");   // == -> Referencing / Addresses
        }*/

        if (name.equals(newName)){
            System.out.println("Same Values");
        }
        else {
            System.out.println("Not same");
        }
    }
}
