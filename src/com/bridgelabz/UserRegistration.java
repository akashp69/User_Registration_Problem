package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /**
     * Using method for checking the valid firstName , lastname , gmailid and phoneNumber
     */
    public static void userRegistrationSystem() {
        System.out.println("Welcome to User Registration system using Regex");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter your First Name : ");
        String firstName = scanner.nextLine();
        boolean userName = Pattern.matches("[A-Z]{1}[a-z]{2,}", firstName);
        if(userName==true){
            System.out.println("First name is Valid");
        }
        else {
            System.out.println("Please Enter Valid First Name !");
        }


        System.out.println("Enter your Last Name : ");
        String lastName = scanner.nextLine();
        boolean userLastName=Pattern.matches("[A-Z][a-z]{2,}", lastName);
        if(userLastName==true){
            System.out.println("Last name is Valid");
        }
        else {
            System.out.println("Please Enter Valid Last Name !");
        }

        System.out.println("Enter your Email : ");
        String Email = scanner.nextLine();
        boolean userEmail=Pattern.matches("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?", Email);
        if(userEmail==true){
            System.out.println("Email id is Valid");
        }
        else {
            System.out.println("Please Enter Valid email id !");
        }

        System.out.println("Enter your Mobile No. : ");
        CharSequence mobileNum = scanner.next();
        boolean userNumber=Pattern.matches("(0|91)?[6-9][0-9]{9}", mobileNum);
        if(userNumber==true){
            System.out.println("Phone Number is Valid ");
        }
        else {
            System.out.println("Please Enter Valid Phone Number!");
        }

        System.out.println("Enter your Password : ");
        String password = scanner1.nextLine();
        boolean userPassword=Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}", password);
        if(userPassword==true){
            System.out.println("Password is Valid");
        }
        else {
            System.out.println("Please Enter Valid Password !");
        }
    }

    /**
     *This is Main Method is Using for Calling the method for checking valid first , lastname and mail id and phoneNumber
     */
        public static void main (String[]args) {
        userRegistrationSystem();


        }
    }

