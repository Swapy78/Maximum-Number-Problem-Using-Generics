//Java program to refactor to create generic class to take in 3 variables of generic type

package demo;

import java.util.Scanner;

public class Refactor2<T extends Comparable<T>> {
    private T var1;
    private T var2;
    private T var3;
    
    // parameter constructor
    public Refactor2(T var1, T var2, T var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }
    
    // method to find the maximum of the three variables
    public T findMaximum() {
        return Refactor1.maximum(var1, var2, var3);
    }
    
    // test method to internally call findMaximum method
    public void testMaximum() {
        T max = findMaximum();
        System.out.println("Maximum is: " + max);
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // get three integers from user
    System.out.println("Enter three integers:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    Refactor2<Integer> intMax = new Refactor2<>(a, b, c);
    intMax.testMaximum(); // prints "Maximum is: ..."

    // get three floats from user
    System.out.println("Enter three floats:");
    float d = sc.nextFloat();
    float e = sc.nextFloat();
    float f = sc.nextFloat();
    Refactor2<Float> floatMax = new Refactor2<>(d, e, f);
    floatMax.testMaximum(); // prints "Maximum is: ..."

    // get three strings from user
    System.out.println("Enter three strings:");
    String g = sc.next();
    String h = sc.next();
    String i = sc.next();
    Refactor2<String> stringMax = new Refactor2<>(g, h, i);
    stringMax.testMaximum(); // prints "Maximum is: ..."
    
    sc.close();
}
}
