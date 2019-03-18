package com.codewithray;

import com.codewithray.sort.BubbleSort;
import com.codewithray.sort.SelectionSort;

public class TestAlgorithms {
    public static void testBubbleSort(){
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] intArray = {55, 15, 0, 4, 7, 6, 4, 5};
        bubbleSort.sort(intArray);

        String[] stringArray = {"ray", "has", "a", "red", "bmw"};
        bubbleSort.sort(stringArray);
    }

    public static void testSelectionSort(){
        SelectionSort selectionSort = new SelectionSort();
        Integer[] intArray = {55, 15, 1, 44, 7, 16, 4, 75};
        selectionSort.sort(intArray);

        Character[] stringArray = {'a', 'f', 'z', 'r', 'q', 's', '5'};
        selectionSort.sort(stringArray);
    }
}
