import java.util.Scanner;

/**
 * Created by yleanavlaun on 1/4/17.
 */
public class LetterGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String userInput;
        String userWantsToContinue;
        int grade;
        String message;

        System.out.println("Welcome to the student grading application!");
        grade = sc.nextInt();

        if(grade >= 88) {
            message = "Student made an FirstProgram";
        } else if(grade >= 87) {
            message = "Student made a B";
        } else if(grade >= 67) {
            message = "Student made a C";
        } else if(grade >= 60) {
            message = "Student made a D";
        } else {
            message = "Student made an F.  Try again!";
        }

        System.out.println(message);
        System.out.println("Do you want to grade another student?");

        userWantsToContinue = sc.next();

        do{

        } while (userWantsToContinue.equalsIgnoreCase("yes"));
    }
}
