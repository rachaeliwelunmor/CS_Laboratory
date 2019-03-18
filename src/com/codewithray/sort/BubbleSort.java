package com.codewithray.sort;

import com.codewithray.util.SortUtil;

public class BubbleSort extends SortUtil {

    /*
     * Bubble sort compares Adjacent items in an array and swaps them if they are in the wrong order
     * ---------------------------------------
     * This Implementation of the bubble sort algorithm moves the sorted elements to the right
     * the sorted partition grows from the right to the left.
     * It takes an Array of any type and sorts it
     */

    public <T extends Comparable<T>> void sort(T[] array) {
        for (int unsortedIndex = array.length -1; unsortedIndex > 0; unsortedIndex--){
            for (int i = 0; i < unsortedIndex; i++){
                if (array[i].compareTo(array[i+1]) > 0){
                    swap(array, i, i+1);
                }
            }
            printArray(array);
        }
    }
}
