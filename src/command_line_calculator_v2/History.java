package command_line_calculator_v2;
/*
 * Once a calculation has been performed, the answered is stored in its respective stack - 
 * finHistoryStack or basicHistoryStack.
 */
import java.util.Stack;
/*
 * @author Adam Patterson
 */
public class History {
	
	// A stack that holds past financial calculations.
	public static Stack<Double> finHistoryStack = new Stack<Double>();
	
	public static void printFinHistory(){
		if(finHistoryStack.isEmpty()){
			System.out.println("There is no history.");
		}else{
			System.out.printf("OLDEST" + finHistoryStack + "NEWEST");
			System.out.println("");

		}
	} // End printFinHistory().
	// End financial calculations stack.
	
	
	// A stack that holds past basic calculations.
	public static Stack<Double> basicHistoryStack = new Stack<Double>();
	
	public static void printBasicHistory(){
		if(basicHistoryStack.isEmpty()){
			System.out.println("There is no history.");
		}else{
			System.out.printf("OLDEST" + basicHistoryStack + "NEWEST");
			System.out.println("");
		}
	}// printBasicHistory().
	// End basic calculations stack.
}
