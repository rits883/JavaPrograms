/**
 * 
 */
package org.rits.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author REETESH KUMAR CHOUBEY
 * 02-Feb-2019
 * calculator
 * 
 */
public class UnvalidOperatorException extends Exception{
	private  Logger logger  = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	
	
	public UnvalidOperatorException (String message) {
		logger.log(Level.WARNING,message);
	}
	
	
	
}
