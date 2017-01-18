import java.util.Scanner;

/**
 * Created by yleanavlaun on 1/5/17.
 */
public class BasicArithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scan.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scan.nextInt();

        int add = add(firstNumber, secondNumber);
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + add + "\n");

        int subtract = subtract(firstNumber, secondNumber);
        System.out.println("The difference of " + firstNumber + " and " + secondNumber + " is " + subtract + "\n");


        int multiply = multiply(firstNumber, secondNumber);
        System.out.println("The product of " + firstNumber + " and " + secondNumber + " is " + multiply + "\n");


        int divide = (int) divide(firstNumber, secondNumber);
        System.out.println("The result of " + firstNumber + " and " + secondNumber + " is " + divide + "\n");


        int modulus = modulus(firstNumber, secondNumber);
        System.out.println("The result of " + firstNumber + " and " + secondNumber + " is " + modulus + "\n");

    }

    public static int add(int a, int b) {

        return a + b;
    }
    public static int subtract(int a, int b) {

        return a - b;
    }
    public static int multiply(int a, int b) {

        return a * b;
    }
    public static double divide(int a, int b) {

        return (double) a / b;
    }
    public static int modulus(int a, int b) {

        return a % b;
    }
}
