/*3b.Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()*/
package program3;
import java.util.Scanner;
public class String_countOccurrences {
	 public static int countOccurrences(String mainStr, String subStr) {
	        int count = 0;
	        int index = 0;
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length();
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String mainStr = "hellohellohello";
	        String subStr = "hello";
	        int result = countOccurrences(mainStr, subStr);
	        System.out.println("The substring \"" + subStr + "\" appears " + result + " time(s) in the main string.");
	    }
	}



    


