package com.bridgelabz.pattern.userregistration;

public class UserRegexPatterns {
	
	public static final String FIRST_NAME_PATTERN="^[A-Z]{1}[a-zA-Z]{2,}";
	public static final String LAST_NAME_PATTERN="^[A-Z]{1}[a-zA-Z]{2,}";
	public static final String EMAIL_PATTERN="^[a-z0-9]+(([\\._+-][a-z0-9]+)?)\\@[a-z0-9]+\\.(([a-z]{2,4})(\\.[a-z]{2,4})?)$";
	public static final String PHONE_NUMBER_PATTERN="^([1-9]{1}\\d{1})\\s{1}([1-9]{1}\\d{9})$";
	public static final String PASSWORD_PATTERN="((?=.*[A-Z])(?=.*\\d)(?=.*[a-z])([a-zA-Z0-9]*[!@#$%^&*|'<>.-^*()%+]{1}[a-zA-Z0-9]*).{8,})";
	
}
