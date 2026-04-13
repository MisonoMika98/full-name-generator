package com.pluralsight;

import java.util.Scanner;

public class fullNameGenerator
{
    static Scanner input = new Scanner(System.in);

    static void main(string[] args)
    {
        // name of program
        System.out.println("Full Name Generator");
        System.out.println("--------------------------------------");

        // asks user for first name
        System.out.print("Please Enter Your First Name: ");

        String firstName = input.next();

        // empty string to make if/else statements function properly
        String middleName = "";

        // asks user if they have a middle name
        System.out.print("Do you have a Middle Name (Y/N)? ");
        String hasMiddleName = input.next();

        // if user has a middle name, asks them to input it
        if (hasMiddleName.equals("Y"))
        {
            System.out.print("Please Enter Middle Name: ");
            middleName = input.next();
            System.out.println("Middle Name Obtained");

        }
        // if user does not have a middle name, saves string as space
        else if (hasMiddleName.equals("N"))
        {
            System.out.println("User has no Middle Name");
        }

        // if user enters nonsense, exits program (reminder: turn into loop)
        else
        {
            System.out.println("Invalid please try again");
        }

        // asks user to input last name
        System.out.print("Please Enter Your Last Name: ");

        String lastName = input.next();

        // empty string to make if/else function
        String yesSuffix = "";

        // asks user if they have a suffix
        System.out.print("Do you have a suffix (Y/N)? ");
        String haveSuffix = input.next();

        // if user has a suffix, asks to input
        if (haveSuffix.equals("Y"))
        {
            System.out.print("Please Enter Suffix: ");
            yesSuffix = input.next();
            System.out.println("Suffix obtained");

        }

        // if user does not have suffix, saves as empty string
        else if (haveSuffix.equals("N"))
        {
            System.out.println("User has no Suffix");
        }

        // if user enters nonsense, exits program (reminder: turn into loop)
        else
        {
            System.out.println("Invalid, please try again");
        }

        // compiles names/suffix into string, prints full name
        String fullName = (firstName + middleName + lastName + ", " + yesSuffix);
        System.out.println(fullName);


    }
}
