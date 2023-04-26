//Java program to find the maximum string


package demo;


import java.util.Scanner;


public class FindMaximumString {


	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);


        // Telling the user to enter the first string

        System.out.print("Enter the first string: ");


        // Reading the first string input from the user

        String string1 = sc.nextLine();


        // Telling the user to enter the second string

        System.out.print("Enter the second string: ");


        // Reading the second string input from the user

        String string2 = sc.nextLine();


        // Telling the user to enter the third string

        System.out.print("Enter the third string: ");


        // Reading the third string input from the user

        String string3 = sc.nextLine();


        // Initializing the maximum string to be the first string

        String maximum = string1;


        // Checking if the second string is greater than the current maximum

        if (string2.compareTo(maximum) > 0) {

            maximum = string2;

        }


        // Checking if the third string is greater than the current maximum

        if (string3.compareTo(maximum) > 0) {

            maximum = string3;

        }


        // Printing the maximum string to the console

        System.out.println("The maximum string is " + maximum);


        // Closing the Scanner object to prevent memory leaks

        sc.close();

    }

}

	



