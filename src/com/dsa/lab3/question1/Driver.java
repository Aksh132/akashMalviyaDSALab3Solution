package com.dsa.lab3.question1;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {

		// declaring input variables
		String input;
		Boolean result;

		// getting input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check for Balanced Brackets : ");
		input = sc.nextLine();


		// checking String for balanced brackets
		BalancingBrackets balanceBacket = new BalancingBrackets();
		result = balanceBacket.checkBalancedBrackets(input);


		if(result) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}


		// closing scanner
		sc.close();
	}

}
