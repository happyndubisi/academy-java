package com.bptn.playground;
import java.util.Scanner;
public class StringOperations {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // initializing scanner
        int targetNumber = 23; // declearing the target integer variable

        System.out.println("Guess a number between 1 and 100 inclusive");
        int guess = scanner.nextInt();
        // if the user input is less than 23 print Too low! Try again.
        if(guess < 23){
            System.out.print("Too low! Try again.");
        } else if (guess == 23){ // if it is 23 then print Congratulations! You guessed the number correctly!
            System.out.println("Congratulations! You guessed the number correctly!");
        } else if (guess >23){ //if it is greater than 23 print Too high! Try again 
            System.out.println("Too high! Try again");
        } else { // if th number is not between 1-100 the print Please enter a number between 1 and 100
            System.out.println("Please enter a number between 1 and 100");
        }

        scanner.close(); 


/* summary
this code as user to input a number with 1-100 inclusive, using 23 as the bench mark, 
if the number is below 23, it tell the user the number they guess is too low, if the 
number is greater than 23, it tells the the number is too high while if the nuuumber is 23, 
it tells them congratulation. any number abova 100. or less than 1 it tells to enter a number between 1-100
*/





	}

}
