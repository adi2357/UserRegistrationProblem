package com.bridgelabz.pattern.userregistration;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App 
{
	
	public boolean validateFirstName(String firstName) {
		String firstNamePattern ="^[A-Z]{1}[a-zA-Z]{2,}";
		boolean isValidFirstName=firstName.matches(firstNamePattern);
		return isValidFirstName;
	}
	
	public boolean validateLastName(String lastName) {
		String lastNamePattern ="^[A-Z]{1}[a-zA-Z]{2,}";
		boolean isValidLastName=lastName.matches(lastNamePattern);
		return isValidLastName;
	}
	
	public boolean validateEmail(String email) {
		String emailPattern ="^[a-z0-9]+(([\\._+-][a-z0-9]+)?)\\@[a-z0-9]+\\.(([a-z]{2,4})(\\.[a-z]{2,4})?)$";
		boolean isValidEmail=email.matches(emailPattern);
		return isValidEmail;
	}
	
	public boolean validatePhoneNumber(String phoneNumber) {
		String phoneNumberPattern ="^([1-9]{1}\\d{1})\\s{1}([1-9]{1}\\d{9})$";
		boolean isValidPhoneNumber=phoneNumber.matches(phoneNumberPattern);
		return isValidPhoneNumber;
	}
	
    public static void main( String[] args )
    {
    	App userObject=new App();
    	Scanner sc=new Scanner(System.in);
    	    	
//    	System.out.println("Enter First Name : ");
//    	String firstName=sc.next();
//    	boolean satisfiesFirstName=userObject.validateFirstName(firstName);
//    	System.out.println("Satisfies First Name : "+satisfiesFirstName);
    	
//    	System.out.println("Enter Last Name : ");
//    	String lastName=sc.next();
//    	boolean satisfiesLastName=userObject.validateLastName(lastName);
//    	System.out.println("Satisfies Last Name : "+satisfiesLastName);
    	
//    	 System.out.println("Enter the Email : ");
//         String email=sc.next();
//         boolean satisfiesEmail=userObject.validateEmail(email);
//         System.out.println("Satisfies Email : "+satisfiesEmail);
         
         System.out.println("Enter the Phone Number : ");
         String phoneNumber=sc.nextLine();
         boolean satisfiesPhoneNumber=userObject.validatePhoneNumber(phoneNumber);
         System.out.println("Satisfies Phone Number : "+satisfiesPhoneNumber);
         
    }
}
