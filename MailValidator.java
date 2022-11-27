package com.user_registration;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MailValidator {
	
	@Parameters
	public static Collection<String> validMail() {
		return Arrays.asList(new String[] { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" });
	}
	
	UserValidator user;
	String mail;
	
	public MailValidator(String mail) {
		this.user = new UserValidator();
		this.mail = mail;
	}
	
	@Test
	public void givenDifferentMails_WhenTrue_ShouldReturnHappy() {
		String result = user.emailValidation(mail);
		assertEquals("happy", result);
	}
}
