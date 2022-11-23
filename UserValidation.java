package com.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

	public void userValidation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First");
		System.out.println("(First letter must be cap and min 3 letters)");
		String firstName = sc.next();

		String regexFirstName = "^[.A-Z]([a-z]+){2,}$"; // first letter cap and min 3 letters
		Pattern pattern = Pattern.compile(regexFirstName);
		Matcher matcher = pattern.matcher(firstName);
		if (matcher.matches()) {
			System.out.println("FisrtName is valid");

		} else {
			System.out.println("Firstname is invalid");

		}
	}
}
