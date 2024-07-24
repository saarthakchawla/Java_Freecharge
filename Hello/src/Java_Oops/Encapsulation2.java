package Java_Oops;

public class Encapsulation2 {
    public static void main(String[] args) {
        name n1 = new name();
        n1.setAge(22);
        System.out.println("Age of the person is " + n1.getAge());
    }
}

class name {
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
