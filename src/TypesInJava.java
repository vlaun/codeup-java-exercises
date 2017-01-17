/**
 * Created by yleanavlaun on 1/9/17.
 */
public class TypesInJava {
    public static void main(String[] args) {
        //create variables of every primitive type and print them to the Console

        byte myByte = 127;
        short myShort = 15;
        int myInteger = 89;
        float myDecimal = (float) 4.5;
        double myDouble = 89.2;
        char myChar = 'Y';
        boolean is_true = true;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInteger);
        System.out.println(myDecimal);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(is_true);

        //try to assign a character to a variable that has been declared as an int

        int myNumber = 'C';
        System.out.println(myNumber); //the Console will generate a number, but not the character that was input

        //try to define a variable with the name class
        char myClass = 'Z';  //class cannot be used as a name because it is already a class on its own
                             //can only be initialized is given another name.
        System.out.println(myClass);

        //initialize a variable, but do not assign it a value, then try and print it to the Console
        int myInput = 32;
        System.out.println(myInput); //Console will not initialize the variable without an assigned value.


    }
}
