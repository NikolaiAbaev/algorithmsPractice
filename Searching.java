import java.util.ArrayList;
import java.util.Arrays;

public class Searching {
    /**
     * A recursive implementation of the binary search.
      *@param target
     * @param array
     * @param low
     * @param high
     * @return returns the index of the found number; if number was not found, returns -1;
     */

    public static int recursiveBinarySearch (int target, ArrayList<Integer> array, int low, int high){
        if (low > high) {return -1;}
        int mid = (low + high) / 2;

        if (target > array.get(mid)) {
            return recursiveBinarySearch(target, array, mid + 1, high);
        } else if (target < array.get(mid)) {
            return recursiveBinarySearch(target, array, low, mid -1);
        } else {
            return mid;
        }
    }
    
    public static int linearSearch(int target, ArrayList<Integer> array){
        int n = array.size();
        for (int i = 0; i < n; i++) {
            if (target == array.get(i)) {
                return i;
            }
        }
        return -1;
    }
}
