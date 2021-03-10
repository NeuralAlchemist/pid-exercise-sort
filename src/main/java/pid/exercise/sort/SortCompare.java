package pid.exercise.sort;

import java.util.Arrays;

public class SortCompare {
    public static void main(String[] args) {
        int length = 100000;
        int[] veryLongArray = IntArrayGenerator.generateRandomSequence(length+1);
        int[] arraySortArray = veryLongArray.clone();
        int[] bubbleSortArray = veryLongArray.clone();
        int[] selectionSortArray = veryLongArray.clone();
        String space = "\t\t\t";
        System.out.println(space+"Time Taken"+space+"Algorithm Used");
        long beginArraySort = System.nanoTime();
        Arrays.sort(arraySortArray);
        long endArraySort = System.nanoTime();
        System.out.print(space);
        System.out.printf("%10d\t\t\t%12s%n",endArraySort-beginArraySort,"Arrays.sort()");
        long beginBubbleSort = System.nanoTime();
        BubbleSort.sort(bubbleSortArray);
        long endBubbleSort = System.nanoTime();
        System.out.print(space);
        System.out.printf("%10d\t\t\t%12s%n",endBubbleSort-beginBubbleSort,"BubbleSort.sort()");
        long beginSelectionSort = System.nanoTime();
        SelectionSort.sort(selectionSortArray);
        long endSelectionSort = System.nanoTime();
        System.out.print(space);
        System.out.printf("%10d\t\t\t%12s%n",endSelectionSort-beginSelectionSort,"SelectionSort.sort()");
    }
}
