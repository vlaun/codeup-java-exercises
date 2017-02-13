package RockPaperScissor;

import java.util.Scanner;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public class GamePlayer extends GameItems {

    Scanner scan = new Scanner(System.in);

    public GamePlayer() {
        //this represents the constructor for the GamePlayer class
        super();


    }
    public Roshambo getChoice() {
        //Prompt the player to select rock, paper, or scissors.
        System.out.println("Please enter your choice:  R = Rock, P = Paper, S = Scissor");
        char playerChoice = scan.nextLine().toUpperCase().charAt(0);

        switch (playerChoice) {

            case 'R':
                return Roshambo.Rock;
            case 'P':
                return Roshambo.Paper;
            case 'S':
                return Roshambo.Scissor;
        }
        //If the user makes an invalid selection, display an appropriate error message
        // and prompt the user again until the user makes a valid selection.

        System.out.println("Input not valid.  Please enter a valid choice.");
        return getChoice();
    }
}
