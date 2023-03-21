/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasunitarias;

/**
 *
 * @author isaac
 */
public class PasswordUtil {
    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }
    public static SecurityLevel assessPassword(String password){
        if(password.length()<8){
            return SecurityLevel.WEAK;
        }
        if(password.matches("[a-zA-Z]+")){
            return SecurityLevel.WEAK;
        }
        if(password.matches("[0-9]+")){
            return SecurityLevel.WEAK;
        }
        if(password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }
        if(password.matches("[^a-zA-Z0-9]+")){
            return SecurityLevel.WEAK;
        }
        return SecurityLevel.STRONG;
    }
}
