import java.util.Scanner;

/**
 * Created by yleanavlaun on 1/9/17.
 */
public class PerimeterAreaVolume {
    public static void main(String[] args) {
        //Calculate the perimeter and area of various classrooms at Codeup based on user input.
        //Prompt the user to enter values of length and width of the classroom.
        //Display the area and perimeter of that classroom.
        //Assume that the rooms are perfect rectangles.
        //Assume that the user will enter valid numeric data for length and width.
        //Accept decimal entries (12.5, for instance).
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the length of the room: ");
        double L = scan.nextDouble();

        System.out.println("Please enter width of room: ");
        double W = scan.nextDouble();


        double perimeter = (2 * L) + (2 * L);
        System.out.println("The perimeter of the room is: " + perimeter);


        System.out.println("Please enter the length of the room: ");
        double Length = scan.nextDouble();

        System.out.println("Please enter width of room: ");
        double Width = scan.nextDouble();


        double area = Length * Width;
        System.out.println("The area of the room is: " + area);



        System.out.println("Please enter the length of the room: ");
        double length = scan.nextDouble();

        System.out.println("Please enter width of room: ");
        double width = scan.nextDouble();

        System.out.println("Please enter height of room: ");
        double height = scan.nextDouble();


        double volume = (length * width)*height;
        System.out.println("The volume of the room is: " + volume);


        //Ask if the user wants to continue (keep measuring rooms!).
        String choice = "y";

        while(choice.equalsIgnoreCase("y")) {
        System.out.println("Would you like to continue measuring rooms?");
        choice = scan.next();


    }



        //Bonus
        //The application should continue only if the user agrees to.
        //Calculate the volume of the rooms.
    }
}

