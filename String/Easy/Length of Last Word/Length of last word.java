import java.util.*;
public class Main {
    public static int lengthOfLastWord(String s){
        String str = s.trim(); // trim():- remove Space from start and end.
        int count = 0;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) != ' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    public static void main(String args[]){
        String str = "Hello World";
        String str2 = " Fly me to the moon  ";
        System.out.println(lengthOfLastWord(str));
        System.out.println(lengthOfLastWord(str2));
    }
}

//Complexity Analysis
//Time complexity:- using trim() function O(n) and 1 loop O(n) = O(n) + O(n) = O(n)
//Space Complexity:- O(n)
