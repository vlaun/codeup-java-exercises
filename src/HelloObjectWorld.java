import java.util.Scanner;

/**
 * Created by yleanavlaun on 1/6/17.
 */
public class HelloObjectWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        System.out.println("What is your first name? ");
        person.firstName = scan.nextLine();
        System.out.println("What is your last name? ");
        person.lastName = scan.nextLine();
        System.out.println("What is your email address? ");
        person.email = scan.nextLine();
        System.out.println("Hello " + person.firstName + " " + person.lastName + ", we have your email address as: " + person.email);

        System.out.println("Enter new person ");

        System.out.println("What is your first name? ");
        person2.firstName = scan.nextLine();
        System.out.println("What is your last name? ");
        person2.lastName = scan.nextLine();
        System.out.println("What is your email address? ");
        person2.email = scan.nextLine();
        System.out.println("Hello " + person2.firstName + " " + person2.lastName + ", we have your email address as: " + person2.email);

        System.out.println("Enter new person ");

        System.out.println("What is your first name? ");
        person3.firstName = scan.nextLine();
        System.out.println("What is your last name? ");
        person3.lastName = scan.nextLine();
        System.out.println("What is your email address? ");
        person3.email = scan.nextLine();
        System.out.println("Hello " + person3.firstName + " " + person3.lastName + ", we have your email address as: " + person3.email);
    }

}
