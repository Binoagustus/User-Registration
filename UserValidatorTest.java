package com.user_registration;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class UserValidatorTest {

	Scanner sc = new Scanner(System.in);
	UserValidator user = new UserValidator();

	@Test
	public void givenFirstName_WhenFalse() throws InvalidFirstNameException {
		System.out.println("Enter First Name");
		String firstName = sc.next();
		String result = user.nameValidation(firstName);
		if ("sad" == result) {
			try {
				throw new InvalidFirstNameException();
			} catch (InvalidFirstNameException e) {
				e.printStackTrace();
				e.printCause();
			}
		} else {
			assertEquals("happy", result);
		}
	}

	class InvalidFirstNameException extends Exception {
		public void printCause() {
			System.out.println("Invalid First Name Exception");
		}
	}

	@Test
	public void givenLastName_WhenFalse() throws InvalidLastNameException {
		System.out.println("Enter Last Name");
		String lastName = sc.next();
		String result = user.nameValidation(lastName);
		if ("sad" == result) {
			try {
				throw new InvalidLastNameException();
			} catch (InvalidLastNameException e) {
				e.printStackTrace();
				e.printCause();
			}
		} else {
			assertEquals("happy", result);
		}
	}

	class InvalidLastNameException extends Exception {
		public void printCause() {
			System.out.println("Invalid Last Name Exception");
		}
	}

	@Test
	public void givenMobileNum_WhenFalse() throws InvalidMobileNumberException {
		System.out.println("Enter Mobile number");
		String mobileNum = sc.nextLine();
		String result = user.phoneNumValidation(mobileNum);
		if ("sad" == result) {
			try {
				throw new InvalidMobileNumberException();
			} catch (InvalidMobileNumberException e) {
				e.printStackTrace();
				e.printCause();
			}
		} else {
			assertEquals("happy", result);
		}
	}

	class InvalidMobileNumberException extends Exception {
		public void printCause() {
			System.out.println("Invalid Mobile Number Exception");
		}
	}

	@Test
	public void givenMail_WhenFalse() throws InvalidMailException {
		System.out.println("Enter mail id");
		String mail = sc.nextLine();
		String result = user.emailValidation(mail);
		if ("sad" == result) {
			try {
				throw new InvalidMailException();
			} catch (InvalidMailException e) {
				e.printStackTrace();
				e.printCause();
			}
		} else {
			assertEquals("happy", result);
		}
	}

	class InvalidMailException extends Exception {
		public void printCause() {
			System.out.println("Invalid Mail-id Exception");
		}
	}

	@Test
	public void givenPassword_WhenFalse() throws InvalidPasswordException {
		System.out.println("Enter the password");
		String password = sc.nextLine();
		String result = user.passValidation(password);
		if ("sad" == result) {
			try {
				throw new InvalidPasswordException();
			} catch (InvalidPasswordException e) {
				e.printStackTrace();
				e.printCause();
			}
		} else {
			assertEquals("happy", result);
		}
	}

	class InvalidPasswordException extends Exception {
		public void printCause() {
			System.out.println("Invalid Password Exception");
		}
	}
}
