package command_line_calculator_v2;
/*
 *  The FinancialFunctions class will contain methods that allow the user to utilize basic financial algorithms.
 *  This class must be instantiated. 
 */
import java.util.*;
/*
 * @author Adam Patterson
 */
public class FinancialFunctions {
	static Scanner userInput = new Scanner(System.in);
	private double value;
	
	// Calculates the future value of 'amount'.
	// Needs additional functionality, like allowing the user to add payments and changing how often interest accrues. 
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
	
	// The presentValue method will allow the user to calculate the present value of some amount
	// based upon a stated discount rate.
	double presentValue(){
		return value;
	}// End presentValue()
	
	// Will calculate the Present Value of some cash inflows minus the present value of some cash outflows.
	double netPresentValue(){
		return value;
	}// End netPresentValue()
	
	// The Amortization method will allow a user to calculate loan payments, based on some APR and length of time.
	// Will provide the user with a table which includes the dollar amount going towards principal and the dollar amount 
	// towards interest, by payment.
	double Amortization(){
		return value;
	}
	
	double getValue(){
		return value;
	}
}
