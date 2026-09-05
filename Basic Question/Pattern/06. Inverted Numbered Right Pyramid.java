//Inverted Numbered Right Pyramid
//Problem Statement: Given an integer N, print the following pattern : 
  
import java.util.*;
public class Main {

    public static void main(String args[]){
      int n=5;
      for(int i=1; i<=n; i++){
          for(int j=n; j>=i; j--){
              System.out.print(n-j+1 + " ");
          }
          System.out.println();
      }
    }
}

OUTPUT:- 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1


//Complexity Analysis
//Time Complexity: O(N²), because nested loops iterate across the triangular number of elements.
//Space Complexity: O(1), as no extra data structures are used.
