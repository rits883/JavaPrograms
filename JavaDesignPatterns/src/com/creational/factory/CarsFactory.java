/**
 * 
 */
package com.creational.factory;

import javax.sound.midi.Soundbank;

/**
 * @author REETESH KUMAR CHOUBEY
 *19-Dec-2018
 * com.creational.factory
 * Factory class for cars 
 */
public class CarsFactory {

	public  static Car getCar(String type) {
		
		try {
		if(type.equalsIgnoreCase("HATCHPACK")) {
			return new Hatchpack();
		}
		if(type.equalsIgnoreCase("MPV")) {
			return new MPV();
		}
		if(type.equalsIgnoreCase("SEDAN")) {
			return new Sedan();
		}
		if(type.equalsIgnoreCase("SUV")) {
			return new SUV();
		}
		else {
			throw new CarNotFoundException();
		}
		}
		catch (CarNotFoundException e) {
			 System.out.println(e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
