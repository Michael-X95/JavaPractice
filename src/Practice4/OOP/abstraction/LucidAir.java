package Practice4.OOP.abstraction;

public class LucidAir extends RunableCar {

    @Override
    public void start() {
        System.out.println("Runable cars can start");
        //@override allows the method to override parents methods
        //if you don't override, it'll print from the original method

    }

    public static void main(String[]args){
        LucidAir lucidAir = new LucidAir();
        lucidAir.start();
    }
}
