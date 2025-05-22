/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
package program3;

import java.util.Scanner;

public class String_truncate {
	 public static String truncate(String str, int length) {
	        if (str.length()<=length) {
	            return str;
	        }
	        return str.substring(0,length-3)+"..."; 
	    }
  public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s=sc.nextLine();
	        System.out.print("Enter max length: ");
	        int len=sc.nextInt();
	  
	        String result = truncate(s,len);
	        System.out.println(result);
	    }
	}


