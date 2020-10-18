package Practice4;

import java.util.Scanner;

public class ScannerException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert first number: ");
        int a = scanner.nextInt();
        int b;
        System.out.println("insert second number: ");
        try {
            b = scanner.nextInt();
        } catch (Exception e) {
            b = scanner.nextInt();
            System.out.println("please try again to insert second integer");
        }
        int c = a + b;
        System.out.println("total is : " + c);
    }
}
