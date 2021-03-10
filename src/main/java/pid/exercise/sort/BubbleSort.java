package pid.exercise.sort;

public class BubbleSort {


    public static void sort(int[] array) {
        boolean swapped = false;
        int count = 0;
        do{
            swapped = false;
            for(int j = 0; j <= array.length-2; j++){
                if(array[j] > array[j+1]){
                    swapElements(array, j, j+1);
                    swapped = true;
                }
            }
        }while(swapped);
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
