package com.java.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
 * Write a program that uses regular expressions to determine if a string is a valid username. 
 * For this challenge, let’s define a valid username as one where the username can contain the characters a-z, A-Z, 0-9, and $. 
 * The username must contain the first and last names in title case with no spaces. 
 * Title case is defined as the first character being capitalized and all others as lower, with non-numeric values. 
 * Names always contain more than one character. The first and last name must be split with a $.
 *  Optionally the username can include a number of up to 3 digits to handle cases where there may be multiple users with the same first and last name. 
 *  For example, Bob$Smith or Joe$Schmoe002.
 */

public class UserNameValidate {
	
	
	//private static Pattern pattern = Pattern.compile("^[a-z0-9_-]{6,14}$");
    
	private static Pattern pattern = Pattern.compile("^[A-Z][a-z]+\\$[A-Z][a-z]+(\\d{3})?");
	
    public static boolean validateUserName(String userName){
         
        Matcher mtch = pattern.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
     
    public static void main(String a[]){
        System.out.println("Is 'JaneAusten' a valid user name? "
                        +validateUserName("JaneAusten"));
        System.out.println("Is 'Joe$Schmoe002' a valid user name? "
                        +validateUserName("Joe$Schmoe002"));
       
    }

}
