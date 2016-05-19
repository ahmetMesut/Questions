package com.ahmetsahinoglu;

import java.util.ArrayList;
import java.util.List;

public class Q6_FindMostRepeated {
	

	public static void findMostRepeated(List<String> list) {
		
		List<String> table = new ArrayList<String>();
		
		for (String scanner : list) {
			if(!table.contains(scanner)){
				table.add(scanner);
	        }
		}
		String mostRepeat = null;
		int count=0;
		int repeat = 0;
		 for(int i=0;i<table.size();i++){
		        for(int j=0;j<list.size();j++){
		            if(table.get(i).equals(list.get(j))){
		                count++;
		            }
		        }
		       
		       
		        if (repeat < count) {
		        	repeat = count;
		        	mostRepeat = table.get(i);
				}
		    
		      
		        count=0;
		        
		    }
		  System.out.println("Most repeated value : " + mostRepeat);
		
		
	}

	public static void main(String[] args) {
		
		List<String> brands = new ArrayList<String>();
		
		brands.add("apple");
		brands.add("pie");
		brands.add("apple");
		brands.add("red");
		brands.add("pie");
		brands.add("pie");
		

		findMostRepeated(brands);
	}
}
