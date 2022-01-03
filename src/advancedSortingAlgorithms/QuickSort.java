package advancedSortingAlgorithms;
import java.util.*;

public class QuickSort {
    public static void main(String[]args){
        String [] array = {"Chris", "Brennan", "Tara", "Malak", "Tristan"};
        quickSort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
    //The time complexity of Quick sort is O(n^2) and the space complexity is O(logn)
    //Falls into the category of divide and conquer
    //Breaks the list into 2 sublists about a pivot, then it sorts the elements in the sublists and merges those sublists
    // whilst simultaneously sorting those elements until the original list length has been reconstructed, each about the
    // previously selected pivot
    public static<T extends Comparable<? super T>> void quickSort(T[] array, int startIndex, int endIndex){
        if(startIndex < endIndex){
            int pivotIndex = partition(array, startIndex, endIndex);
            quickSort(array, startIndex, pivotIndex);
            quickSort(array, pivotIndex + 1, endIndex);
        }
    }

    public static <T extends Comparable<? super T>> int partition(T[] array, int startIndex, int endIndex){
        int pivotIndex = (startIndex + endIndex) / 2;
        T pivotValue = array[pivotIndex];
        startIndex--;
        endIndex++;
        while (true){
            do startIndex++; while (array[startIndex].compareTo(pivotValue) < 0) ;
            do endIndex--; while (array[endIndex].compareTo(pivotValue) > 0) ;
            if (startIndex >= endIndex) return endIndex;
            T temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
    }
}
