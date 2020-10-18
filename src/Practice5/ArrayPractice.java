package Practice5;

public class ArrayPractice {

    public static void main(String[] args) {

        String name = "Adnan";
        String name2 = "Rahman";

        String [] names = {"Adnan", "Rahman", "Rahat"};
        //how to store multiple variables
        //System.out.println(names[0]);
        //System.out.println(names[1]);
        //System.out.println(names[2]);
        //how to print what you want inside the multiple variable method

        for(int a=0;a<3;a++){
            System.out.println(names[a]);
            //there's only 3 names going from 0,1,2 so it only prints Adnan = 0, Rahman = 1, Rahat = 2.

        }

        int [] numbers ={1,2,3,4,5};
        System.out.println(numbers[2]);

        Object [] everything = {123,"abc",852,777,888,"ad"};
        System.out.println(everything[3]);

        Object zipCode = everything[0];
            System.out.println(everything[4]);
            //picks the first one inside the Object [] everything
        }
    }



