/**
 * 
 */
package com.creational.factory;

/**
 * @author REETESH KUMAR CHOUBEY
 *19-Dec-2018
 * com.creational.factory
 */
public class Sedan implements Car {

	/* (non-Javadoc)
	 * @see com.creational.factory.Car#carSpecification()
	 */
	@Override
	public void carSpecification() {
		System.out.println("Out of the different types of cars, a sedan (US) "
				+ "or a saloon (UK) is traditionally defined as a car with four"
				+ " doors and a typical boot/ trunk."
				+ " A slightly technical detail is that it usually features "
				+ "a 3-box configuration with each of the boxes categorically "
				+ "used for the engine, passenger, and cargo");
	}

}
