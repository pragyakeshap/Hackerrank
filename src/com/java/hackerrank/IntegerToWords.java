package com.java.hackerrank;

import java.util.HashMap;

public class IntegerToWords {
	
	HashMap<Integer, String> wordMap = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		int num = 5345;
		IntegerToWords itw = new IntegerToWords();
		System.out.println(itw.numberToWords(num));
	}
	 
    public String numberToWords(int num) {
        initWordMap();
        StringBuilder sb = new StringBuilder();
 
        if(num==0){
            return wordMap.get(0);
        }
 
        if(num >= 1000000000){
            int carry = num/1000000000;
            sb.append(convertNumToWords(carry) + " Billion");
            num = num%1000000000;
        }
 
        if(num >= 1000000){
            int carry = num/1000000;
            sb.append(convertNumToWords(carry) + " Million");
            num = num%1000000;
        } 
 
        if(num >= 1000){
            int carry = num/1000;
            sb.append(convertNumToWords(carry) + " Thousand");
            num = num%1000;
        } 
 
        if(num > 0){
            sb.append(convertNumToWords(num));
        }
 
        return sb.toString().trim();
    }
 
    public String convertNumToWords(int num){
 
        StringBuilder sb = new StringBuilder();
 
        if(num>=100){
            int numHundred = num/100;
            sb.append(" " +wordMap.get(numHundred)+ " Hundred");
            num=num%100;
        }
 
        if(num > 0){
            if(num>0 && num<=20){
                sb.append(" "+wordMap.get(num));
            }else{
                int numTens = num/10;
                sb.append(" "+wordMap.get(numTens*10));
 
                int numOnes=num%10;
                if(numOnes>0){
                    sb.append(" " + wordMap.get(numOnes));
                }
            }
        }
 
        return sb.toString();
    }
 
    public void initWordMap(){
        wordMap.put(0, "Zero");
        wordMap.put(1, "One");
        wordMap.put(2, "Two");
        wordMap.put(3, "Three");
        wordMap.put(4, "Four");
        wordMap.put(5, "Five");
        wordMap.put(6, "Six");
        wordMap.put(7, "Seven");
        wordMap.put(8, "Eight");
        wordMap.put(9, "Nine");
        wordMap.put(10, "Ten");
        wordMap.put(11, "Eleven");
        wordMap.put(12, "Twelve");
        wordMap.put(13, "Thirteen");
        wordMap.put(14, "Fourteen");
        wordMap.put(15, "Fifteen");
        wordMap.put(16, "Sixteen");
        wordMap.put(17, "Seventeen");
        wordMap.put(18, "Eighteen");
        wordMap.put(19, "Nineteen");
        wordMap.put(20, "Twenty");
        wordMap.put(30, "Thirty");
        wordMap.put(40, "Forty");
        wordMap.put(50, "Fifty");
        wordMap.put(60, "Sixty");
        wordMap.put(70, "Seventy");
        wordMap.put(80, "Eighty");
        wordMap.put(90, "Ninety");
    }

}
