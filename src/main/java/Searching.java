

public class Searching {

    public  int linearSearch (int[] array, int elemToSearch) {
        for (int i = 0; i<array.length; i++) {
            if (array[i] == elemToSearch)
                return i;
        }
        return -1;
    }


    public int binarySearchIterative (int[] array, int elemToSearch) {

        int firstIndex = 0;
        int lastIndex = array.length-1;

        while (firstIndex<=lastIndex) {
            int middleIndex = (lastIndex + firstIndex) / 2;
            if (array[middleIndex] == elemToSearch) {
                return middleIndex;
            } else if (array[middleIndex] > elemToSearch) {
                lastIndex = middleIndex - 1;
            } else if (array[middleIndex] < elemToSearch) {
                firstIndex = middleIndex + 1;
            } else {
                return -1;
            }
        }
        return elemToSearch;

    }

    public int binarySearchRecursive (int[] array, int elementToSearch, int firstElem, int lastElem) {

        if (lastElem>=firstElem){
            int midIndex = firstElem + (firstElem+lastElem)/2;

            if (array[midIndex] == elementToSearch) {
                return midIndex;
            }

            if (array[midIndex] > elementToSearch) {
                /*return binarySearchRecursive()*/

            } else {
                /*return binarySearchRecursive()*/
            }
        }



return -1;

    }

}
