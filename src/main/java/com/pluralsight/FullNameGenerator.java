package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // name of program
        System.out.println("Full Name Generator");
        System.out.println("--------------------------------------");

        // asks user for first name
        System.out.print("Please Enter Your First Name: ");
        String firstName = input.nextLine().trim();


        // asks user to input middle name, if they have one
        System.out.print("Please Enter Your Middle Name or Initial (Press Enter to SKIP): ");
        String middleName = input.nextLine().trim();

        // asks user to input last name
        System.out.print("Please Enter Your Last Name: ");
        String lastName = input.nextLine().trim();


        // asks user to input suffix, if they have one
        System.out.print("Please Enter Your Suffix if you have one (Press Enter to SKIP): ");
        String haveSuffix = input.nextLine().trim();

        // program prints individual parts first
        System.out.println();
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Suffix: " + haveSuffix);

        // defines fullName as user's first name to check for other inputs
        String fullName = firstName;

        // checks if user input anything for middle name/initial, if not adds a space for formatting the print output
        if (middleName.length() > 0)
        {
            fullName += " " + middleName;
        }

        // adds user's last name no matter what, and a space for formatting. after checking for middle name/initial
        fullName += " " + lastName;

        // checks if user input anything for suffix, includes comma and space for formatting if true
        if (haveSuffix.length() > 0) {
            fullName += ", " + haveSuffix;
        }

        // final output + formatting
        System.out.println("------------------------------------------");
        System.out.println("Full Name: " + fullName);

    }
}
