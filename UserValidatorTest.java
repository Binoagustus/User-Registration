package com.user_registration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserValidatorTest {

	UserValidator user = new UserValidator();
	
	@Test
	public void givenFirstName_WhenTrue_ShouldReturnHappy() {
		String result = user.nameValidation("Bino");
		assertEquals("happy", result);
	}
	
	@Test
	public void givenFirstName_WhenFalse_ShouldReturnSad() {
		String result = user.nameValidation("bino");
		assertEquals("sad", result);
	}
	
	@Test
	public void givenLastName_WhenTrue_ShouldReturnHappy() {
		String result = user.nameValidation("Agus");
		assertEquals("happy", result);
	}
	
	@Test
	public void givenLastName_WhenFalse_ShouldReturnSad() {
		String result = user.nameValidation("ag");
		assertEquals("sad", result);
	}
	
	@Test
	public void givenMobileNum_WhenTrue_ShouldReturnHappy() {
		String result = user.phoneNumValidation("91 9087367872");
		assertEquals("happy", result);
	}
	
	@Test
	public void givenMobileNum_WhenFalse_ShouldReturnSad() {
		String result = user.phoneNumValidation("7010404489");
		assertEquals("sad", result);
	}
	
	@Test
	public void givenPassword_WhenTrue_ShouldReturnHappy() {
		String result = user.passValidation("Bino@1234");
		assertEquals("happy", result);
	}
	
	@Test
	public void givenPassword_WhenFalse_ShouldReturnSad() {
		String result = user.passValidation("Bino@12#34");
		assertEquals("sad", result);
	}
	
	@Test
	public void givenMail_WhenTrue_ShouldReturnHappy() {
		String result = user.emailValidation("bino.06@gmail.com");
		assertEquals("happy", result);
	}
	
	@Test
	public void givenMail_WhenFalse_ShouldReturnSad() {
		String result = user.emailValidation("abc@.gmail.com");
		assertEquals("sad", result);
	}
}
