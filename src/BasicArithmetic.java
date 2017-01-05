/**
 * Created by yleanavlaun on 1/5/17.
 */
public class BasicArithmetic {
    public static void main(String[] args) {
        int addResult = add(10, 40);
        System.out.println(addResult);

        int subtractResult = subtract(30, 5);
        System.out.println(subtractResult);

        int multiplyResult = multiply(80, 78);
        System.out.println(multiplyResult);

        int divideResult = divide(890, 75);
        System.out.println(divideResult);

        int modulusResult = modulus(8, 3);
        System.out.println(modulusResult);
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
    public static int divide(int a, int b) {
        return a / b;
    }
    public static int modulus(int a, int b) {
        return a % b;
    }
}
