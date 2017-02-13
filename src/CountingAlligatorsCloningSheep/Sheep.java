package CountingAlligatorsCloningSheep;

/**
 * Created by ${yleanavlaun} on ${01/21/2017}.
 */
public class Sheep implements Countable {
    private int count = 0;
    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void incrementCount() {
        count++;
    }


    public void resetCount() {
        count = 0;
    }


    public int getCount() {
        return count;
    }


    public String getCountString() {
        return count + " " + name;
    }

}
