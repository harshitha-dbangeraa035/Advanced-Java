/*1b. Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index*/
package adjlab;

import java.util.ArrayList;
import java.util.List;

public class Arraylist_delete {
	public static void main(String args[]){
		List<String> a=new ArrayList<>();
		a.add("Blue");
		a.add("Green");
		a.add("Red");
		a.add("Navy");
		a.add("Brown");
		a.add("Maroon");
		a.add("Grey");
		System.out.println("Original list: " +a);
		int n=a.size();
		a.remove(n-1);
		System.out.println("After removing last element: " +a);
}
}
