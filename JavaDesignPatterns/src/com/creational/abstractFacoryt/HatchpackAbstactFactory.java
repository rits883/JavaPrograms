/**
 * 
 */
package com.creational.abstractFacoryt;

/**
 * @author REETESH KUMAR CHOUBEY
 *20-Dec-2018
 * com.creational.abstractFacoryt
 */
public class HatchpackAbstactFactory implements CarsAbstractFactory {

	/* (non-Javadoc)
	 * @see com.creational.abstractFacoryt.CarsAbstractFactory#createCar()
	 */
	@Override
	public Car createCar() {
		return new HatchPack();
	}

}
