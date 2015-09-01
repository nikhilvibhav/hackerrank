import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String str;
        str = in.nextLine().toLowerCase();
        str = str.trim();
        pangramOrNot(str);
    }

    static void pangramOrNot(String str) {
    	/*
         *Two arrays
    	 *panArray is char array that stores the character array of string str
    	 *alphabets is char array that stores the alphabets of english letter
    	**/
    	char[] panArray = str.toCharArray();
    	char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    	boolean flag = false;

    	Set<Character> set = new HashSet<Character>();

    	//Run the length of panArray and the length of alphabets and match them to determine they are equal or not
    	for(int i=0; i<panArray.length; i++) {
    		for(int j=0; j<alphabets.length; j++) {
    			if(panArray[i] == alphabets[j]) {
    				set.add(panArray[i]);
    				break;
    			}
    			continue;
    		}
    	}

    	//if the set stores all 26 alphabets, returns "pangram" else returns "not pangram"
    	if(set.size() == 26) {
    		System.out.println("pangram");
    	} else {
    		System.out.println("not pangram");
    	}
    }
}