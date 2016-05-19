package com.ahmetsahinoglu;

import java.util.Arrays;
import java.util.Comparator;

public class Q1_WordSorting {
	
public static void main(String[] args) {
	String[] input = {"aaaasd","a","aab","aaaabcd","ef","cssssssd","fdz" ,"kf","zc","lklklklklklk","l"}; 
    
		Arrays.sort(input, new Comparator<String>() {
        public int compare(String str1, String str2) {
            if (findA(str1) == findA(str2)) {
                if (str1.length() == str2.length()) {
                	//sorting by 'a'
                	return findA(str2) - findA(str1);
                }
              //sorting by lenght
                return str2.length() - str1.length();
            }
            //sorting by 'a'
            return findA(str2) - findA(str1);
        }
        
        private int findA(String str) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                	count++;
                }
            }
            return count;
        }
    });
    System.out.println(Arrays.toString(input));

}
  
}
