package CountingAlligatorsCloningSheep;

/**
 * Created by ${yleanavlaun} on ${01/21/2017}.
 */
public class CountUtil {

    public static void count(Countable c, int maxCount) {


        for (int i = 1; i <= maxCount; i++) {
            c.incrementCount();
            System.out.println(c.getCountString());
        }
    }

}