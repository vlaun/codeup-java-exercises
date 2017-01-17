import java.util.Scanner;

/**
 * Created by yleanavlaun on 1/5/17.
 */
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input a number:");
        int number = input.nextInt();
        int fact = 1;

        for (int i=1; i <= number; i++) {
            fact = fact*i;

//            System.out.println("Would you like to continue?");
        }
        System.out.println("Factorial of entered number is: ");
        System.out.println(fact);
        System.out.println("Would you like to continue?");

        }
}


