package command_line_calculator_v2;

import java.util.Scanner;
/*
 * @author Adam Patterson
 */
public class Methods {
	static Scanner userInput = new Scanner(System.in);
	
	// The startCalc method is the first method executed.
	static void startCalc(){
		
		// An instance of the RunningCalculation class.
		RunningCalculations runningAnswer = new RunningCalculations();
		
		
		// A simple menu which presents the user with a key, each operator is associated with a number.
		// More operators can be added.
		System.out.println("Operators");
		System.out.println("+: Plus");
		System.out.println("-: Subtract");
		System.out.println("*: Multiply");
		System.out.println("/: Divide");
		System.out.print("\n");
		
		// Captures the first number. 
		System.out.println("First number: ");
		double num1 = userInput.nextDouble();
		System.out.print("\n");

		// Captures the operation the user wishes to perform.
		System.out.println("Operator: ");
		String firstOperator = userInput.next();
		System.out.print("\n");

		// Captures the second number.
		System.out.println("Second number: ");
		double num2 = userInput.nextDouble();
		System.out.print("\n");
		
		// Executes the firstCalc method. This method takes values in the same order captured. 
		runningAnswer.firstCalc(num1, firstOperator, num2);
		System.out.print("Current answer: ");
		System.out.println(runningAnswer.getCurrentAnswer());
		
		
	} // End startCalc.
	
	// The keepGoing method is the second and last method executed.
	static void keepGoing(){
	
		
		// Creates an instance of the RunningCalculations class.
		RunningCalculations runningAnswer = new RunningCalculations();
		
		// Allows the user to perform another operation on a new number(nextNum) and currentAnswer.
		System.out.println("Next operator: ");
		String nextOperator = userInput.next();
		System.out.print("\n");

		// Allows the user to enter the next number.
		System.out.println("Next number: ");
		double nextNumber = userInput.nextDouble();
		System.out.print("\n");

		// Performs the nextCalc method.
		runningAnswer.nextCalc(nextOperator, nextNumber);
		System.out.print("Current Answer: ");
		System.out.println(runningAnswer.getCurrentAnswer());
		
	
	} // End keepGoing.
	
} // End Methods class.
