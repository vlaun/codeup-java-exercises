import java.util.Scanner;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public class IncrementAndAssignmentOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 10;
//        x +=  5; //same as x = x + 5; this is an assignment operator
        x *= 5; //this is the same as x = x * 5;  this is an assignment operator
        //want to increment the value of "x" by 1.
//        x = x + 1;
        //another way of incrementing by 1 is by using x++
//        x++;

        //pre-increment operator
//        System.out.println("Pre-increment operation: ");
        //will first increment
//        System.out.println(++x);
//        System.out.println(x);


        //post increment operation
//        System.out.println("Post increment operation: ");
        //will print value and then increment
//        System.out.println(x++);
        System.out.println(x);
    }
}
