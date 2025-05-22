/*1c. Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator 
( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package adjlab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlist_iterator {
	
		public static void main(String [] args){
	        LinkedList <String> ll = new LinkedList<>();
	        ll.add("Red");
	        ll.add("Green");
	        ll.add("Blue");
	        ll.add("Yellow");
	        ll.add("Orange");
	        System.out.println("Complete Color List:");
	        System.out.println(ll);
		Iterator<String> it = ll.listIterator(1);
	        System.out.println("Elements from index 2 onward:");
	        while(it.hasNext()){
	        System.out.println(it.next());
	        }
	    }

}
