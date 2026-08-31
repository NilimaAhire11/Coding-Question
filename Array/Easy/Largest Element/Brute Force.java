
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

