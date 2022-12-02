package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class PasswordValidatorTest {
    /*
     * - Password Validator. 
     * - Write a function that takes a password as a string  and returns true if the password meets certain criteria.
     *  - The password needs to have more than 8 characters
     *  - At least 1 number
     */

    @Test
    public void firstTest(){
        //this
        PasswordValidator passwordValidator = new PasswordValidator();

        //when
        assertTrue(passwordValidator.passwordIsValid("Password1"));
    }

    @Test
    public void passwordLengthCheck() {
        //this
        PasswordValidator passwordValidator = new PasswordValidator();

        assertFalse(passwordValidator.passwordIsValid("Passwor"));
    }

    @Test 
    public void passwordLengthEqualsEight() {
        //this
        PasswordValidator passwordValidator = new PasswordValidator();

        assertFalse(passwordValidator.passwordIsValid("Password"));
    }

    @Test
    public void passwordContainsAtLeastOneNumber() {
        // this
        PasswordValidator passwordValidator = new PasswordValidator();

        assertTrue(passwordValidator.passwordIsValid("password1"));
    }


    @Test
    public void passwordContainsNoNumber() {
        // this
        PasswordValidator passwordValidator = new PasswordValidator();

        assertFalse(passwordValidator.passwordIsValid("passworda"));
    }


    @Test
    public void something(){
        //this
        PasswordValidator passwordValidator = new PasswordValidator();

        //when
        assertFalse(passwordValidator.passwordIsValid("Passworda"));
    }
}
