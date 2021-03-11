package pid.exercise.sort;

public class SelectionSort {

    public static void sort(int[] array) {
        int min;
        int minIdx;
        //Add a minIndex to keep track of the minimum, and swap only at the last element
        for(int i = 0; i <= array.length-2; i++){
            min = array[i];
            minIdx = i;
            for(int j = i+1; j <= array.length-1; j++){
                if(array[minIdx] > array[j]){
                    minIdx = j;
                }
            }
            if(i != minIdx){
                swapElements(array, i, minIdx);
            }
        }
    }

    // Swaps elements at swapFrom index to swapTo index of array
    public static boolean swapElements(int[] array, int swapFrom, int swapTo){
        boolean result;
        try {
            int temp = array[swapTo];
            array[swapTo] = array[swapFrom];
            array[swapFrom] = temp;
            result = true;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("One or both of the indices are out of bounds!");
            result = false;
        }
        return result;
    }

}
