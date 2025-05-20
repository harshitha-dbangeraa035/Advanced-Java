/*Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))*/
package adjlab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class lab9 {
	public static void main(String [] args){
        Deque<String> a = new LinkedList<>();
        a.add("Blue");
        a.add("Green");
        a.add("Red");
        a.add("Navy");
        a.add("Brown");
        a.add("Marroon");
        a.add("Grey");
        System.out.println("Original LinkedList:");
        System.out.println(a);

        
        a.offerLast("Pink");

        System.out.println("\nLinkedList after adding 'Pink' at the end:");
        System.out.println(a);
    }

}
