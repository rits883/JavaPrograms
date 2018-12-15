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
		m13();

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
	
	/**
	 * EEEEE
	 * DDDDD
	 * CCCCC
	 * BBBBB
	 * AAAAA
	 * **/
	public static void m3() {
		char ch ='E';
		for(int i =1 ;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				System.out.print(ch);
			}
			ch--;
			System.out.println();
		}
	} 
	
/**
 * EDCBA
 * EDCBA
 * EDCBA
 * EDCBA
 * EDCBA
 * */
	
	public static void m4() {
	
		for(int i=1;i<=5;i++) {
			char ch ='E';
			for(int j=5;j>=1;j--) {
				System.out.print(ch);
				ch--;
			}
			System.out.println();
		}
	}



/**
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 * **/

public static void m5() {
for(int i =1;i<=5;i++) {
	char ch ='A';
	for(int j =1;j<=i;j++) {
		System.out.print(ch);
		ch++;
	}
	System.out.println();
}	
}

/**
 *     A
 *    AB
 *   ABC
 *  ABCD  
 * ABCDE
 * **/

public static void m6() {
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=(5-i);j++) {
		System.out.print(" ");	
		}
		char ch ='A';
		for(int k =1;k<=i;k++) {
			System.out.print(ch);
			ch++;
		}
		System.out.println();
	}
}

/**
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 * */

public static void m7() {
	char ch ='A';
	for(int i=1;i<=5;i++) {
		for(int j =1;j<=i;j++)
		{
			System.out.print(ch);
		}
		ch++;
		System.out.println();
	}
}

/***
 * ABCDE
 * ABCE
 * ABC
 * AB
 * A
 * 
 * **/


public static void m8() {
	for(int i =1;i<=5;i++) {
		char ch ='A';
		for(int j=5;j>=i;j--) {
			System.out.print(ch);
			ch++;
		}
		System.out.println();
	}
}


/***
 * ABCDE
 *  ABCD
 *   ABC
 *    AB
 *     A
 * **/

public static void m9() {
	for(int i =1;i<=5;i++) {
		
	 for(int j =1;j<=i;j++) {
		 System.out.print(" ");
	 }
	 char ch ='A';
	 for(int k=0;k<=(5-i);k++) {
	 System.out.print(ch);
	 ch++;
	 }
	 System.out.println();
	}
}

/**
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 * ABCD
 * ABC
 * AB
 * A
 * **/

public static void m10() {
	int size =4;
	for(int i =size;i>=-size;i--) {
		char ch ='A';
		for(int j =size;j>=Math.abs(i);j-- ) {
			System.out.print(ch);
			ch++;
		}
		System.out.println();
	}
}


/**
 *     A
 *    AB
 *   ABC 
 *  ABCD
 * ABCDE
 *  ABCD
 *   ABC
 *    AB
 *     A
 * **/

public static void m11() {
	int size =4;
	for(int i=size;i>=-size;i--) {
		
		for(int j=1;j<=Math.abs(i);j++) {
			  System.out.print(" ");
		  }
		char ch = 'A';
		for(int k =size;k>=Math.abs(i) ;k--) {
			System.out.print(ch);
			ch++;
		}
		   System.out.println();
	}
}

/***
 *   A
 *  ABC
 * ABCDE
 *ABCDEFG 
 * */

public static void m12() {
	int m =1;
	for(int i =1;i<=4;i++) {
		for(int j =1;j<=(4-i);j++) {
			System.out.print(" ");
		}
		char ch ='A';
		for(int k =1;k<=m;k++) {
			System.out.print(ch);
			ch++;
		}
		m+=2;
		System.out.println();
	}
}

/**
 *      A
 *     A B
 *    A B C
 *   A B C D
 * **/

public  static void  m13() {
	for(int i=1;i<=4;i++) {
		for(int j =1;j<=(4-i);j++) {
			System.out.print(" ");
		}
		char ch ='A';
		for(int j=1;j<=i;j++) {
			System.out.print(ch+" ");
			ch++;
		}
		System.out.println();
	}
}
}

