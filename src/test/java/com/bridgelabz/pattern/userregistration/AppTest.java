package com.bridgelabz.pattern.userregistration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;


public class AppTest 
{
    
    App userRegistrationObject;
    @Before
    public void initialize() {
        userRegistrationObject=new App();
    }
    
//MOOD TEST    
    @Test
    public void givenMoodWhenHappyReturnTrue()
    {
        assertEquals("HAPPY", userRegistrationObject.analyzeMood("I am Happy"));
    }
    
    @Test
    public void givenMoodWhenSadReturnTrue()
    {
        assertEquals("SAD", userRegistrationObject.analyzeMood("I am Sad"));
    }
    
//FIRST NAME TEST    
    @Test
    public void givenFirstNameWhenValidReturnTrue()
    {
        assertTrue(userRegistrationObject.validateFirstName("Aditya"));
        assertTrue(userRegistrationObject.validateFirstName("Joy"));
    }
    @Test
    public void givenFirstNameWhenInvalidReturnFalse()
    {
        assertFalse(userRegistrationObject.validateFirstName("aditya"));
        assertFalse(userRegistrationObject.validateFirstName("Jo"));
    }
    
//LAST NAME TEST    
    @Test
    public void givenLastNameWhenValidReturnTrue()
    {
        assertTrue(userRegistrationObject.validateLastName("Verma"));
        assertTrue(userRegistrationObject.validateLastName("Layman"));
    }
    @Test
    public void givenLastNameWhenInvalidReturnFalse()
    {
        assertFalse(userRegistrationObject.validateLastName("verma"));
        assertFalse(userRegistrationObject.validateLastName("Li"));
    }
    
//EMAIL TEST    
    @Test
    public void givenEmailWhenValidReturnTrue()
    {
        assertTrue(userRegistrationObject.validateEmail("abc@yahoo.com"));
        assertTrue(userRegistrationObject.validateEmail("abc-100@yahoo.com"));
        assertTrue(userRegistrationObject.validateEmail("abc.100@yahoo.com"));
        assertTrue(userRegistrationObject.validateEmail("abc111@abc.com"));
        assertTrue(userRegistrationObject.validateEmail("abc-100@abc.net"));
        assertTrue(userRegistrationObject.validateEmail("abc.100@abc.com.au"));
        assertTrue(userRegistrationObject.validateEmail("abc@1.com"));       
        assertTrue(userRegistrationObject.validateEmail("abc@gmail.com.com"));
        assertTrue(userRegistrationObject.validateEmail("abc+100@gmail.com"));    
    }
    @Test
    public void givenEmailWhenInvalidReturnFalse()
    {
        assertFalse(userRegistrationObject.validateEmail("abc"));
        assertFalse(userRegistrationObject.validateEmail("abc@.com.my"));
        assertFalse(userRegistrationObject.validateEmail("abc123@gmail.a"));
        assertFalse(userRegistrationObject.validateEmail("abc123@.com"));
        assertFalse(userRegistrationObject.validateEmail("abc123@.com.com"));
        assertFalse(userRegistrationObject.validateEmail(".abc@abc.com"));
        assertFalse(userRegistrationObject.validateEmail("abc()*@gmail.com"));
        assertFalse(userRegistrationObject.validateEmail("abc@%*.com"));
        assertFalse(userRegistrationObject.validateEmail("abc..2002@gmail.com"));
        assertFalse(userRegistrationObject.validateEmail("abc.@gmail.com"));
        assertFalse(userRegistrationObject.validateEmail("abc@abc@gmail.com"));
        assertFalse(userRegistrationObject.validateEmail("abc@gmail.com.1a"));
        assertFalse(userRegistrationObject.validateEmail("abc@gmail.com.aa.au"));
    }
    
//PHONE NUMBER TEST
    @Test
    public void givenPhoneNumberWhenValidReturnTrue()
    {
        assertTrue(userRegistrationObject.validatePhoneNumber("91 8989036140"));
        assertTrue(userRegistrationObject.validatePhoneNumber("40 1046793214"));
    }
    @Test
    public void givenPhoneNumberWhenInvalidReturnFalse()
    {
        assertFalse(userRegistrationObject.validatePhoneNumber("01 8978974656"));
        assertFalse(userRegistrationObject.validatePhoneNumber("11 789655213"));
        assertFalse(userRegistrationObject.validatePhoneNumber("99  4568795542"));
        assertFalse(userRegistrationObject.validatePhoneNumber("91 0946793214"));
    }
    
//PASSWORD TEST
    @Test
    public void givenPasswordWhenValidReturnTrue()
    {
        assertTrue(userRegistrationObject.validatePassword("ThisIsMy@1stPassword"));
        assertTrue(userRegistrationObject.validatePassword("Validpassword#test123"));
    }
    @Test
    public void givenPasswordWhenInvalidReturnFalse()
    {
        assertFalse(userRegistrationObject.validatePassword("Short1@"));
        assertFalse(userRegistrationObject.validatePassword("Sho1@@"));
        assertFalse(userRegistrationObject.validatePassword("onlylowercase123"));
        assertFalse(userRegistrationObject.validatePassword("ONLYUPPERCASE123"));
        assertFalse(userRegistrationObject.validatePassword("UPPERCASElowercase"));

    }
}
