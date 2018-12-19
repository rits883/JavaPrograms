/**
 * 
 */
package com.creational.factory;

/**
 * @author REETESH KUMAR CHOUBEY
 *19-Dec-2018
 * com.creational.factory
 */
public class SUV  implements Car{

	/* (non-Javadoc)
	 * @see com.creational.factory.Car#carSpecification()
	 */
	@Override
	public void carSpecification() {
		System.out.println("Conventionally, a sports utility vehicle (SUV) "
				+ "is a big car built on a body-on-frame chassis, "
				+ "sports increased ground clearance and offers "
				+ "off-roading capabilities to a certain extent");
	}

}
