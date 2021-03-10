package pid.exercise.sort;

public class SelectionSort {

    public static void sort(int[] array) {
        int min;
        for(int i = 0; i <= array.length-2; i++){
            min = array[i];
            for(int j = i+1; j <= array.length-1; j++){
                if(min > array[j]){
                    swapElements(array, i, j);
                    min = array[i];
                }
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
