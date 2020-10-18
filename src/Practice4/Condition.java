package Practice4;

public class Condition {
    public static void main(String[] args) {

        //String today ="sunday";
        //String today ="monday";
        String today = "friday";
        // if (condition)--ends{ }

        if (today.equalsIgnoreCase("sunday")) {
            System.out.println("i'll go to soccer");
        } else if (today.equalsIgnoreCase("monday")) {
            System.out.println("i'll go to class");
        } else if (today.equalsIgnoreCase("friday"))
            System.out.println("i'll hangout with my friends");


        int year = 2020;
        if (year == 2020) {
            //for int use ==
            System.out.println("horrible year for all of us");
        } else {
            System.out.println("as usual");
        }
        boolean isTodaySunny = true;
        if (isTodaySunny) {
            System.out.println("lets go fishing");
        } else {
            System.out.println("lets play badminton");
        }
        // || = or
        int a = 5;
        if (a == 5 || a>6){
            //either a = 5 matches or if a is greater than 6 matches, it'll print a
            System.out.println(a);
        }
        // && = and
        if (a==5 && a>4){
            System.out.println("today is the day");
            //both the first condition and second condition have to meet to print
        }
        // != = not equals

        if(a!=4){
            System.out.println("a is not equals to 4. a is : "+a);
            //all 3 conditions have to meet to print
        }
        // == = equals

        if (a==5){
            System.out.println("today a matched : "+a);
        }


    }
}
