/*1c. Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )*/
package adjlab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lab10 {
	public static void main(String [] args){
        List<String> a = new LinkedList<>();
        a.add("Blue");
        a.add("Green");
        a.add("Red");
        a.add("Navy");
        a.add("Brown");
        System.out.println(a);
        System.out.println("Elements and their positions in the LinkedList:");
        int n=a.size();
        for(int i=0;i<n;i++){
        System.out.println("Element at index "+i+" is: "+a.get(i)); 
        } 
    }

}
