import java.util.*;
public class Main {
    public static boolean isSorted(int arr[]){
        for(int i=0; i<=arr.length-1; i++){
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[j] < arr[i])
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
// Time Complexity: O(N2), as it uses two nested loops to compare every pair of elements in the array.
// Space Complexity: O(1), as no extra space is used apart from a few variables.
