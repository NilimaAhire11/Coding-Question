import java.util.*;
public class Main {
    public static boolean isSorted(int arr[]){
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr));
        int arr2[] = {5,4,6,7,8};
        System.out.println(isSorted(arr2));
    }
}


// Complexity Analysis
// Time Complexity: O(N), as it checks each adjacent pair once in a single pass through the array.
// Space Complexity: O(1), as it uses constant extra space regardless of input size.
