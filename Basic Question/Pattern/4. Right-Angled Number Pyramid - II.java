// Right-Angled Number Pyramid - II
// Problem Statement: Given an integer N, print the following pattern : 

import java.util.*;
public class Main {
    public static void main(String args[]){
     int n = 5;
     for(int i=1; i<=n; i++){
         for(int j=1; j<=i; j++){
             System.out.print(i + " ");
         }
         System.out.println();
         }
    }
}

OUTPUT:-
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5

// Complexity Analysis
// Time Complexity: O(N²), because there are two nested loops: the outer loop for rows and the inner loop for printing numbers.
// Space Complexity: O(1), as only loop variables are used.
