package com.codewithray.sort;

import com.codewithray.util.SortUtil;

public class SelectionSort extends SortUtil {

    /*
     * This implementation finds the largest element in the array and moves it to end of the
     * of the unsorted partition. the sorted partition grows from the right to the left.
     */

    public <T extends Comparable<T>> void sort(T[] array) {
        for (int unsortedIndex = array.length -1; unsortedIndex > 0; unsortedIndex--){

            int largestIndex =0;

            for (int i = 0; i <= unsortedIndex; i++){
                if (array[i].compareTo(array[largestIndex]) > 0){
                    largestIndex = i;
                }
            }
            swap(array, largestIndex, unsortedIndex);
            printArray(array);
        }
    }
}
