package com.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

	public void userValidation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		System.out.println("(First letter must be cap and min 3 letters)");
		String firstName = sc.next();
		this.nameValidation(firstName);

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
}
