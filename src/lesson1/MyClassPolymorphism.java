package lesson1;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public class MyClassPolymorphism {
    public static void main(String[] args) {

        //whenever a class object is defined and has many form is called polymorphism.
        //can appoint reference to any derived class.
        //can define reference or point reference to a base class to any object of the derived class.
        //when the reference of the parent class points to the object of the subclass this is called upcasting.

        //references point to different objects, but all objects point to the "Bank" class

        Bank abc = new BankABC();
        Bank def = new BankDEF();
        Bank xyz = new BankXYZ();


        System.out.println("The interest rate offered by Bank ABC is: " + abc.getInterestRate() + ('%') + ("\n"));
        System.out.println("The interest rate offered by Bank DEF is: " + def.getInterestRate() + ('%') + ("\n"));
        System.out.println("The interest rate offered by Bank XYZ is: " + xyz.getInterestRate() + ('%') + ("\n"));
    }


}
