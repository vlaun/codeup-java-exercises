import java.util.InputMismatchException;
import java.util.Scanner;
//
///**
// * Created by ${yleanavlaun} on ${01/10/2012}.
// */
//public class BattingStatistics {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        int numberAtBats;
//        int[] atBats;
//        String name;
//        String anotherBatter;
//
//
//
//
//
//        do {
//            System.out.println("What is your name? ");
//            name = scan.nextLine();
//            System.out.println("How many times were you at bat? ");
//            numberAtBats = scan.nextInt();
//            atBats = new int[numberAtBats];
//
//            for (int i = 0; i < atBats.length; i++) {
//                System.out.println(
//                        "How many bases did you earn while at bat?"
//                );
//                atBats[i] = getBasesEarned(scan);
//            }
//
////            double battingAverage = ( (double) hits / atBats);
////            double sluggingAverage = calculateSluggingAverage(atBats);
////
////            System.out.printf(
////                    "Batting average: %.3f, Slugging average: %.3f%n",
////                    battingAverage,
////                    sluggingAverage
////            );
//
//            anotherBatter = getAnotherBatter(scan);
//
//        } while ("y".equalsIgnoreCase(anotherBatter));
//    }
//
//    private static double calculateSluggingAverage(int[] atBats) {
//        double sumOfBases = 0;
//        for (int numberOfBases : atBats) {
//            sumOfBases += numberOfBases;
//        }
//        return sumOfBases / atBats.length;
//    }
//
//    private static double calculateBattingAverage(int[] atBats) {
//        double countOfHits = 0;
//        for (int numberOfBases : atBats) {
//            if (numberOfBases > 0) {
//                countOfHits++;
//            }
//        }
//        return countOfHits / atBats.length;
//    }
//
//    private static String getAnotherBatter(Scanner scanner) {
//        System.out.println("Another Batter?");
//        String anotherBatter = scanner.next();
//
//        if (!"n".equalsIgnoreCase(anotherBatter)
//                && !"y".equalsIgnoreCase(anotherBatter)) {
//            return getAnotherBatter(scanner);
//        }
//
//        return anotherBatter;
//    }
//
//    private static int getBasesEarned(Scanner scanner) {
//        try {
//            int bases = scanner.nextInt();
//
//            if (bases < 0 || bases > 4) {
//                System.out.println("Please enter a number between 0 and 4");
//                return getBasesEarned(scanner);
//            }
//
//            return bases;
//        } catch (InputMismatchException e) {
//            System.out.println("Please enter a number");
//            return getBasesEarned(scanner);
//        }
//    }
//}

