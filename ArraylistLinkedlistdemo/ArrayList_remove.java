/*1b. Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList*/
package adjlab;

import java.util.ArrayList;
import java.util.List;

public class lab3 {
    public static void main(String args[]) {
        List<String> colors = new ArrayList<>();
        
        // Adding colors to the list
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Navy");
        colors.add("Brown");
        colors.add("Maroon"); 
        colors.add("Grey");   
        colors.add("Pink");   

        System.out.println("Initial list: " + colors);

        
        colors.remove("Green");
        System.out.println("After removing Green: " + colors);

        
        if (colors.contains("Blue")) {
            colors.remove("Blue");
            System.out.println("After removing Blue: " + colors);
        } else {
            System.out.println("Blue not found");
        }
    }
}
