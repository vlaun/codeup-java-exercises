//import java.util.Scanner;
//
///**
// * Created by yleanavlaun on 1/6/17.
// */
//public class DiceRolling {
//    public static void main(String[] args) {
//        //Ask the user to enter the number of sides for a pair of dice.
//
//        int numberOfSidesPerDie = getNumberOfSides();
//
//
//        //Prompt the user to roll the dice.
//        System.out.println("Please roll dice ");
//
//        System.out.println("You have a " + numberOfSidesPerDie + " sided die...");
////
////        //“Roll” two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
////
//        int dieOne = rollDie(numberOfSidesPerDie);
//        int dieTwo = rollDie(numberOfSidesPerDie);
////
//        System.out.println("You rolled a " + dieOne + " and a " + dieTwo + ".");
//        System.out.println("Together, your total is " + (dieOne + dieTwo));
//
//        System.out.println("Do you want to roll the dice again? ");
//        if(scan.nextLine().equalsIgnoreCare("yes")) {
//            playAgain = true;
//        }
////
////        //Use static methods to implement the method(s) that generate the random numbers.
////
////        //Experiment with different Random number generators –start with the random() method of the Math class but also explore Java’s Random class.
//    }
//    public static int rollDie(int numberOfSides) {
//
//        return (int) Math.ceil(Math.random() * numberOfSides);
//    }
//    public static int getNumberOfSides() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("How many sides does your die have? ");
//        int sides = scan.nextInt();
//        return sides;
//    }
//
//}
