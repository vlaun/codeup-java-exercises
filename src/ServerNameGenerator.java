import java.util.Random;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] myAdjectives = {"Good", "New", "Last", "Long", "Great", "Little", "Own", "Other", "Old", "Right"};


        String[] myNouns = {"Man", "Mountain", "State", "Ocean", "Country", "Building", "Cat", "Dog", "Bird", "Frog"};

        int length = (myAdjectives.length);

        int rand;
        rand = (int) (Math.random() * length);
        System.out.println(myAdjectives[rand]);
        rand = (int) (Math.random() * length);
        System.out.println(myNouns[rand]);



    }





    }






