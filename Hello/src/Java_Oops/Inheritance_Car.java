package Java_Oops;

public class Inheritance_Car extends Inheritance_Vehicle {

    String color;

    /*void accelerate(){ // Final method error.

    }*/

    void start(){
        // Brake b_obj = new Brake();
        // b_obj.braking(this);
        super.start(); // Parent Class
        // System.out.println(this);
        System.out.println(this.model+" is starting");
    }

    Inheritance_Car braking(){
        return this;
    }

    // Default Constructor:
    Inheritance_Car(){
        super(3);
        System.out.println("Car is created");
    }

    public static void main(String[] args) {
        Inheritance_Car obj = new Inheritance_Car();
        System.out.println(obj.wheelsCount);
        obj.wheelsCount = 4;
        obj.model = "Grand I10";
        obj.color = "Silver";
        obj.start();
        System.out.println(obj.wheelsCount);
        obj.accelerate();
    }

class Brake{
        void braking(Inheritance_Car car){
            System.out.println(car.model+ " is braking");
        }
}

}
