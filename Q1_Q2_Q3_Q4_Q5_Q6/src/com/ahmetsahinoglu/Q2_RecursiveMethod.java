package com.ahmetsahinoglu;

public class Q2_RecursiveMethod{
	
	
	static int stack[] = new int[3]; 
	static int count = 0;
	static int enterValue = 9;
	
	 public static void division(int x){
		 int d = x/2;
		 count++;
		 if(d != 1){
		 stack[count] = d;
		 division(d);
		 }
	 }
	public static void main(String[] args) {
		stack[0] = enterValue;
		division(enterValue);
		
		for(int i = stack.length -1; i >= 0; i --)
			System.out.println(stack[i]);
	}

	 
 }

