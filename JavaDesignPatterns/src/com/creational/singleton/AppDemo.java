/**
 * 
 */
package com.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author REETESH KUMAR CHOUBEY
 *18-Dec-2018
 * com.creational.singleton
 */
public class AppDemo {

	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
		/*Car c1  = Car.getInstancOf();
		 System.out.println(c1.hashCode());
		 Car c2 = Car.getInstancOf();
		 System.out.println(c2.hashCode());*/
		
		Car c1  = Car.getInstancOf();
		Car c2  = null ;
				
		/**Break Singleton using Reflection*/
		
		/*Constructor [] constructors = Car.class.getDeclaredConstructors();
		
		for(Constructor cs :constructors) {
			cs.setAccessible(true);
			c2 = (Car) cs.newInstance();
			break;
		}
 */
		
		/**Break Singleton using**/
		try {
		ObjectOutput out =  new ObjectOutputStream(new FileOutputStream("file.text"));
		out.writeObject(c1);
		out.close();
		
		ObjectInput input = new ObjectInputStream(new FileInputStream("file.text"));
		
		c2 = (Car) input.readObject();
		input.close();
		
		 System.out.println(c1.hashCode());
		 System.out.println(c2.hashCode());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
