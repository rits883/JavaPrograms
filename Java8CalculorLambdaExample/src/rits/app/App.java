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
 * This example explains Java 8 Lambda function  changes.
 */
public class App  implements  CalculatorIntref {
	
	public App(int a,int b) {
		System.out.println("Consrctor calling");
	} 
	public App() {
		
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		App app = new App();
		
		/* Default methods **/
		app.callDefaultMethods();
		
		/* Static method  **/
		CalculatorIntref.printTrigonometricFunctions();
		
		/** Function implementation*/
		app.x_Plus_y();
		app.x_Minus_y();
		
		/** Method Reference  **/
		
		/** Static **/
		CalculatorIntref calculatorIntref = App::x_Pluse_Y_Cube;
		calculatorIntref.ploynomialFuntion(2, 3);
		
		/** Non static**/
		CalculatorIntref calculatorIntref2  = app::x_Minus_y_Cube;
		calculatorIntref2.ploynomialFuntion(4, 5);
		
		/** Constuctor **/
		CalculatorIntref calculatorIntref3  = App::new;
		calculatorIntref3.ploynomialFuntion(20, 30);
	
	}
	
	
	
	
	public void callDefaultMethods() {
		App app = new App();
		app.add(10, 20);
		app.minus(20, 10);
		app.multiplication(5, 4);
		app.devide(50, 5);
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
	
	
	

public static void  x_Pluse_Y_Cube(int x ,int y) {
	 int c = x*x*x+y*y*y-3*x*y*(x+y);
	 System.out.println("X Pluse Y Cube value "+c);
	 
}


public  void x_Minus_y_Cube(int x , int y) {
	int c  = x*x*x+y*y*y-3*x*y*(x-y);
	System.out.println("X Minus Y Cube value "+c);
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
