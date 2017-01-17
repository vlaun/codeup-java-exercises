import java.util.Arrays;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public class ArraysExamples {
    public static void main(String[] args) {

//        //Array.fill(arrayName, value) method
//
//        char[] grades = new char [5];
//        Arrays.fill(grades, 0, 2, 'A');
//        System.out.println(Arrays.toString(grades));


//        //Arrays.equals(array1, array2) method
//        int[] array1 = {1, 2, 3, 4};
//        int[] array2 = {1, 2, 4, 3};
//        System.out.println(Arrays.equals(array1, array2)); //returned "false" because arrays do not equal to each other as elements are arranged in a different order.


        //Arrays.copyOf(array, length) method

//        String[] foodJustinLikes = {"hamburger", "pie", "potatoes", "kale", "peanut butter"};
//        String[] foodPamLikes = Arrays.copyOf(foodsJustinLikes, 1, 3);
//        System.out.println(Arrays.toString(foodPamLikes));


        //Attays.copyOfRange(array, startIndex, toIndex) method
//        String[] students = {"Ron", "John", "Kevin", "Jeff", "Mittsy"};
//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));


//        //Arrays.binarySearch(array, value) method
//        String[] hayStack = new String [100];
//        Arrays.fill(hayStack, 0, 50, "hay");
//        Arrays.fill(hayStack, 50, 100, "wheat");
//
//        hayStack[87] = "needle";
//        //Make sure to sort array before executing binary search
//        Arrays.sort(hayStack);
//
//        int index = Arrays.binarySearch(hayStack, "needle");
//        System.out.println(index);
//

        //Array referencing and initializing multiple arrays from a variable name
//        String[] topBondFilms = new String[10];
//        topBondFilms[8] = "Quantum of Solace";
//        topBondFilms = new String[3];
//        //this will return null because 2 declarations are made at the same time.
//
//        System.out.println(Arrays.toString(topBondFilms));



        //Tow-dimensional arrays - an array of arrays.  Common kind arrays that are same length inside a parent array (pg 20 of slides)

//        int[][] spreadSheet = new int[6][6];
//
//        for(int i = 0; i < spreadSheet.length; i++) {
//            System.out.println("");
//            for(int j = 0; j < spreadSheet[i].length; j++);
//            System.out.println(spreadSheet[i][j] + " ");
//        }



//        //Rectangle and Jagged arrays
//        int[][] jaggedArray = new int[5][];
//
//        int[] row1 = new int[3];
//        int[] row2 = new int[10];
//        int[] row3 = new int[5];
//        int[] row4 = new int[7];
//        int[] row5 = new int[7];
//
//        jaggedArray[0] = row1;
//        jaggedArray[1] = row2;
//        jaggedArray[2] = row3;
//        jaggedArray[3] = row4;
//        jaggedArray[4] = row5;
//
//        System.out.println("\n");
//        for(int[] singleArray: jaggedArray) {
//            System.out.println(Arrays.toString());
//        }







    }
}


