/**
 * 
 */
package com.starPattern;

/**
 *@author REETESH KUMAR CHOUBEY
 *11-Dec-2018
  JavaPatternPrograms
 */
public class NumberPatterns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		m13();
	}

	/**
	 *  11111
	 *  22222
	 *  33333
	 *  44444
	 *  55555
	 * */
	public static void m1() {
		for(int i =1;i<=5;i++) {
			for(int j =1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	/*
	 * 12345
	 * 12345
	 * 12345
	 * 12345
	 * 12345
	 * */
	public static void m2() {
		for(int i =1;i<=5;i++) {
			for(int j =1;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	/**
	 * 55555
	 * 44444
	 * 33333
	 * 22222
	 * 11111
	 * */
	public static void m3() {
		
		for(int i =5;i>=1;i--) {
			for(int j =1;j<=5;j++) {
				System.out.print(i);
			}
		
			System.out.println();
		}
	}
	
	/**
	 * 54321
	 * 54321
	 * 54321
	 * 54321
	 * 54321
	 * */
	public static void m4() {
		for(int i =1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
			System.out.print(j);	
			}
			System.out.println();
		}
	}
	
	/*
	 * 1
	 * 22
	 * 333
	 * 4444
	 * 55555
	 * */
	public static void m5() {
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	/*
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * */
	public static void m6() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	/*
	 * 11111
	 * 2222
	 * 333
	 * 44
	 * 5
	 * */
	public static void m7() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
/**
 * 12345
 * 1234
 * 123
 * 12
 * 1
 * */
	
	public static void m8() {
		/*
		for(int i =1;i<=5;i++) {
			int k=1;
			for(int j=5;j>=i;j--) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}*/
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
			System.out.print(j);	
			}
			System.out.println();
		}
	}


/*   
 *     1
 *    22
 *   333
 *  4444
 * 55555
 * */

public static void m9() {
	for(int i =1;i<=5;i++) {
		for(int j=1;j<=(5-i);j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print(i);
		}
		System.out.println();
	}
	
}

/**
 *    1
 *   2 2
 *  3 3 3
 * 4 4 4 4
 *5 5 5 5 5
 * */
public static void m10() {
	for(int i =1;i<=5;i++) {
		for(int j =1;j<=(5-i);j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

/**     1
 *     222
 *    33333
 *   4444444
 *  555555555
 * */
public static void m11() {
	int l=1;
	for(int i =0;i<5;i++) {
		for(int j = 1;j<=(5-i);j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=l;k++) {
			System.out.print(l-i);
		}
		l+=2;
		System.out.println();
	}
	
}

/**
 *      1
 *     333
 *    55555
 *   7777777
 *  999999999    
 * **/
public static void m12() {
    int l=1;
	for(int i=0;i<5;i++) {
		for(int j =1;j<=(5-i);j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=l ;k++) {
			System.out.print(l);
		}
		l+=2;
		System.out.println();
	}
}

/**
 *    1
 *   123
 *  12345
 * 1234567  
 *123456789  
 * **/
public static void m13() {
	int l =1;
	for(int i =0;i<5;i++) {
		for(int j=1;j<(5-i);j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=l;k++ ) {
			System.out.print(k);
		}
		l+=2;
		System.out.println();
	}
}



}