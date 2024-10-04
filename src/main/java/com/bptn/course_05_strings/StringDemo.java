package com.bptn.course_05_strings;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
	String userName = "happi";
			System.out.println(userName.length());
			System.out.println(userName.charAt(2));
			System.out.println(userName.substring(4));
			System.out.println(userName.substring(2,4));
			System.out.println(userName.equals("happ"));
			System.out.print(userName.trim());
			System.out.print(userName.indexOf('r'));
			
			
			//Read user input
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a String: ");
			String input = scanner.nextLine();
			// declare storage viariables
			int vowelCount = 0;
			int consonantCounr = 0;
			// convert everything to lowercase
			String lowerCaseInput = input.toLowerCase();
			// loop through each character
			for(int i=0; i<lowerCaseInput.length(); i++) {

	}
}
