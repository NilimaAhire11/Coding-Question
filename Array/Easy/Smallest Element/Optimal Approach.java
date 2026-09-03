import java.util.*;
public class Main {
    public static int smallestElement(int arr[]){
       int smallest = Integer.MAX_VALUE;
       for(int i=0; i<=arr.length-1; i++){
           if(arr[i] < smallest){
               smallest = arr[i];
           }
       }
       return smallest;
    }

    public static void main(String args[]){
        int arr1[] = {2, 5, 1, 3, 0};
        int arr2[] = {8, 10, 5, 7, 9};
        System.out.println("The smallest element in the array is: " + smallestElement(arr1));
        System.out.println("The smallest element in the array is: " + smallestElement(arr2));
    }
}


//Complexity Analysis
//Time Complexity: O(N), where N is the size of the array, as we are iterating through the array once.
//Space Complexity: O(1), as we are using a constant
