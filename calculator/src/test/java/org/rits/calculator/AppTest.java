package org.rits.calculator;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.rits.exception.StringNotValidException;


/**
 * Unit test for calculator App.
 */
public class AppTest {
	
	private CalculatorApp calculatorApp = new CalculatorApp();
	
	
	/**
	 * Test .1
	 * String should contains at least 3 char
	 * Two operand and one operator  -> 12+5
	 * */
	//@Test
	public void inValidStrinSizeNotValid() throws StringNotValidException {
		try {
		String inputString = "1+";
	   Boolean result =	calculatorApp.checkOperatorValidations(inputString);
		assertTrue(result);
		}
		catch (Exception e) {
			Assert.fail("Invalid String ");
			e.printStackTrace();
		}
	}

	//@Test
	public void validStrinSizeValid() throws StringNotValidException {
		try {
		String inputString = "1+2";
	   Boolean result =	calculatorApp.checkOperatorValidations(inputString);
		assertTrue(result);
		}
		catch (Exception e) {
			Assert.fail("Invalid String ");
			e.printStackTrace();
		}
	}
	
	/**
	 * Test 2. Should not allow Alphabets
	 * */
	
	//@Test
	public void inValidAlphabets() {
		try {
			String inputString = "2+3*4+A";
		   Boolean result =	calculatorApp.checkOperatorValidations(inputString);
			assertTrue(result);
			}
			catch (Exception e) {
				Assert.fail("Invalid String ");
				e.printStackTrace();
			}
	}
	
	
	/**
	 * Test 3. Should not allow special symbols
	 * */
	//@Test
	public void inValidSymbol() {
		try {
			String inputString = "2+3*4+$";
		   Boolean result =	calculatorApp.checkOperatorValidations(inputString);
			assertTrue(result);
			}
			catch (Exception e) {
				Assert.fail("Invalid String ");
				e.printStackTrace();
			}
	}
	
   /**
    * Test .4
    * Operators not allowed in beginning 
    * */

//	@Test
	public void inValidOperatorInBeginning () {
		try {
			String inputString = "+12";
		   Boolean result =	calculatorApp.checkOperatorValidations(inputString);
			assertTrue(result);
			}
			catch (Exception e) {
				Assert.fail("Invalid String ");
				e.printStackTrace();
			}
	} 
	
	 /**
	    * Test .5
	    * Operators not allowed at end 
	    * */
	//@Test
	public void inValidOperatorAtEnd() {
		try {
			String inputString = "1+2+";
		   Boolean result =	calculatorApp.checkOperatorValidations(inputString);
			assertTrue(result);
			}
			catch (Exception e) {
				Assert.fail("Invalid String ");
				e.printStackTrace();
			}
	}	
	
	/**
	    * Test .6
	    * String not allowed without operator
	    * */
	//@Test
	public void inValidWithoutOperator() {
		try {
			String inputString = "456";
		   Boolean result =	calculatorApp.checkOperatorValidations(inputString);
			assertTrue(result);
			}
			catch (Exception e) {
				Assert.fail("Invalid String ");
				e.printStackTrace();
			}
	}	
	
	  /**
	    * Test .7
	    * String not allowed  with  continue Operators
	    * */
	@Test
	public void inValidContinueOperators() {
		try {
			String inputString = "4*2+(3+3+5++5)";
		   Boolean result =	calculatorApp.checkOperatorValidations(inputString);
			assertTrue(result);
			}
			catch (Exception e) {
				Assert.fail("Invalid String ");
				e.printStackTrace();
			}
	}
	
	 /**
	    * Test .8
	    * Valid string
	    * */
//	@Test
	public void validOperator() {
		try {
			String inputString = "4*2";
		   Boolean result =	calculatorApp.checkOperatorValidations(inputString);
			assertTrue(result);
			}
			catch (Exception e) {
				Assert.fail("Invalid String ");
				e.printStackTrace();
			}
	}

	
	//@Test
	public void inValidOpenParentheses() {
		try {
			String inputString = "4*2+(+3+5+(";
		   Boolean result =	calculatorApp.checkParenthesesValidation(inputString);
			assertTrue(result);
			}
			catch (Exception e) {
				Assert.fail("Invalid String ");
				e.printStackTrace();
			}
	}
	
	
	//@Test
	public void inValidCloseParentheses() {
		try {
			String inputString = "4*2+)+3+5+)";
		   Boolean result =	calculatorApp.checkParenthesesValidation(inputString);
			assertTrue(result);
			}
			catch (Exception e) {
				Assert.fail("Invalid String ");
				e.printStackTrace();
			}
	}
	
	//@Test
	public void validParentheses() {
		try {
			String inputString = "4*2+(3+3+5+)";
		   Boolean result =	calculatorApp.checkParenthesesValidation(inputString);
			assertTrue(result);
			}
			catch (Exception e) {
				Assert.fail("Invalid String ");
				e.printStackTrace();
			}
	}
	
	
	
}
