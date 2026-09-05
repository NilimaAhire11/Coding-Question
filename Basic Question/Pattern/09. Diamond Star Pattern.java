//Diamond Star Pattern
//Problem Statement: Given an integer N, print the following pattern : 

import java.util.*;
public class Main {

    public static void main(String args[]){
      int n=5;
      for(int i=1; i<=n; i++){
          //space
          for(int j=n-1; j>=i; j--){
              System.out.print(" " + " ");
          }
          //star
          for(int k=1; k<=2*i-1; k++){
              System.out.print("*" + " ");
          }
          System.out.println();
      }
      for(int i=n; i>=1; i--){
          //space
          for(int j=n-1; j>=i; j--){
              System.out.print(" " + " ");
          }
          //star
          for(int k=1; k<=2*i-1; k++){
              System.out.print("*" +" ");
          }
          System.out.println();
      }
    }
}

OUTPUT

        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 


//Complexity Analysis
//Time Complexity: O(N²), because there are nested loops that print a total of roughly N² characters.
//Space Complexity: O(1), as we use only variables and no extra data structures.
