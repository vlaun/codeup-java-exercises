package CountingAlligatorsCloningSheep;

/**
 * Created by ${yleanavlaun} on ${01/21/2017}.
 */
public class CountTestApp {
    // Create a class named CountTestApp that uses the CountUtil class to count an Alligator object 3 times
    // as shown in the console preview.
    public static void main(String[] args) {

        System.out.println("Counting alligators...\n");
        Countable alligator = new Alligator();
        CountUtil.count(alligator, 3);



        System.out.println("Counting sheep...\n");
        Sheep blackie = new Sheep ("Blackie\n");
        CountUtil.count(blackie, 2);

        Sheep dolly = new Sheep ("Dolly\n");
        CountUtil.count(dolly, 3);

        blackie.resetCount();
        CountUtil.count(blackie, 1);
    }
}