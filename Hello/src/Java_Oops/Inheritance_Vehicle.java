package Java_Oops;

public class Inheritance_Vehicle {

    int gears;
    final int gear = 4;

    public static void main(String[] args) {
        Inheritance_Vehicle v1 = new Inheritance_Vehicle(2);
        v1.gears = 5;
        // v1.gear = 3;  -> final error

    }

    int wheelsCount;
    String model;

    Inheritance_Vehicle(){
        System.out.println("Creating a vehicle instance");
    }

    Inheritance_Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with wheels");
    }

    void start(){
        System.out.println("Vehicle is Starting");
    }

    final void accelerate(){
        System.out.println("Woohhhhh!");
    }

}
