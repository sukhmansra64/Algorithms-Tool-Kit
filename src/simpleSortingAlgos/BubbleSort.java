package simpleSortingAlgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[]args){
        String [] array = {"Chris", "Brennan", "Tara", "Malak", "Tristan"};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    //Bubble sort algorithm with a time complexity of O(n^2) and space complexity of O(1)
    //Falls into the category of dynamic programming
    //works by comparing 2 adjacent pairs and moves the larger element along the array until it reaches the end
    //after the first pass, the largest element is at the end, second largest at the 2nd from the end, etc...
    public static <T extends Comparable<? super T>> void bubbleSort(T[] array){
        for(int i = 1;i< array.length;i++){
            for(int j = 0; j< array.length-i;j++){
                if(array[j].compareTo(array[j+1])>0){
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
