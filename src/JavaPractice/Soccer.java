public class Soccer {

    //making 2 method with same name and printing them as accordingly.
    public static void main(String[] args){
    printTotalMembers();
    //when no value is inserted, it takes the method with print value, method that does not have a return value
    printTotalMembers(1);
    //when value is inserted, it takes the method that has a return value.
    }
    public static void printTotalMembers(){
        System.out.println(11);
        //method with a print
    }

    public static void printTotalMembers(int members){
        System.out.println(members);
        //method with a return value
    }

}
