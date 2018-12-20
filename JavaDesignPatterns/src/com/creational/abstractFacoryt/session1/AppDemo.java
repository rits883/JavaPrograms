/**
 * 
 */
package com.creational.abstractFacoryt.session1;

/**
 * @author REETESH KUMAR CHOUBEY
 *20-Dec-2018
 * com.creational.abstractFacoryt.session1
 */
public class AppDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mobile nokia  = MobilesFactory.getMobile(new NokiaAbsFactory());
		nokia.getSpecification();
	}

}
