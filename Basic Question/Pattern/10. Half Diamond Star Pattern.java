//Half Diamond Star Pattern
//Problem Statement: Given an integer N, print the following pattern : 

import java.util.*;
public class Main {

    public static void main(String args[]) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n-1; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}


OUTPUT
  
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
*


//Complexity Analysis
//Time Complexity: O(N²), because there are nested loops that print a total of roughly N² characters.
//Space Complexity: O(1), as we use only variables and no extra data structures.
