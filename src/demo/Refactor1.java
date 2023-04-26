//Java program to refactor all the 3 to one generic method and find the maximum

package demo;

import java.util.Scanner; 

public class Refactor1 {

    // determines the largest of three Comparable objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {

        T maximum = x; // assume x is initially the largest

        if (y.compareTo(maximum) > 0)
            maximum = y; // y is the largest so far

        if (z.compareTo(maximum) > 0)
            maximum = z; // z is the largest

        return maximum; // returns the largest object
    } // end method maximum


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get three integers from user
        System.out.println("Enter three integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Maximum integer is: " + Refactor1.maximum(a, b, c));

        // get three floats from user
        System.out.println("Enter three floats:");
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        float f = sc.nextFloat();
        System.out.println("Maximum float is: " + Refactor1.maximum(d, e, f));

        // get three strings from user
        System.out.println("Enter three strings:");
        String g = sc.next();
        String h = sc.next();
        String i = sc.next();
        System.out.println("Maximum string is: " + Refactor1.maximum(g, h, i));
  
        sc.close();
    }
   
    
}
        
        