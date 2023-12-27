package com.register;

import java.util.Scanner;

public class UserRegistrationValidation {

    public static void main(String[] args) {

        Scanner scannerValue = new Scanner(System.in);

//        UC1 First name starts with Cap and has minimum 3 characters
        System.out.println("Enter First Name : ");
        String firstName = scannerValue.next();
        String regex1 = "[A-Z]{1}[a-z]{3,}";
        System.out.println(" Validation : " + firstName.matches(regex1));

//        UC 2 Last name starts with Cap and has  minimum 3 characters
        System.out.println("Enter Last  Name : ");
        String lastName = scannerValue.next();
        String regex2 = "[A-Z]{1}[a-z]{3,}";
        System.out.println(" Validation : " + lastName.matches(regex2));

//        Uc 3 Email has 3 mandatory parts (abc, bl
//                & co) and 2 optional (xyz & in) with
//        precise @ and . positions

        System.out.println("Enter Email id : ");
        String Email = scannerValue.next();
        String regex3 = "[a-zA-Z0-9]{2,}+@[a-z]{2,}+\\.[a-zA-Z]{2,}";
        System.out.println(" Validation : " + Email.matches(regex3));

    }
}
