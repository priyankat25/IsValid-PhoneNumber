package com.kodnest.ivpn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsValidPhoneNumber {
	public static void main(String[] args) {
		String s = "6234567895";
		boolean validPhoneNumber = isValidPhoneNumber(s);
		if(validPhoneNumber) {
			System.out.println("valid Number");			
		}
		else {
			System.out.println("Invalid number");
		}
	}

	public static boolean isValidPhoneNumber(String s) {
		
		Pattern p = Pattern.compile("^[6789][0-9]{9}$");
		Matcher m = p.matcher(s);
		if(m.find()) {
			if(s.length() == 10) {
				return true;
			}
		}
		return false;
	}
}