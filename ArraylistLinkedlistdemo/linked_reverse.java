/*Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())*/
package adjlab;

import java.util.Iterator;
import java.util.LinkedList;

public class lab8 {
	 public static void main(String [] args){
	        LinkedList<Integer> ll = new LinkedList<>();
	        ll.add(1);
	        ll.add(2);
	        ll.add(3);
	        ll.add(4);
	        ll.add(5);
	        ll.add(6);
	        System.out.println("Original LinkedList:");
	        System.out.println(ll);
	        
	        Iterator<Integer> descIterator = ll.descendingIterator();
	        while(descIterator.hasNext()){
	        System.out.println(descIterator.next());
	        }
	    }

}
