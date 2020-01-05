public class Sort {

    public int[] bumblerSort (int[] array) {

        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i=0; i<array.length-1; i++){
                if (array[i]>array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = false;
                }
            }
        }
        return array;
    }

    public int[] insertionSort (int[] array) {

        int j, temp;
        for (int i = 1; i<array.length; i++){
            temp = array[i];
            for (j = i-1; j>=0 && array[j]>temp; j--){
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }
        return array;
    }


    public int[] selectionSort (int[] array) {

        for (int i=0; i<array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j<array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }

            }
                int temp = array[i];
                array[i] = min;
                array[minId] = temp;
            }

        return array;
    }



}
