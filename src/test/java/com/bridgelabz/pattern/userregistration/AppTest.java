package com.bridgelabz.pattern.userregistration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import junit.framework.Assert;

@RunWith(Parameterized.class)
public class AppTest {
	private String email;
	private boolean isEmailValid;
	private App userRegistrationObject;

	@Before
	public void initialize() {
		userRegistrationObject = new App();
	}

	public AppTest(String email, boolean isEmailValid) {
		this.email = email;
		this.isEmailValid = isEmailValid;
	}
	
	@Parameterized.Parameters
	public static Collection emailTestList() {
		 return Arrays.asList(new Object[][]{
			   {"abc@yahoo.com",true},
			   {"abc@.com",false},
			   {"abc.100@yahoo.com",true},
			   {"ab+100@yahoo.com",true},
			   {"abc@.com",false},
			   {"abc..2002@gmail.com",false},
			   {".abc123@abc.com",false},
			   {"ab+100@yahoo.com",true},
			   {"abc+100@gmail.com",true},
			   {"abc-100@abc.net",true},
			   {"abc@gmail.com.com",true},
			   {"abc@gmail.a",false},
			   {"abc()*@gmail.com",false},
			   {"abc@1.com",true},
			   {"abc.100@abc.com.au", true},
			   {"abc..2002@gmail.com",false},
			   {"abc.@gmail.com",false},
			   {"abc@gmail.com.1a",false},
			   {"abc@%*.com",false},
			   {"abc()*@gmail.com",false},
			   {"abcd..2002@gmail.com",false}			   
			   });	
	}

//MOOD TEST    
//	@Test
//	public void givenMoodWhenHappyReturnTrue() {
//		assertEquals("HAPPY", userRegistrationObject.analyzeMood("I am Happy"));
//	}
//
//	@Test
//	public void givenMoodWhenSadReturnTrue() {
//		assertEquals("SAD", userRegistrationObject.analyzeMood("I am Sad"));
//	}

//FIRST NAME TEST    
//	@Test
//	public void givenFirstNameWhenValidReturnTrue() {
//		assertTrue(userRegistrationObject.validateFirstName("Aditya"));
//		assertTrue(userRegistrationObject.validateFirstName("Joy"));
//	}
//
//	@Test
//	public void givenFirstNameWhenInvalidReturnFalse() {
//		assertFalse(userRegistrationObject.validateFirstName("aditya"));
//		assertFalse(userRegistrationObject.validateFirstName("Jo"));
//	}

//LAST NAME TEST    
//	@Test
//	public void givenLastNameWhenValidReturnTrue() {
//		assertTrue(userRegistrationObject.validateLastName("Verma"));
//		assertTrue(userRegistrationObject.validateLastName("Layman"));
//	}
//
//	@Test
//	public void givenLastNameWhenInvalidReturnFalse() {
//		assertFalse(userRegistrationObject.validateLastName("verma"));
//		assertFalse(userRegistrationObject.validateLastName("Li"));
//	}

//EMAIL TEST    
	@Test
	public void givenEmailListReturnResult() {
		System.out.println(email+" is Valid : "+isEmailValid);
		assertEquals(isEmailValid, userRegistrationObject.validateEmail(email));
	}

//PHONE NUMBER TEST
//	@Test
//	public void givenPhoneNumberWhenValidReturnTrue() {
//		assertTrue(userRegistrationObject.validatePhoneNumber("91 8989036140"));
//		assertTrue(userRegistrationObject.validatePhoneNumber("40 1046793214"));
//	}
//
//	@Test
//	public void givenPhoneNumberWhenInvalidReturnFalse() {
//		assertFalse(userRegistrationObject.validatePhoneNumber("01 8978974656"));
//		assertFalse(userRegistrationObject.validatePhoneNumber("11 789655213"));
//		assertFalse(userRegistrationObject.validatePhoneNumber("99  4568795542"));
//		assertFalse(userRegistrationObject.validatePhoneNumber("91 0946793214"));
//	}

//PASSWORD TEST
//	@Test
//	public void givenPasswordWhenValidReturnTrue() {
//		assertTrue(userRegistrationObject.validatePassword("ThisIsMy@1stPassword"));
//		assertTrue(userRegistrationObject.validatePassword("Validpassword#test123"));
//	}
//
//	@Test
//	public void givenPasswordWhenInvalidReturnFalse() {
//		assertFalse(userRegistrationObject.validatePassword("Short1@"));
//		assertFalse(userRegistrationObject.validatePassword("Sho1@@"));
//		assertFalse(userRegistrationObject.validatePassword("onlylowercase123"));
//		assertFalse(userRegistrationObject.validatePassword("ONLYUPPERCASE123"));
//		assertFalse(userRegistrationObject.validatePassword("UPPERCASElowercase"));
//
//	}
}
