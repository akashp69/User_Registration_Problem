package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /**
     *This is Main method is using for checking the Lastname is valid or not
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Pattern pattern = Pattern.compile("[A-Z]+[a-z]{3,}");
        System.out.println("\n LastName Pattern Is first letter is Capital and Atleast 3 character");
        System.out.println("\nEnter Last Name Here");
        String lastName=scanner.next();
        Matcher matcher = pattern.matcher(lastName);
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
}
