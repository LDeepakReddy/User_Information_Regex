package com.blz.userinformation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public final String firstName = "^[A-Z]{1}[a-z]{2,}$";
    public final String lastName ="^[A-Z]{1}[a-z]{3,}$";

    public void validateFirstName(String userFirstName) {
        Pattern pattern = Pattern.compile(firstName);
        Matcher matcher = pattern.matcher(userFirstName);
        if (matcher.matches())
            System.out.println("Entered firstName " + userFirstName + " is valid");
        else
            System.out.println("firstName " + userFirstName + " is invalid");
    }
    public void validateLastName(String userlastName){
        Pattern pattern = Pattern.compile(lastName);
        Matcher matcher = pattern.matcher(userlastName);
        if (matcher.matches())
            System.out.println("Entered lastname " +userlastName + "is valid");
        else
            System.out.println("Entered lastname " +userlastName + "is in valid");
    }

}



