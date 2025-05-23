/*1b.Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/
package adjlab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arraylist_sort {
	public static void main(String args[]){
		List<String> color=new ArrayList<>();
		color.add("Blue");
		color.add("Green");
		color.add("Red");
		color.add("Navy");
		color.add("Brown");
		color.add("Maroon");
		color.add("Grey");
		System.out.println(color);
		Collections.sort(color);
		System.out.println(color);
		

}
}
