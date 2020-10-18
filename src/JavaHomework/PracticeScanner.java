package JavaHomework;

import java.util.Scanner;

public class PracticeScanner {

    public static void main(String[] args) {
        //firstScanner();
        firstcalculator();
    }

    public static void firstScanner() {
        Scanner scanner = new Scanner(System.in);
        // for scanner constructor dont need to put class name
        // type Scanner then at the drop down, pick scanner java.util
        //ex: scanner"pick java.util" variable = new scanner"pick java.util"(System.in);
        System.out.println("Enter your first name");
        String name = scanner.next();
        System.out.println("Thank you Mr." + name);

    }

    public static void firstcalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter single digit number");
        int num1 = scanner.nextInt();
        System.out.println("enter double digit number");
        int num2 = scanner.nextInt();
        int total = num1 + num2;
        System.out.println("total of the 2 numbers is: " + total);
    }

}
