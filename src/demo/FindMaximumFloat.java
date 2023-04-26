//Java program to find the maximum float number

package demo;

import java.util.Scanner;

public class FindMaximumFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a Scanner object to read user input from the console
        Scanner sc = new Scanner(System.in);

        // Telling the user to enter the first float number
        System.out.print("Enter the first number: ");

        // Reading the first float input from the user
        float number1 = sc.nextFloat();

        // Telling the user to enter the second float number
        System.out.print("Enter the second number: ");

        // Reading the second float input from the user
        float number2 = sc.nextFloat();

        // Telling the user to enter the third float number
        System.out.print("Enter the third number: ");

        // Reading the third float input from the user
        float number3 = sc.nextFloat();

        // Initializing the maximum number to be the first number
        float maximum = number1;

        // Checking if the second number is greater than the current maximum
        if (number2 > maximum) {
            maximum = number2;
        }

        // Checking if the third number is greater than the current maximum
        if (number3 > maximum) {
            maximum = number3;
        }

        // Printing the maximum number to the console
        System.out.println("The maximum number is " + maximum);

        // Closing the Scanner object to prevent memory leaks
        sc.close();
    }
}