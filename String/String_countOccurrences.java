/*3b.Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()*/
package program3;

public class lab3 {
	public static int countOccurrences(String mainstr,String substr) {
		int count=0;
		for(int i=0;i<=mainstr.length()-substr.length();i++) {
			int index = mainstr.indexOf(substr, i);
			if (index == i) {
			    count++;
			}
}
		return count;
	}

	public static void main(String[] args) {
		String mainstr="helloooo";
		String substr="l";
		int res=countOccurrences(mainstr,substr);
		System.out.println(res);
	}

}


