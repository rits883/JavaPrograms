/**
 * 
 */
package com.creational.abstractFacoryt;

/**
 * @author REETESH KUMAR CHOUBEY
 *20-Dec-2018
 * com.creational.abstractFacoryt
 */
public class SUV implements Car {

	/* (non-Javadoc)
	 * @see com.creational.abstractFacoryt.Car#getCarSpecification()
	 */
	@Override
	public void getCarSpecification() {
		System.out.println("Conventionally, a sports utility vehicle (SUV) "
				+ "is a big car built on a body-on-frame chassis, "
				+ "sports increased ground clearance and offers "
				+ "off-roading capabilities to a certain extent");
	}

}
