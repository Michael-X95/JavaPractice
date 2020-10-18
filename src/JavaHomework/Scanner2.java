package JavaHomework;

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {
        firstName();
        //drink();
    }

    public static void firstName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        String first = scanner.next();
        System.out.println("Enter your last name");
        String last= scanner.next();
        String full = first + last;
        System.out.println("My full name is "+first+" "+last);

    }
    public static void drink(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total oz of water per cup");
        int oz = scanner.nextInt();
        System.out.println("Enter number of cups you drink on daily basis");
        int cup = scanner.nextInt();
        int totalozperday = oz*cup;
        System.out.println("Total oz of water per day is "+totalozperday);
    }

}
