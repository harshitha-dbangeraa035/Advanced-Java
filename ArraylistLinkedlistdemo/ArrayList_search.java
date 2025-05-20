/*1b.Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/
package adjlab;

import java.util.ArrayList;
import java.util.List;

public class lab2 {
    public static void main(String args[]) {
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Navy");
        colors.add("Brown");
        colors.add("Yellow"); 

        System.out.println(colors);

        
        if (colors.contains("Green")) {
            System.out.println("Found Green");
        } else {
            System.out.println("Not found");
        }
    }
}
