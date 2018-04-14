package com.java.hackerrank;

import java.util.Arrays;

public class CharFrequency {
	
	 static final int CHARS = 26;
     
	   
	    static void printCharAndFreq(String str)
	    {
	       
	        int n = str.length();	  
	        String lowerCaseStr = str.toLowerCase();
	        
	        char[] arr = lowerCaseStr.toCharArray();
	        Arrays.sort(arr);
	        int[] freq = new int[CHARS];
	       
	        for (int i = 0; i < n; i++)
	            freq[arr[i] - 'a']++;	 
	      
	        for (int i = 0; i < n; i++) {	          
	            if (freq[arr[i] - 'a'] != 0) {	               
	                System.out.print(arr[i]);
	                System.out.print(freq[arr[i] - 'a'] ); 	              
	                freq[arr[i] - 'a'] = 0;
	            }
	        }
	    }
	      
	    // Driver program to test above
	    public static void main(String args[])
	    {
	        String str = "geeksforgeeks";
	        printCharAndFreq(str);
	    }

}
