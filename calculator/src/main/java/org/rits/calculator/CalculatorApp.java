/**
 * 
 */
package org.rits.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import org.rits.exception.ParenthesesException;
import org.rits.exception.StringNotValidException;
import org.rits.exception.UnvalidOperatorException;

/**
 * @author REETESH KUMAR CHOUBEY 02-Feb-2019 calculator
 * 
 */
public class CalculatorApp {
	private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public List<Character> operatorsList = new ArrayList(Arrays.asList('+', '-', '*', '/', '^'));
	Boolean validationFlag =true;
	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {

		CalculatorApp app = new CalculatorApp();
		System.out.println("Please enter string ");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String input = sc.next();		
		app.checkOperatorValidations(input);
		app.checkParenthesesValidation(input);
         if(app.validationFlag) {
        	 System.out.println("Valid String "+input);
         }
	     
	}

	/**
	 * @param values
	 * @return Boolean
	 * 
	 */

	public Boolean checkOperatorValidations(String input) {
		validationFlag=true;
		int lenght = input.length();
		try {

			if (input.isEmpty() || lenght < 3) {
				validationFlag =false;
				throw new StringNotValidException("Please enter valid string ");
			}

			String regex = "[a-zA-Z!@#$%&_=|<>?{}\\\\\\\\[\\\\\\\\]~]";
			Pattern pattern = Pattern.compile(regex);
			if (pattern.matcher(input).find()) {
				validationFlag =false;
				throw new StringNotValidException("String is not valid it contains alphabets or special characters");
			}

			if (operatorsList.contains(input.charAt(0))) {
				validationFlag =false;
				throw new UnvalidOperatorException("Operator should not be allowed in beginning of String");
			}

			if (operatorsList.contains(input.charAt(input.length() - 1))) {
				validationFlag =false;
				throw new UnvalidOperatorException("Operator should not be allowed at end of String");
			}
			
			String regexSymbol = "[+-/*^]";
			 pattern = Pattern.compile(regexSymbol);
			 
			 if (!pattern.matcher(input).find()) {
				 validationFlag =false;
				throw new UnvalidOperatorException("Without operator calculation not posible");
			}

			 /** Check for two continuous operators*/
			 
			 for(int i =0;i<input.length()-1;i++) {
				 if(operatorsList.contains(input.charAt(i))) {
					    if(i+1<input.length()&&operatorsList.contains(input.charAt(i+1))) {
					    	 validationFlag =false;
					    	throw new UnvalidOperatorException("Two continuous operators operators now allowed");
					    	 
					    }
				 }
			 }
			
		}

		catch (Exception e) {
			logger.log(Level.WARNING, "Exception while executing getValues");
		}
		return validationFlag;
	}

	/***
	 * @param value
	 * @return Boolean
	 */
	public Boolean checkParenthesesValidation(String value) {
		
		try {
			

			char[] charArray = value.toCharArray();

			int openParenthes = 0;
			int closedParenthes = 0;
			for (char element : charArray) {
				if (element == '(')
					openParenthes++;
				if (element == ')')
					closedParenthes++;
			}
			if (openParenthes != closedParenthes) {
				validationFlag =false;
				throw new ParenthesesException("Please check Open and Close parentheses");
				
			}
		} catch (Exception e) {
			logger.log(Level.WARNING, "Exception while executing checkParenthesesValidation");
		}
		return validationFlag;
	}


}
