/**
 * 
 */
package com.creational.abstractFacoryt;

/**
 * @author REETESH KUMAR CHOUBEY
 *20-Dec-2018
 * com.creational.abstractFacoryt
 */
public class AppDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Car hatchPack = CarsFactory.getCar(new HatchpackAbstactFactory());
		 hatchPack.getCarSpecification();
	}

}
