package RockPaperScissor;


/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public class Game extends GameItems {

    private GamePlayer player;
    private Computer computer;
    private Roshambo playerChoice;
    private Roshambo computerChoice;
    private Result result;

    //constructor
    public Game() {
        super();
        player = new GamePlayer();
        computer = new Computer();
    }
    public void play() {
        //allows for code from GamePlayer.java to run the choice the player made
        playerChoice = player.getChoice();
        //allows for code from Computer.java to run the random choice made by the computer
        computerChoice = computer.getChoice();
        result = getResults();

    }
    private void displayResults() {
        switch (result) {
            //if the player choice beats the computer choice then will display "GamePlayer wins."
            case Win:
                System.out.println(playerChoice + " beats " + computerChoice + ". GamePlayer wins.");
                break;
            //if the player choice loses to the computer choice then will display "Computer wins."
            case Lose:
                System.out.println(playerChoice + " loses " + computerChoice + ". Computer wins.");
                break;
            //if the player choice is the same as the computer choice then will display "It's a Tie."
            case Tie:
                System.out.println(playerChoice + " is the same as " + computerChoice + ". It's a Tie.");
                break;
        }
    }
    private Result getResults() {
        //if both the player and computer choice is the same then the result is a Tie
        if (playerChoice == computerChoice)
            return Result.Tie;

        switch(playerChoice) {
            //if the player chooses Rock and the computer chooses Scissor then the computer lost
            case Rock:
                return(computerChoice == Roshambo.Scissor ? Result.Win : Result.Lose);
            //if the player chooses Paper and the computer chooses Rock the computer lost
            case Paper:
                return(computerChoice == Roshambo.Rock ? Result.Win : Result.Lose);
            //if the player chooses Scissor and the computer chooses Paper, the computer lost
            case Scissor:
                return(computerChoice == Roshambo.Paper ? Result.Win : Result.Lose);

        }
        //Game will never give this result
        return Result.Lose;
    }

}
