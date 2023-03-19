/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pruebasunitarias;

import static com.mycompany.pruebasunitarias.PasswordUtil.SecurityLevel.MEDIUM;
import static com.mycompany.pruebasunitarias.PasswordUtil.SecurityLevel.STRONG;
import static com.mycompany.pruebasunitarias.PasswordUtil.SecurityLevel.WEAK;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author isaac
 */
public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
    }
    
    @Test
    public void weak_when_has_only_letters() {
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }
    
    @Test
    public void medium_when_has_only_letters_and_numbers() {
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd1234"));
    }
    
    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd1234!"));
    }
    
}
