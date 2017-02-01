import java.util.Scanner;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public class UserInputExercise {
    public static void main(String[] args) {

        //Scanner enables us to take input from user
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int userInputNumber = scan.nextInt();

        System.out.println("The number entered is: ");
        System.out.print(userInputNumber + ("\n"));
        scan.nextLine();



        System.out.println("Please enter a decimal value: ");
        double userInputDouble = scan.nextDouble();

        System.out.println("The decimal value entered is: ");
        System.out.print(userInputDouble + ("\n"));
        scan.nextLine();

        
        System.out.println("Please a message: ");
        String userInputString = scan.nextLine();

        System.out.println("The message entered entered is: ");
        System.out.print(userInputString + ("\n"));
        scan.nextLine();
    }
}
