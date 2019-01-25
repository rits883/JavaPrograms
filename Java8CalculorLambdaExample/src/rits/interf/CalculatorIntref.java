/**
 * 
 */
package rits.interf;

/**
 * @author REETESH KUMAR CHOUBEY
 * 25-Jan-2019
 * Java8CalculorLambdaExample
 * 
 */
@FunctionalInterface
public interface CalculatorIntref {
	public void ploynomialFuntion(int x ,int y);
	
	default void add(int x,int y) {
		System.out.println("Sum of X and Y "+(x+y));
	}
	
	default void minus(int x, int y) {
		System.out.println("Subtraction X and Y "+(x-y));
	}

	default void devide(int x, int y ) {
		System.out.println("Devide X and Y "+(x/y));
	}
	
	default void multiplication(int x, int y ) {
		System.out.println("Multiply X and Y "+(x*y));
	}
	
	
	public static  void  printTrigonometricFunctions() {
		System.out.println("Sin"+'\n'+ "Cos"+'\n'+"Tan"+'\n'+"Cosec"+'\n'+"Sec"+'\n'
				+"Cot"+'\n'+"Cot");
		
	}
}
