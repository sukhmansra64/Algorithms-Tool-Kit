package advancedSortingAlgorithms;

import java.util.*;

public class MergeSort {
    public static void main(String[]args){
        String [] array = {"Chris", "Brennan", "Tara", "Malak", "Tristan"};
        recursiveMergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    //The time complexity of selection sort is O(nlogn) and the space complexity is O(nlogn)
    //Falls into the category of divide and conquer
    //Breaks the list into half until each element is the only element in a sublist, then it sorts the elements in the sublists
    //and merges those sublists whilst simultaneously sorting those elements until the original list length has been reconstructed
    public static <T extends Comparable<? super T>> void recursiveMergeSort(T[] array) {
        int n = array.length;
        if (n < 2) return;

        int mid = n / 2;
        T[] lowerArray = Arrays.copyOfRange(array, 0, mid);
        T[] upperArray = Arrays.copyOfRange(array, mid, n);

        recursiveMergeSort(lowerArray);
        recursiveMergeSort(upperArray);

        int i = 0, j = 0;
        while (i + j < array.length) {
            if (j == upperArray.length || (i < lowerArray.length && lowerArray[i].compareTo(upperArray[j]) < 0)) {
                array[i + j] = lowerArray[i++];
            } else {
                array[i + j] = upperArray[j++];
            }
        }
    }
}
