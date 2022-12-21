package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void userName(){
        Scanner scanner=new Scanner(System.in);
        Pattern pattern = Pattern.compile("[A-Z]+[a-z]{3,}");
        System.out.println("\nUserName Pattern Is first letter is Capital and Atleast 3 character");
        System.out.println("Enter User Name Here");
        String userName=scanner.next();
        Matcher matcher = pattern.matcher(userName);
        boolean name=(matcher.matches());
        /**
         *Using if-else loop for checking valid Username if true then valid and false then wrong
         **/
        if(matcher.matches()==name){

            System.out.println("The Given UserName is Valided ");
        }
        else{
            System.out.println("Please Enter Valid UserName ");
        }
    }
    public static void lastName(){
        Scanner scanner=new Scanner(System.in);
        Pattern pattern = Pattern.compile("[A-Z]+[a-z]{3,}");
        System.out.println("*************************************");
        System.out.println("\nLastName Pattern Is first letter is Capital and Atleast 3 character");
        System.out.println("Enter Last Name Here");
        String userLastName=scanner.next();
        Matcher matcher = pattern.matcher(userLastName);
        boolean name=(matcher.matches());
        /**
         *Using if-else loop for checking valid Lastname if true then valid and false then wrong
         **/
        if(matcher.matches()==name){

            System.out.println("The Given LastName is Valided ");
        }
        else{
            System.out.println("Please Enter Valid LastName ");
        }
    }
    public static void userGmail(){
        Scanner scanner=new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+$");
        System.out.println("*************************************");
        System.out.println("\nEnter Valid gmail Id pattern is google4@gmail.com");
        System.out.println("Enter gmail Id Here");
        String userGmailId=scanner.nextLine();
        Matcher matcher = pattern.matcher(userGmailId);
        boolean name=(matcher.matches());
        /**
         *Using if-else loop for checking valid Lastname if true then valid and false then wrong
         **/
        if(matcher.matches()==name){

            System.out.println("The Given gmail Id is Valided ");
        }
        else{
            System.out.println("Please Enter Valid gmail Id ");
        }
    }

    /**
     *This is Main method is using for checking the Lastname is valid or not
     */
    public static void main(String[] args) {
        userName();
        lastName();
        userGmail();



    }
}
