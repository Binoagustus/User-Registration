package com.user_registration;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserValidation userObj = new UserValidation();
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
				userObj.emailValidation();
				break;

			case 4:
				userObj.phoneNumValidation();
				break;

			case 5:
				userObj.passValidation();
				break;

			case 6:
				System.out.println("Terminated");
				loop = false;
				break;
			}
		}
	}
}
