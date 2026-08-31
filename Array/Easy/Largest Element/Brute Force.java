
import java.util.*;
public class Main {
    public static int largest(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String args[]){
        int arr[] = {2,5,1,3,0};
        System.out.print(largest(arr));

    }
}


// Complexity Analysis
// Time Complexity: O(N log N), where N is the size of the array, as we are sorting the array.
// Space Complexity: O(1), as we are using a constant.
