/**
 * 
 */
package com.starPattern;

/**
 *@author REETESH KUMAR CHOUBEY
 *14-Dec-2018
  JavaPatternPrograms
 */
public class Alphabet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		m2();

	}
	
	/**
	 * AAAAA
	 * BBBBB
	 * CCCCC
	 * DDDDD
	 * EEEEE
	 * */
	public static void m1() {
	 char ch = 'A';
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}
	
	/**
	 * ABCDE
	 * ABCDE
	 * ABCDE
	 * ABCDE
	 * ABCDE
	 * */
	
	public static void m2() {
	for(int i =1;i<=5;i++) {
		char ch ='A';
		for(int j =1;j<=5;j++) {
			System.out.print(ch);
			ch++;
		}
		System.out.println();
	}
	}
	
	

}
