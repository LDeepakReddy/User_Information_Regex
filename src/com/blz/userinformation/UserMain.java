package com.blz.userinformation;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the user information program");

        System.out.println("Enter first name");
        UserRegistration compare = new UserRegistration();
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        System.out.println("Enter last name");
        String lastName = scan.next();

        System.out.println("Enter email id");
        String emailId=scan.next();
        System.out.println("Enter mobile number");
        String mobileNUmber =scan.next();

        compare.validateFirstName(firstName);
        compare.validateLastName(lastName);
        compare.validateEmail(emailId);
        compare.validateMobilenumber(mobileNUmber);


    }
}


