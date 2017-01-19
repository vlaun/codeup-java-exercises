import java.util.Scanner;

/**
 * Created by yleanavlaun on 1/4/17.
 */
public class TableOfPowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice = "y";
        int h = 2;
        int numberSquared = (int) Math.pow(h, 2);
        int numberCubed = (int) Math.pow(h, 3);

        do {
            //Prompts the user to enter an integer
            System.out.println("Please input an integer: ");
            h = scan.nextInt();

            System.out.println("Numbers:         | Squares:            | Cubes:          ");
            System.out.println("------------------------------------------------------");


            for (int i = 1; i <= h; i++) {


                String message = "\n" + h + "       " + numberSquared + "       " + numberCubed;

                System.out.print(message);
            }

// see if the user wants to continue


        }
//            String choice = "y";
        while (choice.equalsIgnoreCase("y"));
        {
            System.out.println("Would you like to continue measuring rooms?");
            choice = scan.next();

        }
    }
}

