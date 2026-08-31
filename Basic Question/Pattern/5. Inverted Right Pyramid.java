// Inverted Right Pyramid
// Problem Statement: Given an integer N, print the following pattern : 

import java.util.*;
public class Main {
    public static void main(String args[]){
     int n = 5;
     for(int i=1; i<=n; i++){
         for(int j=n; j>=i; j--){
             System.out.print("* ");
         }
         System.out.println();
         }
    }
}

OUTPUT:-

* * * * * 
* * * * 
* * * 
* * 
* 


// Complexity Analysis
// Time Complexity: O(N²), since two nested loops are used.
// Space Complexity: O(1), as no extra data structures are needed.
