//Java program to find the maximum integer number


package demo;


import java.util.Scanner;


public class FindMaximumInteger {


	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		// Creating a Scanner object to read user input from the console

        Scanner sc = new Scanner(System.in);


        // Telling the user to enter the first number

        System.out.print("Enter the first number: ");


        // Reading the first integer input from the user

        Integer number1 = sc.nextInt();


        // Prompt the user to enter the second number

        System.out.print("Enter the second number: ");


        // Reading the second integer input from the user

        Integer number2 = sc.nextInt();


        // Telling the user to enter the third number

        System.out.print("Enter the third number: ");


        // Reading the third integer input from the user

        Integer number3 = sc.nextInt();


        // Initializing the maximum number to be the first number

        Integer maximum = number1;


        // Checking if the second number is greater than the current maximum

        if (number2.compareTo(maximum) > 0) {

            maximum = number2;

        }


        // Checking if the third number is greater than the current maximum

        if (number3.compareTo(maximum) > 0) {

            maximum = number3;

        }


        // Printing the maximum number to the console

        System.out.println("The maximum number is " + maximum);


        // Closing the Scanner object to prevent memory leaks

        sc.close();

    }

}
