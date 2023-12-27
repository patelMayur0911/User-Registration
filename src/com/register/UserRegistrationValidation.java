package com.register;

import java.util.Scanner;

public class UserRegistrationValidation {

    public static void main(String[] args) {

        Scanner scannerValue = new Scanner(System.in);

//        UC1 First name starts with Cap and has minimum 3 characters
//        System.out.println("Enter First Name : ");
        String firstName = "Mayur"; // scannerValue.next();
        String regex1 = "[A-Z]{1}[a-z]{3,}";
        System.out.println(firstName + " Validation : " + firstName.matches(regex1));

//        UC 2 Last name starts with Cap and has  minimum 3 characters
//        System.out.println("Enter Last  Name : ");
        String lastName = "Patel"; //  scannerValue.next();
        String regex2 = "[A-Z]{1}[a-z]{3,}";
        System.out.println(lastName+" Validation : " + lastName.matches(regex2));

//        Uc 3 Email has 3 mandatory parts (abc, bl
//                & co) and 2 optional (xyz & in) with
//        precise @ and . positions

//        System.out.println("Enter Email id : ");
        String Email = "patelmayur@gmail.com";
        String regex3 = "[a-zA-Z0-9]{2,}@[a-z]{2,}\\.[a-zA-Z]{2,}";
        System.out.println(Email+" Validation : " + Email.matches(regex3));

//        UC 4 Country code follow by space and 10
//        digit number
//        System.out.println("Enter Number with Country code : ");
        String countryCode = "91 0123456789";
        String regex4 = "[0-9]{2,4} [0-9]{6,10}";
        System.out.println(countryCode+" Validation : " + countryCode.matches(regex4));

//        UC 5 Password minimum 8 Characters
//        UC 6 at least 1 Upper Case
        String password = "Patelmayuraaa";
        String regex5 = "^(?=.*[A-Z])[A-Za-z0-9]{8,}";
        System.out.println(countryCode+" Validation : " + password.matches(regex5));

    }
}
