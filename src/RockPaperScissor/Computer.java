package RockPaperScissor;

import java.util.Random;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public class Computer extends GameItems {
    private Random rand;

    public Computer () {
        super();
        rand = new Random();
    }
    //function returns one of the choices made by the computer
    public Roshambo getChoice() {
        //returns a number between 1-3 which represent Rock (1), Paper (2), Scissor (3)
        int choice = 1 + rand.nextInt(3);

        switch (choice) {
            case 1:
                return Roshambo.Rock;
            case 2:
                return Roshambo.Paper;

        }
        //if choice that computer makes is neither 1 or 2 than it will return 3 which is Scissor
        return Roshambo.Scissor;
    }


}
