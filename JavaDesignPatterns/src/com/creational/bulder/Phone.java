/**
 * 
 */
package com.creational.bulder;

/**
 * @author REETESH KUMAR CHOUBEY
 *17-Dec-2018
 * com.creational.bulder
 */
public class Phone {
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
	
	/**
	 * @param os2
	 * @param ram2
	 * @param processor2
	 * @param screenSize2
	 * @param battery2
	 */
	public Phone(String os, int ram, String processor, double screenSize, int battery) {
		this.os =os;
		this.ram =ram;
		this.processor =processor;
		this.screenSize = screenSize;
		this.battery =battery;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "OS "+os +" Ram "+ram+" Processor "+processor+" Screen Size "+screenSize
				+" Battery "+battery;
	}
	
	/**
	 * @return the os
	 */
	public String getOs() {
		return os;
	}
	
	/**
	 * @param os the os to set
	 */
	public void setOs(String os) {
		this.os = os;
	}
	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}
	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}
	/**
	 * @return the processor
	 */
	public String getProcessor() {
		return processor;
	}
	/**
	 * @param processor the processor to set
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	/**
	 * @return the screenSize
	 */
	public double getScreenSize() {
		return screenSize;
	}
	/**
	 * @param screenSize the screenSize to set
	 */
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	/**
	 * @return the battery
	 */
	public int getBattery() {
		return battery;
	}
	/**
	 * @param battery the battery to set
	 */
	public void setBattery(int battery) {
		this.battery = battery;
	}

}
