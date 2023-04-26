//Java program to extend the max method to also print the max using generic method

//Write printMax generic method


package demo;


import java.util.Arrays;

import java.util.Scanner;


public class ExtendGenericMethod2 {

    // Defining a generic method that finds the maximum value in an array of elements of type T

    public static <T extends Comparable<T>> T maximum(T... elements) {

        // Sorting the elements in ascending order using the Arrays.sort() method

        Arrays.sort(elements);

        // Selecting the last element in the sorted array as the maximum value

        T max = elements[elements.length - 1];

        // Printing the maximum value to the console

        printMax(max);

        // Returning the maximum value

        return max;

    }


    // Defining a generic method that prints the maximum value of type T to the console

    public static <T> void printMax(T max) {

        System.out.println("Maximum: " + max);

    }


    public static void main(String[] args) {

        // Creating a new Scanner object to read input from the console

        Scanner sc = new Scanner(System.in);


        // Telling the user to enter a series of integers, separated by spaces

        System.out.println("Enter a series of integers, separated by spaces:");

        // Reading a line of input from the console

        String intInput = sc.nextLine();

        // Spliting the input string into an array of individual strings, separated by spaces

        String[] intStrings = intInput.split(" ");

        // Creating a new array of Integers with the same length as the string array

        Integer[] integers = new Integer[intStrings.length];

        // Converting each string in the string array to an Integer and store it in the Integer array

        for (int i = 0; i < intStrings.length; i++) {

            integers[i] = Integer.parseInt(intStrings[i]);

        }

        // Finding the maximum integer in the array using the maximum() method and store it in a variable

        Integer maxInt = maximum(integers);


        // Telling the user to enter a series of strings, separated by spaces

        System.out.println("Enter a series of strings, separated by spaces:");

        // Reading a line of input from the console

        String stringInput = sc.nextLine();

        // Spliting the input string into an array of individual strings, separated by spaces

        String[] strings = stringInput.split(" ");

        // Finding the maximum string in the array using the maximum() method and store it in a variable

        String maxString = maximum(strings);


        // Telling the user to enter a series of doubles, separated by spaces

        System.out.println("Enter a series of doubles, separated by spaces:");

        // Reading a line of input from the console

        String doubleInput = sc.nextLine();

        // Spliting the input string into an array of individual strings, separated by spaces

        String[] doubleStrings = doubleInput.split(" ");

        // Creating a new array of Doubles with the same length as the string array

        Double[] doubles = new Double[doubleStrings.length];

        // Converting each string in the string array to a Double and store it in the Double array

        for (int i = 0; i < doubleStrings.length; i++) {

            doubles[i] = Double.parseDouble(doubleStrings[i]);

        }

        // Finding the maximum double in the array using the maximum() method and store it in a variable

        Double maxDouble = maximum(doubles);


        // Closing the Scanner object to release system resources

        sc.close();

    }

}

