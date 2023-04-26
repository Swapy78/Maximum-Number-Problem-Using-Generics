//Java program to extend the max method to take more than 3 parameters

package demo;

import java.util.*; 

public class ExtendGenericMethod {
	public static <T extends Comparable<T>> T maximum(T... elements) {
	    Arrays.sort(elements);
	    return elements[elements.length - 1];
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    // prompt user to enter elements
	    System.out.print("Enter elements (separated by spaces): ");
	    String input = sc.nextLine();
	    String[] elements = input.split("\\s+");

	    // call maximum method and print result
	    if (elements.length > 0) {
	        if (elements[0].matches("\\d+")) {
	            // elements are integers
	            Integer[] intElements = new Integer[elements.length];
	            for (int i = 0; i < elements.length; i++) {
	                intElements[i] = Integer.parseInt(elements[i]);
	            }
	            System.out.println("Maximum: " + maximum(intElements));
	        } else if (elements[0].matches("\\d+\\.\\d+")) {
	            // elements are floats
	            Float[] floatElements = new Float[elements.length];
	            for (int i = 0; i < elements.length; i++) {
	                floatElements[i] = Float.parseFloat(elements[i]);
	            }
	            System.out.println("Maximum: " + maximum(floatElements));
	        } else {
	            // elements are strings
	            System.out.println("Maximum: " + maximum(elements));
	        }
	    } else {
	        System.out.println("No elements entered.");
	    }

	    sc.close();
	}


}
