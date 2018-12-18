/**
 * 
 */
package com.creational.bulder;

/**
 * @author REETESH KUMAR CHOUBEY
 *18-Dec-2018
 * com.creational.bulder
 */
public class PhoneApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Phone phone  = new PhoneBuilder().setOs("Android").getPhone();
		System.out.println(phone);

	}

}
