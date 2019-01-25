/**
 * 
 */
package rits.app;

import rits.interf.CalculatorIntref;

/**
 * @author REETESH KUMAR CHOUBEY
 * 25-Jan-2019
 * Java8CalculorLambdaExample
 * 
 * This example explains Java 8 Lambda function  changes
 */
public class App  implements CalculatorIntref{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		App app = new App();
		
		/* Default methods **/
		app.add(10, 20);
		app.minus(20, 10);
		app.multiplication(5, 4);
		app.devide(50, 5);
		
		/* Static method  **/
		CalculatorIntref.printTrigonometricFunctions();
		
		/** Function implementation*/
		app.x_Plus_y();
		app.x_Minus_y();
		
	}

	public void x_Plus_y() {
		
		CalculatorIntref calculatorIntref  = (x ,y)->{
			int value  = x*x+y*y+2*(x*y);
			System.out.println("Whole squar of X+Y "+value);
		};
		
		calculatorIntref.ploynomialFuntion(2, 4);
	}
	
	
public void x_Minus_y() {
		CalculatorIntref calculatorIntref  = (x ,y)->{
			int value  = x*x+y*y-2*(x*y);
			System.out.println("Whole squar of X-Y "+value);
		};
		
		calculatorIntref.ploynomialFuntion(2, 4);
	}
	
	
	/**
	 * This  method we are going to use implement  with Lambda function
	 * **/
	
	@Deprecated
	@Override
	public void ploynomialFuntion(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
