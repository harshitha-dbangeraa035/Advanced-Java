/*Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
package adjlab;

import java.util.ArrayList;
import java.util.List;

public class Lab5 {
	public static void main(String args[]){
		List<String> ar=new ArrayList<>();
		ar.add("Blue");
		ar.add("Green");
		ar.add("Red");
		ar.add("Navy");
		ar.add("Brown");
		ar.add("maroon");
		ar.add("Grey");
		
		System.out.println("Full color list: " +ar);
		List<String> s=ar.subList(0,2);
		System.out.println("Extracted colors (1st and 2nd): " +s);
}
}
