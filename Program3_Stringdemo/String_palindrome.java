/*Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():*/
package program3;

public class String_palindrome {
	public static boolean isPalindrome(String s){
		int left=0;
		int right=s.length()-1;
		while(left<right) {
			if(s.charAt(left)==s.charAt(right)) {
				return true;
			}
			left++;
			right--;
		}
	return false;
}

public static void main(String[] args) {
	String str="abs";
	isPalindrome(str);
	if(isPalindrome(str)) {
		System.out.println("The string is a palindrome.");
	}
	else {
		System.out.println("The string is not a palindrome.");
	}

}
}


