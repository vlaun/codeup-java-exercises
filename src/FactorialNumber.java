import java.util.Scanner;

/**
 * Created by yleanavlaun on 1/5/17.
 */
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Please input a number:");

        long n = scan.nextInt();
        long result = factorial(n);

        System.out.println("Factorial of " + n + " is " + result);
    }

    public static long factorial(long n) {

        long result = 1;

        for (long i = 1; i <= n; i++) {
            result = result * i;


//            System.out.println("Would you like to continue?");
        }
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            System.out.println("Would you like to continue measuring rooms?");
//            choice = scan.nextLn();



        }
        return result;
    }
}


