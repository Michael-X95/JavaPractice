package JavaPractice;

import javax.swing.*;

public class Guitar {

    public static void main(String []args){



     printNumberOfStrings();
     printGuitarDetails( "Jackson");
     printGuitarDetails( "Ibanaz", "2020");
     printNumberOfStrings(12);
     //no need to type nameOfBrand because java will backtrack to the method.
    }


    public static void printNumberOfStrings(){
        System.out.println(6);
    }

    public static void printGuitarDetails(String nameOfBrand){
        System.out.println(nameOfBrand);
    }

    public static void printGuitarDetails(String nameOfBrand, String year){
        System.out.println(nameOfBrand+" "+year);
    }

    public static void printNumberOfStrings(int extraString){
        int numberOfStrings = 4;
        int totalString = numberOfStrings+extraString;
        System.out.println(totalString);
    }
}

