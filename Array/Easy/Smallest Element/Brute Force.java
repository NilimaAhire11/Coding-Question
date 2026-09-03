import java.util.*;
public class Main {
    public static int smallestElement(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String args[]){
        int arr1[] = {2, 5, 1, 3, 0};
        int arr2[] = {8, 10, 5, 7, 9};
        System.out.println("The smallest element in the array is: " + smallestElement(arr1));
        System.out.println("The smallest element in the array is: " + smallestElement(arr2));
    }
}


//Complexity Analysis
//Time Complexity: O(N log N), where N is the size of the array, as we are sorting the array.
//Space Complexity: O(1), as we are using a constant
