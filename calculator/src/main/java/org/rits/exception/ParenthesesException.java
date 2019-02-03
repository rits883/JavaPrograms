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
public class ParenthesesException extends Exception {
	private  Logger logger  = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public ParenthesesException(String message) {
	  logger.log(Level.WARNING,message);
	}
}
