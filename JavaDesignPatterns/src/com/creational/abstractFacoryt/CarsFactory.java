/**
 * 
 */
package com.creational.abstractFacoryt;

/**
 * @author REETESH KUMAR CHOUBEY
 *20-Dec-2018
 * com.creational.abstractFacoryt
 */
public class CarsFactory {

	public static Car getCar(CarsAbstractFactory caf) {
		return caf.createCar();
	}
}
