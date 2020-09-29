package com.bridgelabz.pattern.userregistration;

public class UserRegistrationException extends Exception {

	public enum UserRegistrationExceptionType{
		INVALID_FIRST_NAME,
		INVALID_LAST_NAME,
		INVALID_EMAIL,
		INVALID_PHONE_NUMBER,
		INVALID_PASSWORD;		
	}
	UserRegistrationExceptionType type;
	public UserRegistrationException(UserRegistrationExceptionType type, String message) {
		super(message);
		this.type=type;
	}

}
