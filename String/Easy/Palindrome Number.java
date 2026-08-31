//Optimal Solution using Two Pointer Approach

import java.util.*;
public class Main {
    public static boolean palindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "racecar";
        System.out.print(palindrome(str));
    }
}

// Time Complexity:- O(n)
// Space Complexity:- O(1)
