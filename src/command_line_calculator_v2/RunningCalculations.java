package command_line_calculator_v2;
/*
 * @author Adam Patterson
 */
public class RunningCalculations {
	private double currentAnswer;

	// Takes in three variables (firstNum, calculation choice, NextNum). 
	protected void firstCalc(double firstNum, String theOperator, double nextNum){
		switch(theOperator){
		case "+":
			currentAnswer = firstNum + nextNum;

			break; 
		case "-":
			currentAnswer = firstNum - nextNum;

			break;
		case "*":
			currentAnswer = firstNum * nextNum;
	
			break;
		case "/":
			if(firstNum > 0){currentAnswer = firstNum / nextNum;}
			
			else{System.out.println("ERROR: Division by zero");}
			
			break;
		default:
			System.out.println("ERROR: Invalid Operator");
		} 
	} // End firstCalc.
	
	// Takes in two variables (calculation choice, nextNum).
	protected void nextCalc(String theOperator, double nextNum){
		switch(theOperator){
		case "+":
			currentAnswer = currentAnswer + nextNum;
		
			break;
		case "-":
			currentAnswer = currentAnswer - nextNum;

			break;
		case "*":
			currentAnswer = currentAnswer * nextNum;
			
			break;
		case "/":
			if(currentAnswer > 0){currentAnswer = currentAnswer / nextNum;}
			
			else{System.out.println("ERROR: Division by zero");}
	
			break;
		default:
			System.out.println("ERROR: Invalid Operator");
		} 
	} // End nextCalc.


	double getCurrentAnswer() {return currentAnswer;} 
}// End RunningCalculations class

