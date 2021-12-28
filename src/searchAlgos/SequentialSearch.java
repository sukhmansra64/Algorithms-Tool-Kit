package searchAlgos;

public class SequentialSearch {
    public static void main(String[]args){
        String[] a1 = {"Chris", "Brennan", "Tara", "Malak", "Tristan"};
        String key = "Malak";
        System.out.println(iterativeSequentialSearch(a1,0,a1.length-1,key));
        System.out.println(recursiveSequentialSearch(a1,0,a1.length-1,key));
    }
    //iterative method for sequential search with a time complexity of O(n) and space complexity of O(1)
    //example of search and enumeration-type algorithm
    //works by iterating through each element and compares it to the key, if the key is found, it returns the index, if it doesn't
    // it returns -1
    public static <T> int iterativeSequentialSearch(T[] array, int first, int last, T key){
        int found = -1;
        if (!(first>last)){
            for(int i=first; i<last; i++){
                if(key.equals(array[i])) found = i;
            }
        }
        return found;
    }
    //time complexity of this version of sequential search is O(n), along with a space complexity of O(n)
    //example of reduction
    //works by checking the first element of the array, and then passing the function again by reducing it's range by 1
    //if the key is found it returns the index, if it isn't then -1 is returned
    public static <T> int recursiveSequentialSearch(T[] array,int first, int last, T key){
        int found = -1;
        if(first>last) return -1;
        else if (key.equals(array[first])){
            found = first;
        }
        else{
            first++;
            found = recursiveSequentialSearch(array,first,last,key);
        }
        return found;
    }
}
