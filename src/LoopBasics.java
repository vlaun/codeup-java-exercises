import java.util.Scanner;

/**
 * Created by yleanavlaun on 1/4/17.
 */
public class LoopBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int var = 5;

        while (var <= 15) {
            System.out.println("Loop counter: " + var);
            var++;
        }
        System.out.println("\n");

        int i = 0;

        do {
            i = i + 2;

            System.out.println("Loop counter: " + i);

        }
        while (i <= 99);


        int j = 105;
        do {
            System.out.println("\n");


            j = j - 5;
            System.out.println("Loop counter: " + j);
        }
        while (j >= -5);



        for (int h = 1; i < 1000000; i++);



//        for (int a = 5; i <= 15; i++) {
//            System.out.println("a is " + a);
//        }
//        System.out.println("\n");
//
//        int i = 0;
//
//        do {
//            i = i + 2;
//
//            System.out.println("Loop counter: " + i);
//
//        }
//        while (i <= 99);
//
//
//        int j = 105;
//        do {
//            System.out.println("\n");
//
//
//            j = j - 5;
//            System.out.println("Loop counter: " + j);
//        }
//        while (j >= -5);
//
//


    }

}
















