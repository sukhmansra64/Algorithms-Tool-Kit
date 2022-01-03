package simpleSortingAlgos;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[]args){
        String [] array = {"Chris", "Brennan", "Tara", "Malak", "Tristan"};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    //Insertion sort is a stable sorting algorithm with a time complexity of O(n^2) and a space complexity of O(1)
    //Falls into the category of dynamic programming
    //Works by taking a temporary element and comparing it to every element before it, and places it in place where it is
    //smaller than all elements after it
    public static <T extends Comparable<? super T>> void insertionSort(T[] array){
        for(int i = 1; i< array.length;i++){
            T temp = array[i];
            for(int j = i-1;j>=0&&array[j].compareTo(temp)>0;j--){
                array[j+1] = array[j];
                array[j] = temp;
            }
        }
    }
}
