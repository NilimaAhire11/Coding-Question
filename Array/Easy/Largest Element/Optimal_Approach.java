import java.util.*;
public class Main {
    public static int largest(int arr[]) {
       int largest = Integer.MIN_VALUE;

       for(int i=0; i<=arr.length-1; i++){
           if(arr[i] > largest){
               largest = arr[i];
           }
       }
       return largest;
    }

    public static void main(String args[]){
        int arr[] = {2,5,1,3,0};
        System.out.print(largest(arr));
    }
}


// Complexity Analysis
// Time Complexity: O(N), where N is the size of the array, as we are iterating through the array once.
// Space Complexity: O(1), as we are using a constant
