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
    public static void main( String[] args )
    {
    	App userObject=new App();
    	Scanner sc=new Scanner(System.in);
    	    	
//    	System.out.println("Enter First Name : ");
//    	String firstName=sc.next();
//    	boolean satisfiesFirstName=userObject.validateFirstName(firstName);
//    	System.out.println("Satisfies First Name : "+satisfiesFirstName);
    	
    	System.out.println("Enter Last Name : ");
    	String lastName=sc.next();
    	boolean satisfiesLastName=userObject.validateLastName(lastName);
    	System.out.println("Satisfies Last Name : "+satisfiesLastName);
    }
}
