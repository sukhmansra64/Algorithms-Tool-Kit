package advancedSortingAlgorithms;
import java.util.*;

public class QuickSort {
    public static void main(String[]args){
        String [] array = {"Chris", "Brennan", "Tara", "Malak", "Tristan"};
        quickSort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static <T extends Comparable<? super T>> void quickSort(T[] array, int a, int b){
        if(a>=b) return;
        int left = a;
        int right = b-1;
        T pivot = array[b];
        T temp;
        while(left<=right){
            while(left<=right && array[left].compareTo(pivot)<0) left++;
            while(left<=right && array[left].compareTo(pivot)>0) right--;
            if(left<=right){
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;right--;
            }
        }
        temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        quickSort(array, a,left-1);
        quickSort(array, left+1, b);
    }
}
