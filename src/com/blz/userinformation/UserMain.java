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
        compare.validateFirstName(firstName);
        compare.validateLastName(lastName);


    }
}


