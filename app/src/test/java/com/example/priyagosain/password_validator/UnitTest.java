package com.example.priyagosain.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.example.priyagosain.password_validator.MainActivity.Validate;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest {
    @Test
    public void passwordIsNotValid()  {
        // check that the string password is not an acceptable password (case insensitive)
        assertEquals(false, Validate("password"));
        assertEquals(false, Validate("PassWorD"));
    }

    @Test
    public void passwordLength() {
        // check that the password is at least 8 characters long
        assertEquals(false, Validate("1234567"));
    }

     @Test
     public void passwordContainsDigit() {
        // check that the password contains a digit
        assertEquals(false, Validate("priyapriya"));
        }

     @Test
     public void passwordContainsUpperLower() {
         // check that the password contains a lower/upper case
         assertEquals(false, Validate("priyapriya1"));
         assertEquals(false, Validate("PRIYAPRIYA1"));
     }

     @Test
     public void passwordContainsSpecialCharacter() {
         // check that the password contains a special charcter
         assertEquals(false, Validate("PriyaPriya1"));
     }

     @Test
    public void passwordIsValid() {
         // check that the password is valid that passes 5 set of rules
         assertEquals(true, Validate("PriyaPriya1#"));
    }
}