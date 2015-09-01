import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlternatingCharacters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String str;
        int testCases = in.nextInt();

        for(int k=0; k<testCases; k++) {
        	int count = 0;
        	str = in.next();
        	char[] charArr = str.toCharArray();

        	for(int i=0; i<charArr.length-1; i++) {
        		if(charArr[i] == charArr[i+1]) {
        			count++;
        		}
        	}
        	System.out.println(count);
        }
    }
}