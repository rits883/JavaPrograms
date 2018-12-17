/**
 *
 *H
 *15-Dec-2018
 *StringSession1.java 
 */
package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author REETESH KUMAR CHOUBEY
 *15-Dec-2018
 * StringSession1.java
 */
public class StringSession1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
	  m11();
	}
	
	/**
	 * Q1. In how many ways you can create string objects in java
	 * */
	public static void m1() {
		String str1 = "Hello1";
		String str2  = new String("Hello2");
		
	}
	
	/**
	 * Q2. Java method ambiguous
	 * */

	public static void m2(String str) {
		System.out.println(str);
		
	}
	
	public static void m2(StringBuffer sb) {
		System.out.println(sb);
	}
	

/***
 * Q3.count the number of occurrences of each character in a string?
 * */
	
	public static void m3() {
		String  string = "JAVA J2EE JMS JSP JSF FOOD  GOOD GOD HOME";
		
		HashMap<Character,Integer>  countMap  = new HashMap<>();  
		for(char ch :string.toCharArray() ) {
			if(ch!=' ') {
			if(countMap.containsKey(ch)) {
				 Integer count = countMap.get(ch)+1;
				 countMap.put(ch, count);
			}
			else {
				countMap.put(ch,1);
			}
		}
		}
		System.out.println(countMap);
		
	}

	/***
	 * Q4. Remove all white spaces from a string in java?
	 * */
	
	public static void m4() {
		String str   = "JAVA HOME TEA COFFEE BOOK LOOK KEEP";
		System.out.println(str.replaceAll(" ",""));
		
	}
	
	/**
	 * Q5.  find duplicate characters in a string
	 * */
	
	public static void m5() {
		String str ="Home House Hope Books Boy Big Bang ";
		
		long count  =str.chars().filter(ch-> ch=='H').count();
		//System.out.println(count);
		
		long count1 = str.codePoints().filter(ch -> ch=='B').count();
		System.out.println(count1);
		
	}
	
	/**
	 * Q 6. java program to reverse a string
	 * **/
	public static void m6() {
		String str = "Hello Java ";
		
		/**String buffer */
		StringBuffer stb = new StringBuffer(str);
		//System.out.println(stb.reverse());
		
		/** Using iterator **/
		
		StringBuffer sb1 = new StringBuffer();
		for(int i=str.length()-1;i>=0;i--) {
			sb1.append(str.charAt(i));
		}
		
		System.out.println(sb1);
	}

	/***
	 * Q7. Java program to check whether two strings are anagram or not
	 * */
	public static void m7() {
		String input1 = "Dormitory";
		String input2 = "Dirty Room";
		
		String str1 =input1.replaceAll(" ", "");
		String str2 =input2.replaceAll(" ", "");;
		
		/**Check Lenght **/
		boolean anagram =true;
		if(str1.length()==str2.length()) {
			char [] chArray1 = str1.toLowerCase().toCharArray();
			char [] chArray2 = str2.toLowerCase().toCharArray();
			Arrays.sort(chArray1);
			Arrays.sort(chArray2);
			 anagram = Arrays.equals(chArray1, chArray2);
			
		}
		else {
			anagram =false;
		}
		 System.out.println(anagram);
		
	}

	
	/**
	 * Q8.  Write a java program to reverse each word of a given string?
	 * IN :- Java Concept Of The Day
	 * OUT :- avaJ tpecnoC fO ehT yaD;
	 * **/
	public static void m8() {
		String str  ="Java Concept Of The Day";
		
		String [] strArray  = str.split(" ");
		
		StringBuffer sb  = new StringBuffer();
		for(String strValue:strArray) {
			
			  for(int i=strValue.length()-1;i>=0;i--) {
				 sb.append(strValue.charAt(i)); 
			  }
			  sb.append(" ");
		}
		System.out.println(sb);
		
	}
	
	/***
	 * Q9. Write a code to check whether one string is a rotation of another?
	 * If “JavaJ2eeStrutsHibernate” 
	 * is a string then below are some rotated versions of this string.
     “StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava”, “HibernateJavaJ2eeStruts”.
	 * 
	 * */
	
	public static void m9() {
		String input1  = "Java J2ee Struts Hibernate";
		String input2 = "J2ee Stputs Hibernate Java";
		
		if(input1.length()==input2.length()) {
			String  [] strArray =input2.split(" ");
			
			List<String> inList = new ArrayList<>(Arrays.asList(input1.split(" ")));
			Boolean flag =true;
			for(String value:strArray) {
				if(!inList.contains(value)) {
					flag =false;
					break;
				}
			}
			if(flag==false) {
				System.out.println("String not equal");
			}
			else {
				System.out.println("String are equals");
			}
		}
		else{
			System.out.println("Input 1 and Input 2 are not equal in size roate not possible");
		}
		
	}

	/**
	 * Q.10 How To Convert String To Integer In Java?
	 * **/
	public static void m10() {
		 String strRollNumber = "10000";
		 System.out.println(Integer.parseInt(strRollNumber));
		 
	}

	/***
	 * Q.11 How to check is String in Palindrome
	 * */
	public static void m11() {
		String input = "mom";
		char [] inputArray = input.toCharArray();
		StringBuffer reverse = new StringBuffer() ;
		for(int i =inputArray.length-1;i>=0;i--) {
			reverse.append(inputArray[i]);
		}
		
		if(input.equals(reverse.toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}
	
}
