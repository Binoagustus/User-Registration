package com.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

	Scanner sc = new Scanner(System.in);

	public void checkFirstName() {
		System.out.println("Enter First Name");
		System.out.println("(First letter must be cap and min 3 letters)");
		String firstName = sc.next();
		this.nameValidation(firstName);
	}
	
	public void checkLastName() {
		System.out.println("\nEnter Last Name");
		System.out.println("(First letter must be cap and min 3 letters)");
		String lastName = sc.next();
		this.nameValidation(lastName);
	}

	public String nameValidation(String name) {
		String regex = "^[.A-Z]([a-z]+){2,}$"; // first letter cap and min 3 letters
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()) {
			return "happy";
		} else {
			return "sad";
		}
	}
	
	public String emailValidation(String email) {
		
		String mailRegex = "^[a-zA-Z0-9+_.-]+(@)[^.][0-9a-z]*([.])[a-z.]+$";
		Pattern pattern = Pattern.compile(mailRegex);
		Matcher mailMatch = pattern.matcher(email);
		if (mailMatch.matches()) {
			System.out.println("Email is valid");
			return "happy";
		} else {
			System.out.println("Email is invalid");
			return "sad";
		}
	}
	
	public String phoneNumValidation(String mobileNumber) {
		
		String phoneRegex = "^(91)\\s[6-9]{1}[0-9]{9}$";
		Pattern pattern = Pattern.compile(phoneRegex);
		Matcher phoneMatch = pattern.matcher(mobileNumber);
		if (phoneMatch.matches()) {
			return "happy";
		} else {
			return "sad";
		}
	}
	
	public String passValidation(String password) {
		
//		String passRegex = "^(?=.*[0-9])(?=.*[A-Z])([^@!~#$%&^*+,])([a-z]*).{8,}$";
		String passRegex = "(?=.*[A-Z])(?=.*[0-9])(?=[^@#^$&]*[@#^$&][^@#$^&]*$).{8,}";
		Pattern pattern  = Pattern.compile(passRegex);
		Matcher passMatch = pattern.matcher(password);
		if(passMatch.matches()) {
			return "happy";
		} else {
			return "sad";
		}
	}
}
