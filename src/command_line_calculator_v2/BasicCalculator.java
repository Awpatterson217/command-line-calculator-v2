package command_line_calculator_v2;
/*
 * @author Adam Patterson
 */
public class BasicCalculator {
	static void runBasicCalculator(){
		System.out.println("********************");
		System.out.println("* Basic Calculator *");
		System.out.println("********************\n");

		int counter = 1;
	
		// Initializes the program and executes the selected operation on firstNum and nextNum.
		Methods.startCalc();
	
		// This application loops endlessly
		while(counter == 1){
		
			// The keepGoing method executes the selected operation on the values of currentAnswer and nextNum.	  
			Methods.keepGoing();
		}
	}	
}	