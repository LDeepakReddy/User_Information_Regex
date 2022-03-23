package com.blz.userinformation;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the user information program");
        System.out.println("Enter first name");
        UserRegistration validate= new UserRegistration();
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        validate.validateFirstName(firstName);
    }
}


