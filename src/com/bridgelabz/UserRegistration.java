package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /**
     *This is Main method is using for checking the username is valid or not
     */
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-Z]+[a-z]{3,}");
        System.out.println("UserName Pattern Is first letter is Capital and minimum 3 character");
        System.out.println();
        Matcher matcher = pattern.matcher("Akash");

       System.out.println("The Given UserName is Valid username - "+matcher.matches());
    /**
    *Using if-else loop for checking valid Username if true then valid and false then wrong
    **/
        if(matcher.matches()==true){

            System.out.println("The Given UserName is Valid ");
        }
        else{
            System.out.println("Please Enter Valid UserNAme ");
        }
    }
}
