package com.lti.array;

public class DemoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arrayOfInt[] = new int[]{2,3,5};
		for(int i=0; i<arrayOfInt.length; i++){
			System.out.println("The element at index "+i+" is "+arrayOfInt[i]);
		}
		
		String arrayOfString[] = new String[]{"Ruchi","Rohit","Roman"};
		for(int i=0; i<arrayOfString.length; i++){
			System.out.println("The string at index "+i+" is "+arrayOfString[i]);
		}

	}

}
