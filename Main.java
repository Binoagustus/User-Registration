package com.user_registration;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserValidator userObj = new UserValidator();
		boolean loop = true;

		while (loop) {
			System.out.println("\n1.First Name \n2.LastName \n3.Email \n4.Phone Number "
					+ "\n5.Password Validation \n6.Exit");
			System.out.println("Enter an option");
			byte input = sc.nextByte();

			switch (input) {
			case 1:
				userObj.checkFirstName();
				break;

			case 2:
				userObj.checkLastName();
				break;

			case 3:
				System.out.println(" Enter e-mail");
				String email = sc.next();
				userObj.emailValidation(email);
				break;

			case 4:
				System.out.println(" Enter a mobile number ");
				System.out.println("Format : (91_10digit mobile number)");
				String mobileNumber = sc.nextLine();
				userObj.phoneNumValidation(mobileNumber);
				break;

			case 5:
				System.out.println(" Enter the password ");
				String password = sc.nextLine();
				userObj.passValidation(password);
				break;

			case 6:
				System.out.println("Terminated");
				loop = false;
				break;
			}
		}
	}
}
