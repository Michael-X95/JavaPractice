package Practice4.OOP.abstraction;

public class RunableCar extends Car implements Vehicle,Vehicle2 {


    @Override
    public void wheels() {
        System.out.println("4 wheels");

    }

    @Override
    public void move() {
        System.out.println("runable car can move");

    }

    @Override
    public void start() {
        System.out.println("runable car can start");
    }

    @Override
    public void stop() {
        System.out.println("runable car can stop");

    }

    @Override
    public void name() {

    }

    @Override
    public void window() {
        System.out.println();

    }
}
