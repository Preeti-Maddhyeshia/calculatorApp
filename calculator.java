// Java program for simple calculator

import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class BasicCalculator {

	public static void main(String[] args)
	{
		getPercentage(obtained,total);
		// stores two numbers
		double num1, num2;

		// Take input from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers");

		// take the inputs
		num1 = sc.nextDouble();

		num2 = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/)");

		char op = sc.next().charAt(0);

		double o = 0;

		switch (op) {

		// case to add two numbers
		case '+':

			o = num1 + num2;

			break;

		// case to subtract two numbers
		case '-':

			o = num1 - num2;

			break;

		// case to multiply two numbers
		case '*':

			o = num1 * num2;

			break;

		// case to divide two numbers
		case '/':

			o = num1 / num2;

			break;

		default:

			System.out.println("You enter wrong input");

			break;
		}

		System.out.println("The final result:");

		System.out.println();

		// print the final result
		System.out.println(num1 + " " + op + " " + num2
						+ " = " + o);
	public double getPercentage(int obtained, int total){
							int total, score; 
       float percentage;
       Scanner inputNumScanner = new Scanner(System.in);
       
       System.out.println("Enter the total, or max, score: ");       
       total = inputNumScanner.nextInt();
       
       System.out.println("Enter the score obtained: ");
       score = inputNumScanner.nextInt();
       
       percentage = (score * 100/ total);
	   return percentage;
	}
}
