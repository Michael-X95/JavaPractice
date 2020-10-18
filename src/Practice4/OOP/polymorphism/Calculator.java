package Practice4.OOP.polymorphism;

public class Calculator {
//Polymorphism

    //method overloading = same method name, different parameters, in the same class
    // static polymorphism for compile time polymorphism
    public static void main(String[]args){

        int additionData = calculator(10,20,30);
        int multiplicationData = calculator (3,5);
        //calculator is not a Constructor becauase it's not "new Calculator" new and cap C

        System.out.println(additionData);
        System.out.println(multiplicationData);
    }
    //store int additionData into a variable
    public static int calculator(int a,int b, int c){
        int d = a+b+c;
        return d;
    // using addition as requested

    }
    //store int multiplicationData into a variable
    public static int calculator (int a, int b){
        int c = a*b;
        return c;
        // using multiplication as requested
    }

    //create 2 calculators
    // - one of them will do addition of given 2 int
    // - another will do multiplication of given 2 int



    }


