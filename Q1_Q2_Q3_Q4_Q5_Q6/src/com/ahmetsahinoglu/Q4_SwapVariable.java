package com.ahmetsahinoglu;

public class Q4_SwapVariable {

	public static void main(String[] args) {
		int a = 15;
		int b = 35;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("--------------");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a : " + a);
		System.out.println("b : " + b);

	/*	
		alternative way  binary swap

		int a = 15, b = 35;
 
		System.out.println("A=" + a);
		System.out.println("B=" + b);
		System.out.println("----------------");
		a = a ^ b;
		b = a ^ b; 
		a = a ^ b; 
			 
		System.out.println("After swapping:");
		System.out.println("A=" + a);
		System.out.println("B=" + b);
	*/
	}

	
}
