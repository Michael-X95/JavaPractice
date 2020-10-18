package JavaHomework;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner3 scanner3 = new Scanner3();
        scanner3.date();


    }

    public void date() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today's date");
        int day = scanner.nextInt();
        System.out.println("Enter the month");
        int month = scanner.nextInt();
        System.out.println("Enter the full year");
        int year = scanner.nextInt();
        String date = (month + " " + day + " " + year);
        System.out.println("It is " + date);
    }
}

