package com.blz.userinformation;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the user information program");
        UserRegistration compare = new UserRegistration();
        Scanner scan = new Scanner(System.in);
        System.out.println("1 to validate first name");
        System.out.println("2 to validate last name");
        System.out.println("3 to validate email id");
        System.out.println("4 to validate mobile number");
        System.out.println("5 to validate Password");
        int chooseOption = scan.nextInt();

        switch (chooseOption) {
            case 1:
                System.out.println("Enter first name");
                String firstName = scan.next();
                compare.validateFirstName(firstName);
                break;
            case 2:
                System.out.println("Enter last name");
                String lastName = scan.next();
                compare.validateLastName(lastName);
                break;
            case 3:
                System.out.println("Enter email id");
                String emailId = scan.next();
                compare.validateEmail(emailId);
                break;
            case 4:
                System.out.println("Enter mobile number");
                String mobileNUmber = scan.next();
                compare.validateMobilenumber(mobileNUmber);
                break;
            case 5:
                System.out.println("Enter password");
                String passWord = scan.next();
                compare.validatePassword(passWord);

        }


    }
}


