package CountingAlligatorsCloningSheep;

/**
 * Created by ${yleanavlaun} on ${01/21/2017}.
 */
public class Alligator implements Countable {
    //Create a class named Alligator that implements the Countable interface.



    private int count = 0;

//    public Alligator() {
//
//    }

    public int getCount() {

        return count;
    }

    public String getCountString() {
        return count + " alligator";
}
    public void incrementCount() {
        this.count++;
    }
    public void resetCount() {
        this.count = 0;
    }
}