/*
 * 1.	The professor you TA (Training Associate) for, Professor Jackson, shared with you the code she uses to auto-grade students’ work. She and the other TAs have encountered some problems with the code in the past when they enter the total possible point value for an assignment. Occasionally, they accidentally enter 0 for the total number of possible points and the program encounters a fatal error when trying to divide by 0.

	To help out with this issue, complete a function called divide() in Main. 

	The divide() method takes in two parameters: x and y.

	Your function should return the result of x/y.

	However, if y is zero, you should throw an exception. 

	Try to use an ArithmeticException and put your try/catch block in divide() to test out your error-handling skills. 

	If an exception is caught, make sure to print out a helpful message.

 */

package com.Exception.bll;

import java.util.Scanner;

public class TestAutoGradeStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int div;
		System.out.println("Enter two number");
		num = sc.nextInt();
		div = sc.nextInt();
		AutoGradeStudent Auto = new AutoGradeStudent();
		
		System.out.println("Division of number= "+Auto.divide(num,div));
		
	//closing scanner class object
		sc.close();
	}
	
}
