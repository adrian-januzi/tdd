package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class PasswordValidatorTest {
    /*
     * Password Validator.
     * The password needs to have more than 8 characters
     * At least 1 number
     * At least 1 uppercase letter
     * at least 1 lowercase letter
     * at least 1 of the following special characters: _$@#+-
     */

    @Test
    public void firstTest() {
        //this
        PasswordValidator passwordValidator = new PasswordValidator();

        //when
        assertTrue(passwordValidator.passwordIsValid("Password1_"));
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

        assertTrue(passwordValidator.passwordIsValid("Password1@"));
    }


    @Test
    public void passwordContainsNoNumber() {
        // this
        PasswordValidator passwordValidator = new PasswordValidator();

        assertFalse(passwordValidator.passwordIsValid("passworda"));
    }


    @Test
    public void passwordContainsAtLeastOneLowerCaseLetter() {
        PasswordValidator passwordValidator = new PasswordValidator();

        assertTrue(passwordValidator.passwordIsValid("Password1@"));
    }


    @Test
    public void passwordContainsNoLowerCaseLetter() {
        PasswordValidator passwordValidator = new PasswordValidator();

        assertFalse(passwordValidator.passwordIsValid("PASSWORD1"));
    }


    @Test
    public void passwordContainsAtLeastOneUpperCaseLetter() {
        PasswordValidator passwordValidator = new PasswordValidator();

        assertTrue(passwordValidator.passwordIsValid("Password1@"));
    }


    @Test
    public void passwordContainsNoUpperCaseLetter() {
        PasswordValidator passwordValidator = new PasswordValidator();

        assertFalse(passwordValidator.passwordIsValid("password1"));
    }


    @Test
    public void passwordContainsAtLeastOneSpecialChar() {
        PasswordValidator passwordValidator = new PasswordValidator();

        assertTrue(passwordValidator.passwordIsValid("Password1@"));
    }


    @Test
    public void passwordContainsNoSpecialChar() {
        PasswordValidator passwordValidator = new PasswordValidator();

        assertFalse(passwordValidator.passwordIsValid("Password1"));
    }


    @Test
    public void passwordContainsNonPermittedSpecialChar() {
        PasswordValidator passwordValidator = new PasswordValidator();

        assertFalse(passwordValidator.passwordIsValid("Password1!"));
    }
}