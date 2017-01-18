import java.util.Scanner;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;

        do {
            i = i + 1;

// prints 1-100
            System.out.println(i);

//            if (i%3==0 && i%5==0)
//            {
//                System.out.printf("FizzBuzz\n");
//            }
//            else if (i%3==0)
//            {
//                System.out.printf("fizz\n");
//            }
//            else if (i%5==0)
//            {
//                System.out.printf("buzz\n");
//            }
//            else
//            {
//                System.out.printf("%d\n",i);
//            }

        }
        while (i <= 99);
    }
}
