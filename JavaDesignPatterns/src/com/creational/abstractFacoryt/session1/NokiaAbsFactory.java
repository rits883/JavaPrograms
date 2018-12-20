/**
 * 
 */
package com.creational.abstractFacoryt.session1;

/**
 * @author REETESH KUMAR CHOUBEY
 *20-Dec-2018
 * com.creational.abstractFacoryt.session1
 */
public class NokiaAbsFactory implements MobileAbstractFactory {

	/* (non-Javadoc)
	 * @see com.creational.abstractFacoryt.session1.MobileAbstractFactory#createMobile()
	 */
	@Override
	public Mobile createMobile() {
		// TODO Auto-generated method stub
		return new Nokia();
	}

}
