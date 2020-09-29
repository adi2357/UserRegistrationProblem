package com.bridgelabz.pattern.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.bridgelabz.pattern.userregistration.UserRegistrationException.UserRegistrationExceptionType;

public class App {

	public boolean isValidateFirstName(String firstName) throws UserRegistrationException {
		boolean isValidFirstName = isValid(firstName, UserRegexPatterns.FIRST_NAME_PATTERN);
		if (isValidFirstName) {
			return isValidFirstName;
		} else {
			throw new UserRegistrationException(UserRegistrationExceptionType.INVALID_FIRST_NAME,
					"Invalid First Name Entry");
		}
	}

	public boolean isValidateLastName(String lastName) throws UserRegistrationException {
		boolean isValidLastName = isValid(lastName, UserRegexPatterns.LAST_NAME_PATTERN);
		if (isValidLastName) {
			return isValidLastName;
		} else {
			throw new UserRegistrationException(UserRegistrationExceptionType.INVALID_LAST_NAME,
					"Invalid Last Name Entry");
		}
	}

	public boolean isValidateEmail(String email) throws UserRegistrationException {
		boolean isValidEmail = isValid(email, UserRegexPatterns.EMAIL_PATTERN);
		if (isValidEmail) {
			return isValidEmail;
		} else {
			throw new UserRegistrationException(UserRegistrationExceptionType.INVALID_EMAIL, "Invalid Email Entry");
		}
	}

	public boolean isValidatePhoneNumber(String phoneNumber) throws UserRegistrationException {
		boolean isValidPhoneNumber = isValid(phoneNumber, UserRegexPatterns.PHONE_NUMBER_PATTERN);
		if (isValidPhoneNumber) {
			return isValidPhoneNumber;
		} else {
			throw new UserRegistrationException(UserRegistrationExceptionType.INVALID_PHONE_NUMBER,
					"Invalid Phone Number Entry");
		}
	}

	public boolean isValidatePassword(String password) throws UserRegistrationException {
		boolean isvalidPassword = isValid(password, UserRegexPatterns.PASSWORD_PATTERN);
		if (isvalidPassword) {
			return isvalidPassword;
		} else {
			throw new UserRegistrationException(UserRegistrationExceptionType.INVALID_PASSWORD,
					"Invalid Password Entry");
		}
	}

	public boolean isValid(String input, String pattern) {
		boolean isValid = input.matches(pattern);
		return isValid;
	}
//	public String analyzeMood(String msg) {
//		if(msg.toLowerCase().contains("happy"))
//			return "HAPPY";
//		else if(msg.toLowerCase().contains("sad"))
//			return "SAD";
//		return null;		
//	}
}
