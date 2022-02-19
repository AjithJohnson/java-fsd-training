/*
 * 20)Write a program to take input of two numbers from the user. 
 * Now perform the particular arithmetic operation specified by the user and display the result.
Hint: use Switch case
 */

import java.util.Scanner;

public class programmm20 {

	public static void main(String[] args) {
		char operator;
	    Double num1, num2, result;
	    Scanner input = new Scanner(System.in);
	    
	    
	    
	    System.out.println("Enter first number");
	    num1 = input.nextDouble();

	    System.out.println("Enter second number");
	    num2 = input.nextDouble();
	    
        System.out.println("Choose an operator: +, -, *, or /");
	    
	    operator = input.next().charAt(0);

	    switch (operator) {

	      case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	    
	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      
	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      
	      case '/':
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	}

	}

