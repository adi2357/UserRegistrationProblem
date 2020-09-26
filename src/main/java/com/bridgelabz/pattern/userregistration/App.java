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
    public static void main( String[] args )
    {
    	App userObject=new App();
    	Scanner sc=new Scanner(System.in);
    	    	
    	System.out.println("Enter First Name : ");
    	String firstName=sc.next();
    	boolean satisfiesFirstName=userObject.validateFirstName(firstName);
    	System.out.println("Satisfies First Name : "+satisfiesFirstName);
    }
}
