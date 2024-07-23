package Java_String;

public class String_Methods {
    public static void main(String[] args) {
        String name = "   anUj@11*  ";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println("Carpet".startsWith("Car"));
        System.out.println("Bike".endsWith("op"));
        System.out.println("Carpet".charAt(3));  // Return char

        int age = 123;
        String s_age = String.valueOf(age);
        System.out.println(age + 2);
        System.out.println(s_age + 2);

        String hello = "I love Java.";
        String newHello = hello.replace("Java","Python");
        System.out.println(newHello);
        System.out.println(hello.contains("cpp"));

        String substring = hello.substring(2,6);
        System.out.println(substring);

        String words [] =  hello.split(" ");
        for(String word: words){
            System.out.println(word);
        }

        String color = "Brown";
        char letters[] = color.toCharArray();

        for(char letter: letters){
            System.out.println(letter);
        }

        String animal = "";
        if(animal.isEmpty()){
            System.out.println("empty");
        }
        else if (animal.isBlank()){
            System.out.println("blank");
        }
        else{
            System.out.println("None");
        }
    }
}
