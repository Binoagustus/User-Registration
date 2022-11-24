package com.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

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

	public void nameValidation(String name) {
		String regex = "^[.A-Z]([a-z]+){2,}$"; // first letter cap and min 3 letters
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()) {
			System.out.println("Name is valid");

		} else {
			System.out.println("Name is invalid");

		}
	}
	
	public void emailValidation() {

		System.out.println(" Enter e-mail");
		String email = sc.next();
		String mailRegex = "^[a-zA-Z0-9_.-]+(@)[a-z]+([.])[a-z.]+$";
		Pattern pattern = Pattern.compile(mailRegex);
		Matcher mailMatch = pattern.matcher(email);
		if (mailMatch.matches()) {
			System.out.println("Email is valid");

		} else {
			System.out.println("Email is invalid");

		}
	}
	
	public void phoneNumValidation() {
		
		System.out.println(" Enter a mobile number ");
		System.out.println("Format : (91_10digit mobile number)");
		String mobileNumber = sc.nextLine();
		String phoneRegex = "^(91)\\s[6-9]{1}[0-9]{9}$";
		Pattern pattern = Pattern.compile(phoneRegex);
		Matcher phoneMatch = pattern.matcher(mobileNumber);
		if (phoneMatch.matches()) {
			System.out.println("Phone Number is valid");

		} else {
			System.out.println("Phone Number is invalid");

		}
	}
	
	public void passValidation() {
		
		System.out.println(" Enter the password ");
		String password = sc.next();
		String passRegex = "^(?=.*[A-Z])([a-z]*).{8,}$";
		Pattern pattern  = Pattern.compile(passRegex);
		Matcher passMatch = pattern.matcher(password);
		if(passMatch.matches()) {
			System.out.println("Password is valid");
		} else {
			System.out.println("Password is invalid");
		}
		
	}
}
