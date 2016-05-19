package com.ahmetsahinoglu;

public class Q3_ExplainForLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 2; i++) {
			System.out.println(i);
		}

		for (int i = 0; i <= 2; ++i) {
			System.out.println(i);
		}
	}

		/* In fact, there is no difference from the point of result and operation in both cases. 
			Because i++ and ++i do not work after control of (i<=2). 
			However this control can work after output was written . As a result i++ and ++i are same for this case.
		Actually it is running like that :

			for (int i = 0; i <= 2; ) {
	   			   System.out.println(i);
					i++
	   			    }

		*/


}
