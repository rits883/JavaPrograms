/**
 * 
 */
package com.starPattern;

/**
 *@author REETESH KUMAR CHOUBEY
 *08-Dec-2018
  JavaPatternPrograms
 */
public class StarPatterns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     m9();		
	}

	/*
	 *     ***** 
	 *     *****
	 *     *****
	 *     *****
	 *     *****
	 * 
	 * */
	public static void m1() {
		for(int i=1;i<=5;i++) {
		for(int j=1 ; j<=5;j++) {
			System.out.print("*");
		}
		System.out.println( );
		}	
	}
	
	/**
	 *    *
	 *    **
	 *    ***
	 *    ****
	 *    *****
	 * */
	public static void m2() {
		for(int i =1;i<=5;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
	
	
	
	/***
	 *   *****
	 *   ****
	 *   ***
	 *   **
	 *   *
	 * */
	
	
	public static void m3() {
	int k =0;
		for(int i =1 ;i<=5;i++) {
			for(int j=1;j<=(5-k);j++) {
				System.out.print("*");
			}
			k++;
			System.out.println("");
		}
	}
	
	/*      
	
	*
   **
  ***
 ****
*****

	 * */

	public static void m4() {
		int k =1;
		for(int i =1;i<=5;i++) {
			for(int j =1;j<=(5-i);j++) {
				System.out.print(" ");
			}
			for(int l=1;l<=k;l++) {
				System.out.print("*");
			}
			k++;
			System.out.println();
		}
		
	} 
	
	
	/*
	 * *****
	 *  ****
	 *   ***
	 *    **
	 *     *
	 * */
	public static void m5() {
		int k =0;
		for(int i =1 ;i<=10;i++) {
			
			for(int l =1;l<=k;l++ ) {
				System.out.print(" ");
			}
			for(int j =1;j<=(10-k);j++) {
				System.out.print("*");
			}
			
			k++;
			System.out.println();
		}
		
	}

	
	/*      *
	 *     ***
	 *    *****
	 *   *******
	 *  *********
	 * */
	
	public static void m6() {
		int k =1 ,l=0;
		for(int i =1;i<=5;i++) {
			for(int j =1;j<=(5-k);j++) {
				System.out.print(" ");
			}
			for(int m=1;m<=k;m++) {
				System.out.print("*");
			}
			
			for(int n=1;n<=l;n++ ) {
			System.out.print("*");	
			}
			k++;
			l++;
			System.out.println("");
		}
		
	}
	
/*
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
*/
	public  static void m7() {
		int k =0 ,m=1;
		for(int i=1;i<=5;i++ ) {
			for(int j=1;j<=k ;j++) {
				System.out.print(" ");
			}
			for(int l=1;l<=(5-k);l++) {
				System.out.print("*");
			}
			for(int n =1;n<=(5-m);n++) {
				System.out.print("*");
			}
			k++;
			m++;
			System.out.println();
		}
	}

	/*      *
	 *      **
	 *      ***
	 *      ****
	 *      ***
	 *      **
	 *      *
	 *    
	 * */
	public static void m8() {
		int size =3 ;
		 for(int i =size;i>=-size;i--) {
			 System.out.println(i);
		   for(int j = size;j>=Math.abs(i);j--) {
			   System.out.print("*");   
		   }
		   System.out.println();
		 }
	}

	/*        *
	 *       **
	 *      ***
	 *     ****
	 *      ***
	 *       **
	 *        * 
	 * 
	 * */
	
	public  static void m9() {
		
		int size =3;
		for(int i =size;i>=-size;i--) {
		    for(int j=1;j<=Math.abs(i);j++) {
		    	//System.out.println(j);
				System.out.print(" ");
			}
		    for(int k =size;k>=Math.abs(i);k--) {
		    	System.out.print("*");
		    }
		    System.out.println();
		}
		
	} 
	
}
