package searchAlgos;

public class BinarySearch {
    public static void main(String[]args){
        String[] a1 = {"Brennan", "Chris", "Malak", "Tara", "Tristan"};
        String key = "Malak";
        System.out.println(iterativeBinarySearch(a1, key));
        System.out.println(recursiveBinarySearch(a1,0,a1.length-1, key));
    }
    //iterative method for binary search with a time complexity of O(logn) and space complexity of O(1)
    //example of decrease and conquer-type algorithm
    //works by comparing middle element to the value of the key, if it is greater, it gets rid of the lower half, and vice versa
    //if it is larger, if the middle key becomes the required value, it returns the index, otherwise it returns -1
    public static <T extends Comparable<? super T>> int iterativeBinarySearch(T[] array, T key){
        int low = 0;
        int high = array.length;

        while(low<=high){
            int mid = (high+low)/2;
            if (key.compareTo(array[mid])>0) {
                high = mid-1;
            }
            else if(key.compareTo(array[mid])==0){
                return mid;
            }
            else{
                low = mid + 1;
            }
        }
        return -low-1;
    }
    //Recursive method for binary search with a time complexity of O(logn) and space complexity of O(logn)
    //example of decrease and conquer-type algorithm
    //works by comparing middle element to the value of the key, if it is greater, it gets rid of the lower half, and vice versa
    //if it is larger, if the middle key becomes the required value, it returns the index, otherwise it returns -1
    public static <T extends Comparable<? super T>> int recursiveBinarySearch(T[]array, int low, int high, T key){
        int found = -1;
        int mid = (low+high)/2;
        if(low>high) return found;
        else if(key.compareTo(array[mid])>0){
            return recursiveBinarySearch(array,low, mid-1, key);
        }
        else if(key.compareTo(array[mid])==0){
            return mid;
        }
        else return recursiveBinarySearch(array, mid+1, high, key);
    }
}
