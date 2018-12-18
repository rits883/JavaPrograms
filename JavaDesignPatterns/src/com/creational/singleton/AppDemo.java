/**
 * 
 */
package com.creational.singleton;

/**
 * @author REETESH KUMAR CHOUBEY
 *18-Dec-2018
 * com.creational.singleton
 */
public class AppDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Car c1  = Car.getInstancOf();
		 System.out.println(c1);
		 Car c2 = Car.getInstancOf();
		 System.out.println(c2);

	}

}
