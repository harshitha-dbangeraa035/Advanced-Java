/*2a. Develop a java program for performing various string operations with different string handling functions directed as follows String Creation and Basic Operations, Length and Character Access, 
String Comparison, StringSearching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/
package adjlab;

import java.util.Arrays;

public class Perform {
	

	
	    public static void main(String[] args) {
	       
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("str1: " + str1);
	        System.out.println("str2: " + str2);

	       
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str2: " + str2.charAt(1));

	      
	        String str3 = "hello";
	        System.out.println("str1 equals str3? " + str1.equals(str3));
	        System.out.println("str1 equalsIgnoreCase str3? " + str1.equalsIgnoreCase(str3));
	        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));

	        
	        String str4 = "Welcome to Java Programming";
	        System.out.println("Index of 'Java' in str4: " + str4.indexOf("Java"));
	        System.out.println("Last index of 'o' in str4: " + str4.lastIndexOf('o'));
	        System.out.println("Does str4 contain 'Programming'? " + str4.contains("Programming"));

	       
	        System.out.println("Substring of str4 from index 11 to 15: " + str4.substring(11, 15));
	        System.out.println("Substring of str4 from index 11 to end: " + str4.substring(11));

	        
	        String str5 = "  Java is fun!  ";
	        System.out.println("Original str5: '" + str5 + "'");
	        System.out.println("Trimmed str5: '" + str5.trim() + "'");
	        System.out.println("Replace 'fun' with 'awesome': " + str5.replace("fun", "awesome"));
	        System.out.println("Uppercase str1: " + str1.toUpperCase());
	        System.out.println("Lowercase str2: " + str2.toLowerCase());

	       
	        String whitespaceStr = "   Hello World   ";
	        System.out.println("Before trim: '" + whitespaceStr + "'");
	        System.out.println("After trim: '" + whitespaceStr.trim() + "'");

	        
	        String concatStr = str1 + " " + str2;
	        System.out.println("Concatenated string: " + concatStr);
	        concatStr = str1.concat(" ").concat(str2);
	        System.out.println("Concatenated with concat(): " + concatStr);

	      
	        String csv = "apple,banana,orange,grape";
	        String[] fruits = csv.split(",");
	        System.out.println("Split fruits: " + Arrays.toString(fruits));

	       
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        System.out.println("StringBuilder content: " + sb.toString());
	        sb.insert(6, "Java ");
	        System.out.println("After insert: " + sb.toString());
	        sb.replace(6, 10, "Beautiful ");
	        System.out.println("After replace: " + sb.toString());
	        sb.delete(6, 16);
	        System.out.println("After delete: " + sb.toString());

	       
	        int age = 25;
	        double salary = 12345.6789;
	        String formatted = String.format("Age: %d, Salary: %.2f", age, salary);
	        System.out.println("Formatted string: " + formatted);

	       
	        String email = "user@example.com";
	        boolean validEmail = email.contains("@") && email.endsWith(".com") && email.startsWith("user");
	        System.out.println("Is '" + email + "' a valid email? " + validEmail);

	        
	        String email2 = "admin#example.com";
	        boolean validEmail2 = email2.contains("@") && email2.endsWith(".com") && email2.startsWith("admin");
	        System.out.println("Is '" + email2 + "' a valid email? " + validEmail2);
	    }
	}



