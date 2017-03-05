package command_line_calculator_v2;
/*
 *  The Methods class contains two static methods:
 *                  startCalc() and keepGoing(). 
 *                  
 *  These two static methods accepts user input.
 *  
 *  An instance of the RunningCalculations class is created: 
 *                  runningAnswer(num1, firstOperator, num2)
 *                                     or:
 *                  runningAnswer(nextOperator, nextNumber)
 */
import java.util.Scanner;
/*
 * @author Adam Patterson
 */
public class Methods {
	static Scanner userInput = new Scanner(System.in);
	// startCalc() is the first method executed.
	static void startCalc(){
		// An instance of the RunningCalculation class.
		RunningCalculations runningAnswer = new RunningCalculations();
		// A simple menu which presents the user with a key.
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
		// Executes firstCalc(). This method takes values in the same order captured. 
		runningAnswer.firstCalc(num1, firstOperator, num2);
		System.out.print("Current answer: ");
		System.out.println(runningAnswer.getCurrentAnswer());
		History.basicHistoryStack.push(runningAnswer.getCurrentAnswer());
	} 
	// keepGoing() is the second and last method executed.
	static void keepGoing(){
		// Creates an instance of the RunningCalculations class.
		RunningCalculations runningAnswer = new RunningCalculations();
		// Perform another operation on nextNum and currentAnswer.
		System.out.println("Next operator (or 'exit'): ");
		String nextOperator = userInput.next();
		if(nextOperator.equalsIgnoreCase("exit"))
			UI.goCalc();
		System.out.print("\n");
		// Enter the next number.
		System.out.println("Next number: ");
		double nextNumber = userInput.nextDouble();
		System.out.print("\n");
		// Performs nextCalc().
		runningAnswer.nextCalc(nextOperator, nextNumber);
		System.out.print("Current Answer: ");
		System.out.println(runningAnswer.getCurrentAnswer());
		History.basicHistoryStack.push(runningAnswer.getCurrentAnswer());	
	} 
} 
