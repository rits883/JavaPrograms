/**
 * 
 */
package com.creational.abstractFacoryt.session1;

/**
 * @author REETESH KUMAR CHOUBEY
 *20-Dec-2018
 * com.creational.abstractFacoryt.session1
 */
public class MobilesFactory {

	public static Mobile getMobile(MobileAbstractFactory mab) {
		return mab.createMobile();
	}
}
