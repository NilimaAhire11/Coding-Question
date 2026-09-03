import java.util.*;
public class Main {
    public static int duplicate(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr1[] = {1, 3, 4, 2, 2};
        int arr2[] = {3, 1, 3, 4, 2}
        System.out.println(duplicate(arr1));
        System.out.println(duplicate(arr2));
    }
}


//Complexity Analysis
//Time Complexity: O(N log N), where N is the size of the array. This is because we are sorting the array, which takes O(N log N) time.
//Space Complexity: O(1), as we are sorting the array in-place and not using any additional data structures that grow with input size.
