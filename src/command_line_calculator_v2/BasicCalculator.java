package command_line_calculator_v2;
/*
 * The BasicCalculator class provides the user with a title, and calls on 
 * startCalc() and keepGoing() from the Methods class - allowing the user to 
 * execute basic calculator functions.
 */

/*
 * @author Adam Patterson
 */
public class BasicCalculator {
	static void runBasicCalculator(){
		System.out.println("********************");
		System.out.println("* Basic Calculator *");
		System.out.println("********************\n");

		boolean calcOn = true;
	
		// Initializes the program and executes the selected operation on firstNum and nextNum.
		Methods.startCalc();
	
		// This application loops endlessly
		while(calcOn){
		
			// The keepGoing method executes the selected operation 
			// on currentAnswer and nextNum. (doubles)	  
			Methods.keepGoing();
		}
	}	
}	