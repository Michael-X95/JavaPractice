package Practice4.OOP.abstraction;

public class UserWhoUseTheCar {

    public static void main(String[] args) {

        //i - i
        //implements - interface
        //extends - class/abstract class
        //implements more than one interface
        //only one abstract class/ class is allowed.

        //method overriding - same method name, different/same params, in the different class
        //dynamic polymorphism or run time polymorphism

        RunableCar runableCar = new RunableCar();
        runableCar.move();
        runableCar.name();
        runableCar.start();
        runableCar.stop();
    }
}
