package simpleSortingAlgos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[]args){
        String [] array = {"Chris", "Brennan", "Tara", "Malak", "Tristan"};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
    //The time complexity of selection sort is O(n^2) and the space complexity is O(1)
    //Falls into the category of dynamic programming
    //Starts at the beginning of the list, marking the first element in the list and compares it with the other elements,
    //once the smallest available element is found, it is swapped with the currently marked element
    public static <T extends Comparable<? super T>> void selectionSort(T[] array){
        for (int i=0; i< array.length;i++){
            int indexOfNextSmallest = i;
            for(int j = i+1;j<array.length;j++){
                if(array[j].compareTo(array[i])<0){
                    indexOfNextSmallest = j;
                }
            }
            T temp = array[i];
            array[i] = array[indexOfNextSmallest];
            array[indexOfNextSmallest] = temp;
        }
    }
}
