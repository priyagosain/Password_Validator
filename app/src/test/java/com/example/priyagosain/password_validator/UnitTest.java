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
    public void passwordIsInvalid() throws Exception {
        // check that the string password is not an acceptable password (case insensitive)
        assertEquals(false, Validate("password"));
        assertEquals(false, Validate("PassWorD"));
        assertEquals(true, Validate("not_password"));
    }

    @Test
    public void passwordLength() throws Exception {
        // check that the password is at least 8 characters long
        assertEquals(false, Validate("1234567"));
        assertEquals(true, Validate("12345678"));
    }
}