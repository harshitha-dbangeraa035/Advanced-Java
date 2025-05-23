/*2b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending the string ‘AIET’ for 10000 times both 
in the StringBuffer and StringBuilder. Justify your answer which one is better.*/
package adjlab;

public class Stringhandling_performance {
	
	    public static void main(String[] args) {
	    	
	    	    
	    	        int n = 10000;
	    	        String text = "AIET";

	    	       
	    	        StringBuffer sbuffer = new StringBuffer();
	    	        long start1 = System.nanoTime();
	    	        for (int i = 0; i < n; i++) {
	    	            sbuffer.append(text);
	    	        }
	    	        long end1 = System.nanoTime();
	    	        System.out.println("StringBuffer time: " + (end1 - start1) / 1_000_000.0 + " ms");

	    	    
	    	        StringBuilder sbuilder = new StringBuilder();
	    	        long start2 = System.nanoTime();
	    	        for (int i = 0; i < n; i++) {
	    	            sbuilder.append(text);
	    	        }
	    	        long end2 = System.nanoTime();
	    	        System.out.println("StringBuilder time: " + (end2 - start2) / 1_000_000.0 + " ms");
	    	    }
	    	}

	



