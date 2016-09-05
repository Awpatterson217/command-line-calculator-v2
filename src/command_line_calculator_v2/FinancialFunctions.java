package command_line_calculator_v2;
import java.util.*;
/*
 * @author Adam Patterson
 */
public class FinancialFunctions {
	static Scanner userInput = new Scanner(System.in);
	private double value;
	
	 double futureValue(){
		System.out.println("Amount:");
		double amount = userInput.nextDouble();
		System.out.println("Interest Rate:");
		double interestRate = userInput.nextDouble();
		System.out.println("Years:");
		double numOfYears = userInput.nextDouble();
		value = amount * Math.pow((1+interestRate), numOfYears);
		return value;
	}// End futureValue()
	
	double presentValue(){
		return value;
	}// End presentValue()
	
	double netPresentValue(){
		return value;
	}// End netPresentValue()
	
	double Amortization(){
		return value;
	}
	
	double getValue(){
		return value;
	}
}
