import java.util.Arrays;

public class Runner extends CommonMethods {

    private static Sort sort = new Sort();
    private static Searching searching = new Searching();

    public static void main(String[] args) {

        // --------------------------Sort--------------------------//

        /*int[] testArray = fillArray(100);
        startCountdown();
        sort.bumblerSort(testArray);
        finishCountdown();
        System.out.println("Result" + Arrays.toString(testArray));

        int[] testArray1 = fillArray(100);
        startCountdown();
        sort.insertionSort(testArray1);
        finishCountdown();
        System.out.println("Result" + Arrays.toString(testArray1));

        int[] testArray2 = fillArray(100);
        startCountdown();
        sort.selectionSort(testArray2);
        finishCountdown();
        System.out.println("Result" + Arrays.toString(testArray2));*/




        //------------------------Search----------------------------//

        int[] array = arrayForSearch();
        startCountdown();
        System.out.println(searching.linearSearch(array, 25));
        finishCountdown();

        startCountdown();
        System.out.println(searching.binarySearchIterative(array, 25));
        finishCountdown();






    }
}
