/**
 * 
 */
package com.creational.factory;

/**
 * @author REETESH KUMAR CHOUBEY
 *19-Dec-2018
 * com.creational.factory
 */
public class CarNotFoundException extends Exception  {

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		return  "Car type not valid ";
	}
	
	

}
