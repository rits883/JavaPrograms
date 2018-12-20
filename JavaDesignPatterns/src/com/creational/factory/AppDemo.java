/**
 * 
 */
package com.creational.factory;

/**
 * @author REETESH KUMAR CHOUBEY
 *19-Dec-2018
 * com.creational.factory
 */
public class AppDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SUV suv = (SUV) CarsFactory.getCar("SUV");
		suv.carSpecification();
		

	}

}
