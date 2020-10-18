package JavaPractice;

import java.util.Scanner;
//Scanner is imported from java.util
public class ScannerPractice {

    public static void main(String[] args) {
        //nameScanner();
        calculator();

    }
            public static void nameScanner () {
            Scanner scanner = new Scanner(System.in);
            //after typing Scanner' click on Scanner java.util
            //inside Constructor ("System.in)

            System.out.println("enter your name");
            //instruction for the user, telling user to enter your name in this case
            String name = scanner.next();
            //datetype variable = method.datatype(); next is a return type data
            System.out.println("Welcome to the world of Java Mr." + name);
            //scanner allows one to type inside the result

        }
            public static void calculator () {
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter first number");
            int number1 = scanner.nextInt();
            System.out.println("enter second number");
            int number2 = scanner.nextInt();
            int finalResult = number1 + number2;
            System.out.println("addition of the given numbers is: " + finalResult);
        }


        }