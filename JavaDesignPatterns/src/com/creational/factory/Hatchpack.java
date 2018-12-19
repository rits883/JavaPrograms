/**
 * 
 */
package com.creational.factory;

/**
 * @author REETESH KUMAR CHOUBEY
 *19-Dec-2018
 * com.creational.factory
 */
public class Hatchpack implements Car {

	/* (non-Javadoc)
	 * @see com.creational.factory.Car#carSpecification()
	 */
	@Override
	public void carSpecification() {
		System.out.println("A hatchback is a car type with a rear door that opens upwards."
				+ " They typically feature a four-door configuration, excluding the rear door"); 
		
	}

}
