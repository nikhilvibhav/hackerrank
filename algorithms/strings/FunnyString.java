import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testCases;
        testCases = in.nextInt();
        
        for(int k=0; k<testCases; k++) {
            String str = in.next();
            if(funString(str)) {
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }
        }
    }

    static boolean funString(String str) {
        //Declare two new character arrays, original and reversed
        char[] original = new char[str.length()];
        char[] reversed = new char[str.length()];
        
        //Save reversed of string in *reversed* array and original in *original* array
        for(int i = 0,j=str.length()-1; i<str.length();i++,j--) {
            original[i] = str.charAt(i);
            reversed[j] = str.charAt(i);  
        }
            
        boolean flag = true;
        
        //Returns false if |S(i)-S(i-1)| is not equal to |R(i) - R(i-1)|    
        for(int i=1; i<str.length(); i++) {
            if(Math.abs(original[i]-original[i-1]) != Math.abs(reversed[i]-reversed[i-1])){
                flag = false;
            }
        }
            
        return flag;
    }
}