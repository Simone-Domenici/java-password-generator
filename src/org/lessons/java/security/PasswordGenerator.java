package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String Name;
        String Surname;
        String FavouriteColor;
        int BirthDay;
        int BirthMonth;
        int BirthYear;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        Name = in.nextLine();
        System.out.println("Enter your surname: ");
        Surname = in.nextLine();
        System.out.println("Enter your favourite color: ");
        FavouriteColor = in.nextLine();
        System.out.println("Enter your birth day: ");
        BirthDay = in.nextInt();
        System.out.println("Enter your birth month: ");
        BirthMonth = in.nextInt();
        System.out.println("Enter your birth year: ");
        BirthYear = in.nextInt();
        
        String Password = Name + "-" + Surname + "-" + FavouriteColor + "-" + (BirthDay + BirthMonth + BirthYear);
        System.out.println("Your password is: " + Password);

    }
}
