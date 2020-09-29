package com.bridgelabz.pattern.userregistration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;


public class AppTest {
	
	private App userRegistrationObject;

	@Before
	public void initialize() {
		userRegistrationObject = new App();
	}
	
//FIRST NAME TEST    
	@Test
	public void givenFirstNameWhenValidReturnTrue()throws UserRegistrationException {
		try {
			assertTrue(userRegistrationObject.isValidateFirstName("Aditya"));
			assertTrue(userRegistrationObject.isValidateFirstName("Joy"));
			assertTrue(userRegistrationObject.isValidateFirstName("aditya"));
			assertTrue(userRegistrationObject.isValidateFirstName("Jo"));
		} catch (UserRegistrationException e) {
			System.out.println("Exception Type : "+e.type+" | Message : "+e.getMessage());
		}
	}

//LAST NAME TEST    
	@Test
	public void givenLastNameWhenValidReturnTrue()throws UserRegistrationException {
		try {
			assertTrue(userRegistrationObject.isValidateLastName("Verma"));
			assertTrue(userRegistrationObject.isValidateLastName("Layman"));
			assertTrue(userRegistrationObject.isValidateLastName("verma"));
			assertTrue(userRegistrationObject.isValidateLastName("Li"));
		} catch (UserRegistrationException e) {
			System.out.println("Exception Type : "+e.type+" | Message : "+e.getMessage());
		}
	}	

//EMAIL TEST    
	@Test
	public void givenEmailWhenValidReturnTrue()throws UserRegistrationException {
		try {
			assertTrue(userRegistrationObject.isValidateEmail("abc@yahoo.com"));
			assertTrue(userRegistrationObject.isValidateEmail("abc-100@yahoo.com"));
			assertTrue(userRegistrationObject.isValidateEmail("abc.100@yahoo.com"));
			assertTrue(userRegistrationObject.isValidateEmail("abc111@abc.com"));
			assertTrue(userRegistrationObject.isValidateEmail("abc-100@abc.net"));
			assertTrue(userRegistrationObject.isValidateEmail("abc.100@abc.com.au"));
			assertTrue(userRegistrationObject.isValidateEmail("abc@1.com"));
			assertTrue(userRegistrationObject.isValidateEmail("abc@gmail.com.com"));
			assertTrue(userRegistrationObject.isValidateEmail("abc+100@gmail.com"));
			assertTrue(userRegistrationObject.isValidateEmail("abc"));
			assertTrue(userRegistrationObject.isValidateEmail("abc@.com.my"));
			assertTrue(userRegistrationObject.isValidateEmail("abc123@gmail.a"));
			assertTrue(userRegistrationObject.isValidateEmail("abc123@.com"));
			assertTrue(userRegistrationObject.isValidateEmail("abc123@.com.com"));
			assertTrue(userRegistrationObject.isValidateEmail(".abc@abc.com"));
			assertTrue(userRegistrationObject.isValidateEmail("abc()*@gmail.com"));
			assertTrue(userRegistrationObject.isValidateEmail("abc@%*.com"));
			assertTrue(userRegistrationObject.isValidateEmail("abc..2002@gmail.com"));
			assertTrue(userRegistrationObject.isValidateEmail("abc.@gmail.com"));
			assertTrue(userRegistrationObject.isValidateEmail("abc@abc@gmail.com"));
			assertTrue(userRegistrationObject.isValidateEmail("abc@gmail.com.1a"));
			assertTrue(userRegistrationObject.isValidateEmail("abc@gmail.com.aa.au"));
		}
		catch (UserRegistrationException e) {
			System.out.println("Exception Type : "+e.type+" | Message : "+e.getMessage());
		}		
	}

//PHONE NUMBER TEST
	@Test
	public void givenPhoneNumberWhenValidReturnTrue()throws UserRegistrationException {
		try {
			assertTrue(userRegistrationObject.isValidatePhoneNumber("91 8989036140"));
			assertTrue(userRegistrationObject.isValidatePhoneNumber("40 1046793214"));
			assertTrue(userRegistrationObject.isValidatePhoneNumber("01 8978974656"));
			assertTrue(userRegistrationObject.isValidatePhoneNumber("11 789655213"));
			assertTrue(userRegistrationObject.isValidatePhoneNumber("99  4568795542"));
			assertTrue(userRegistrationObject.isValidatePhoneNumber("91 0946793214"));
		} catch (UserRegistrationException e) {
			System.out.println("Exception Type : "+e.type+" | Message : "+e.getMessage());
		}
	}

//PASSWORD TEST
	@Test
	public void givenPasswordWhenValidReturnTrue()throws UserRegistrationException {
		try {
			assertTrue(userRegistrationObject.isValidatePassword("ThisIsMy@1stPassword"));
			assertTrue(userRegistrationObject.isValidatePassword("Validpassword#test123"));
			assertTrue(userRegistrationObject.isValidatePassword("Short1@"));
			assertTrue(userRegistrationObject.isValidatePassword("Sho1@@"));
			assertTrue(userRegistrationObject.isValidatePassword("onlylowercase123"));
			assertTrue(userRegistrationObject.isValidatePassword("ONLYUPPERCASE123"));
			assertTrue(userRegistrationObject.isValidatePassword("UPPERCASElowercase"));
		} catch (UserRegistrationException e) {
			System.out.println("Exception Type : "+e.type+" | Message : "+e.getMessage());
		}
	}
}
