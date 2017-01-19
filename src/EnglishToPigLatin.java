import java.util.Scanner;
/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public class EnglishToPigLatin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            String word;
            String pigLatinWord;
            String repeatAgain = "y";




                System.out.println("Please enter a word to be translated:  ");

                word = scan.nextLine();

                if (word.charAt(0) == 'a' ||word.charAt(0) == 'e' || word.charAt(0) == 'i' ||
                        word.charAt(0)=='o' || word.charAt(0)=='u')

                {

                    pigLatinWord = word + "way";

                } else {
                    pigLatinWord = word.substring(1) + word.charAt(0) + "ay";

                }

                System.out.println("The word you entered translates to: " + pigLatinWord);

                System.out.println("Do you want to play again? (y/n)"); {


        } while (repeatAgain.equals("y"));
            repeatAgain = scan.nextLine(); //why does the application not reiterate?

            }

        }


