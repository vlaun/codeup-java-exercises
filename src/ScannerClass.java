import java.util.Scanner;

/**
 * Created by yleanavlaun on 1/9/17.
 */
public class ScannerClass {
    public static void main(String[] args) {
        //Prompt a user to enter a integer and store that value in an integer variable using the nextInt method.
        /*What happens if you input something that is not an integer?  Response is an error that says there is an
        exception in the main thread
         */

        Scanner sc = new Scanner(System.in);
        int userInput;

        System.out.println("Please enter a number: ");
        userInput = sc.nextInt();

        /*Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method.
        Display that sentence back to the user.
        Do you capture all of the words?  No, the console only prints out the first word of the sentence.
         */

        String userSentence;

        System.out.println("Please enter a sentence using your first name: ");
        userSentence = sc.next();
        System.out.println(userSentence +
                "" + sc.nextLine());

        //Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
        //What happens if you enter less than 3 words? The console will not continue until something is populated for the third word.

        String firstWord;
        String secondWord;
        String thirdWord;

        System.out.println("Enter first word: ");
        firstWord = sc.next();
        System.out.println("Enter second word: ");
        secondWord = sc.next();
        System.out.println("Enter third word: ");
        thirdWord = sc.next();
        System.out.println(firstWord + " " + secondWord + " " + thirdWord);








    }
}
