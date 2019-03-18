package com.codewithray.util;

public class SortUtil {

    public <T> void swap(T[] array, int i, int j){
        if (i == j){
            return;
        }

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public <T> void printArray(T[] array){
        for (T arr: array ) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }
}
