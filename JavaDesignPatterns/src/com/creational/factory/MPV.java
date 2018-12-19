/**
 * 
 */
package com.creational.factory;

/**
 * @author REETESH KUMAR CHOUBEY
 *19-Dec-2018
 * com.creational.factory
 */
public class MPV implements Car {

	/* (non-Javadoc)
	 * @see com.creational.factory.Car#carSpecification()
	 */
	@Override
	public void carSpecification() {
     System.out.println("A multi-purpose vehicle (MPV) or multi-utility vehicle (MUV)"
     		+ " are commonly known as 'people carriers'. "
     		+ "They are designed to offer enhanced space and "
     		+ "comfort for passengers with two or three rows of ");
	}

}
