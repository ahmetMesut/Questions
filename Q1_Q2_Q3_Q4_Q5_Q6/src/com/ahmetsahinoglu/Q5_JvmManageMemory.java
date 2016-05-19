package com.ahmetsahinoglu;

public class Q5_JvmManageMemory {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	String str1 = "abc";
	String str2 = new String("abc");
	String str3 = "abc";

   
	/*

	Java does not recognise a new memory to same values. 
	For instance; in fact str1 and str3 are same. 
	So they indicates the same location on memory. 
	Java should recognise a new memory on str2, then we are putting a new reference there.
	*/
	}
}