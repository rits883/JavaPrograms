/**
 * 
 */
package com.creational.singleton;

/**
 * @author REETESH KUMAR CHOUBEY
 *18-Dec-2018
 * com.creational.singleton
 */
/**
 * Classic implementation  of Singleton
 * 
 * Step 1. Create private constructor
 * Step 2. Create private static variable of class
 * Step 3. Create getInstaceOf method return Class if object of class is null
 * ****For multi threading environment  ***
 * public static synchronized Car getInstanceOf()
 * */
public class Car {

	private static Car object;
	private Car() {
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car object created";
	}
	
	/*public static  Car getInstaceOf() {
		if(object==null) 
			 object = new Car();
		return object;
	}*/
	
	public static synchronized Car getInstancOf() {
		if(object==null) {
			object = new Car();
		}
		return object;
	}
}
