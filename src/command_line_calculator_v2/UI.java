package command_line_calculator_v2;
/*
 *  This class is just a series of menus.
 *  
 *  The UI class contains a series of methods that return menu selections in the form of integers.
 *  The goCalc() method receives the integers and runs them through a switch statement. 
 *  The case that executes depends on the return value of the integer chosen by the user.
 *  
 */
import java.util.*;
/*
 * @author Adam Patterson
 */
public class UI {

	static Scanner userInput = new Scanner(System.in);
	
	static int mainMenu(){
		System.out.println("*************");
		System.out.println("* Main Menu *");
		System.out.println("*************\n");
		
		System.out.println("1: Basic Calculator");
		System.out.println("2: Finance Functions");
		System.out.println("3: History");
	
		int choice = userInput.nextInt();
		return choice;
	}
	
	static int financeMenu(){
		System.out.println("***********************");
		System.out.println("* Financial Functions *");
		System.out.println("***********************\n");

		System.out.println("1: Future Value");
		System.out.println("2: Present Value");
		System.out.println("3: Net Present Value");
		System.out.println("4: Amortization Schedule");
		System.out.println("5: Home");
		
		int choice = userInput.nextInt();
		return choice;
	}
	
	// The goCalc() method is the first method executed. 
	static void goCalc(){
		switch(mainMenu()){
		case 1:
			BasicCalculator.runBasicCalculator();
			break;
			
		case 2:
			// Currently, most methods in the FinancialFunctions class lack signatures. 
			FinancialFunctions finance = new FinancialFunctions();
			switch(financeMenu()){
			case 1:
				System.out.println("Answer: $" + finance.futureValue());
				System.out.println("");
				History.finHistoryStack.push(finance.getValue());
				UI.goCalc();
			case 2:
				
				History.finHistoryStack.push(finance.getValue());
				UI.goCalc();
			case 3:
				
				History.finHistoryStack.push(finance.getValue());
				UI.goCalc();
			case 4:
				
				History.finHistoryStack.push(finance.getValue());
				UI.goCalc();
			case 5:
				goCalc();
			}
		case 3:
			System.out.print("Financial Calculations: ");
			History.printFinHistory();
			
			System.out.print("Basic Calculations: ");
			History.printBasicHistory();
			System.out.println("");
			goCalc();
		default:
			System.out.println("That was not a valid choice.");
		}		
	}
}
