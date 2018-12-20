/**
 * 
 */
package com.creational.abstractFacoryt;

/**
 * @author REETESH KUMAR CHOUBEY
 *20-Dec-2018
 * com.creational.abstractFacoryt
 */
public class HatchPack implements Car {

	/* (non-Javadoc)
	 * @see com.creational.abstractFacoryt.Car#getCarSpecification()
	 */
	@Override
	public void getCarSpecification() {
		System.out.println("A hatchback is a car type with a rear door that opens upwards."
				+ " They typically feature a four-door configuration, excluding the rear door"); 
		
	}

}
