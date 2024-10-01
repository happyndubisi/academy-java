package com.bptn.playground;
import java.util.Scanner;

public class Caculator {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        double firstNum, secondNum;
        int cont = 1;
        
        do{ // print the menu list
            System.out.println("Calculator Menu");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");
            System.out.println("Make your selection");

            int selection = scanner.nextInt(); // integer variable to store user input
            switch(selection){ // the swith statement contain list of action to carry out depending on user input
            case 1: // for addition
        System.out.println("Enter first number"); // request user input
        firstNum = scanner.nextDouble(); // store the input
        System.out.println("Enter second number"); // request second user input
        secondNum = scanner.nextDouble(); // store the imput
            System.out.println(firstNum + secondNum); // add both inpot
            break; // stop the program from running other case if this case  carry out the task
          
            case 2: // subtraction
        System.out.println("Enter first number"); // request user input
        firstNum = scanner.nextDouble(); // store the input
        System.out.println("Enter second number"); // request second user input
        secondNum = scanner.nextDouble(); // store the input
            System.out.println(firstNum - secondNum); // subtraact second input from first then print result
          break; // stop the program from running other case if this case  carry out the task

            case 3: // multiplication
        System.out.println("Enter first number"); // request user input
        firstNum = scanner.nextDouble(); // store the input
        System.out.println("Enter second number");// request second user input
        secondNum = scanner.nextDouble(); // store the input
            System.out.println(firstNum * secondNum);// multiply both input
            break; // stop the program from running other case if this case  carry out the task

            case 4: // division
        System.out.println("Enter first number");//request user input
        firstNum = scanner.nextDouble(); // store the input
        System.out.println("Enter second number");// request second user input
        secondNum = scanner.nextDouble(); // store the input
        double result1 = (firstNum / secondNum); // store result for quotient divide first input by second
        double result2 = (firstNum % secondNum); // store result for remainder first input expontial second input
            System.out.println(firstNum / secondNum);
            System.out.println("The quotient is: "+ result1 + "  The remainder is: "+ result2 );
            break; // stop the program from running other case if this case  carry out the task

            case 5: // square a number
        System.out.println("Enter number"); // request user input
        firstNum = scanner.nextDouble(); // store the input
      
            System.out.println(firstNum * firstNum); // multiply input by itself and print result 
            break; // stop the program from running other case if this case  carry out the task

            case 6:// square root
        System.out.println("Enter number");// request user input
        firstNum = scanner.nextDouble(); //store the input
       
       // using the math method to get the squareroot of the input, then print the result
            System.out.println(java.lang.Math.sqrt(firstNum));
            break; // stop the program from running other case if this case  carry out the task

             case 7:// reciprocal
        System.out.println("Enter number"); //request user input
        firstNum = scanner.nextDouble();// store the input
        
        if(firstNum !=0){ 
           System.out.println(1/firstNum);// 1 divided by the input if the input is not 0
        } else{// else if the input is 0 print Reciprocal of zero is not defined
           System.out.println("Reciprocal of zero is not defined.");
        }
      
            break;// stop the program from running other case if this case  carry out the task
// if an invalid input is entered while making selection  the program notify
            default:
            System.out.println("Invalid choice! Please make a valid choice.");
            }// after every action the program ask if they want to continue
            System.out.println("To continue calculation Press 1, else press any other number to exit");
           cont = scanner.nextInt(); // store input of whether they want to contiue
          } while (cont == 1); // if they input 1 the program will repeat from beginning.
        

             scanner.close();   
        
        /* summary
        the code above shows how a simple calculator operates. it first display a menu, 
        show a list of 7 actions that can be carried out, and ask the user to enter an 
        input between 1-7 to make a selection, dependinng on the selection the user make,
        the program request for an input then carry on the action and prints the result, 
        after which, it ask the user if they want to continue or exist.
        if the use enter an invalid input, the program notify them
        */
		// TODO Auto-generated method stub

	}

}
