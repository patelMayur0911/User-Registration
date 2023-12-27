package com.register;

import java.util.Scanner;

public class UserRegistrationValidation {

    public static void main(String[] args) {

        Scanner scannerValue = new Scanner(System.in);
        System.out.println("Enter First Name : ");

//        UC1 First name starts with Cap and has minimum 3 characters
        String firstName = scannerValue.next();
        String regex1 = "[A-Z]{1}[a-z]{3,}";
        System.out.println(" Validation : " + firstName.matches(regex1));

//        UC 2 Last name starts with Cap and has  minimum 3 characters
        String lastName = scannerValue.next();
        String regex2 = "[A-Z]{1}[a-z]{3,}";
        System.out.println(" Validation : " + lastName.matches(regex2));

    }
}
