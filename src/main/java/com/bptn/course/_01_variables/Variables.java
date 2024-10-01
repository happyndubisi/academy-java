package com.bptn.course._01_variables;
 import java.util.Scanner;
public class Variables {

	public static void main(String[] args) {
		System.out.println("Hello");
<<<<<<< HEAD
		
		
			   
			     String greeting = null;
			     System.out.println(greeting);
			     
			     String message = "12" + 4 + 3;
			     System.out.println(message);
			     
			     
			     String message1 = "This is a test";
			     System.out.println(message1.length());
			     System.out.println(message1.substring(0,3));
			     System.out.println(message1.indexOf("is"));
			     System.out.println(message1.substring(5));
			     System.out.println(message1.indexOf("Hello"));
			   
			     
			  /*   String s1 = "abccba";
			     int pos = s1.indexOf("b");
			    System.out.println(pos); 
			    // String s1 = "baby";
			     //int len = s1.length();
			     //System.out.println(len);
			     
			     String s1 = "baby";
			     String s2 = s1.substring(0,3);
			     System.out.println= s2.substring(0,3)); */ 
			     
			     
			     /* System.out.println("Enter the string to check for palindrome: ");
			        Scanner scanner = new Scanner(System.in);
			        String input = scanner.nextLine();
			        String reverseInput = "";

			        for (int i = input.length() - 1; i >= 0; i--) {
			            reverseInput += input.charAt(i);
			        }

			        if (input.toLowerCase().equals(reverseInput.toLowerCase())) {
			            System.out.println("Input string is palindrome");
			        } else {
			            System.out.println("Input string is not palindrome");
			        } */
			        // I decided to  create a string variable here called word
			        String word = "apapa";
			        // i created another string variable here, it is empty because i intend to append the backward iteration of variable word here
			        String wordReverse = "";
			        // i did a for loop here, aim to reverse the string variable word. remember to use for loop you are suppose to know the length of the variable hence i used the .length
			        // property to find the length of variable word and assigned it to I-1, -1 because length starts from 1 not from 0 as index does, the set the condition to be if i is greater than
			        // or equal to 0, i which is how the length of word to reduce by 1, hence the loop will keep running until i is 0 the it will stop. further, i appended the the result of each iteration to 
			        // the variable wordReverse, i used charAt to be able to access the individual character of the string
			        		for(int i=word.length() -1; i>=0; i-- ) {
			        			wordReverse += word.charAt(i);
			        		}
			        // then i compared the word variable with wordReverse with 'equals' as equals is used to compare strings
			        if(word.equals(wordReverse)) {
			        	System.out.println(" Input strin  g is a palindrome");
			        } else{
			        	System.out.println("Input string is not a palindrome");
			        }
			         // the if statement will return 'Input string is a palindrome'

			        int series = 12345
			        		int holder = 0;
			        String seriesStr =Str.valueOfInt(series);
			        for(int i = seriesStr.length()-1; i>0; i--) {
			        	holder = holder * 10 + series.charAt[i]-'0');
			        }
			        
			        System.out.println(holder;)
			        
			        
			        
			
=======
		System.out.println("Hi");
>>>>>>> origin/main

	}
}
