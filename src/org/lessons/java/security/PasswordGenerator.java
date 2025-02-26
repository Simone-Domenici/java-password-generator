package org.lessons.java.security;

public class PasswordGenerator {
    public static void main(String[] args) {
        String Name = "John";
        String Surname = "Doe";
        String FavouriteColor = "Lime";
        int BirthDay = 11;
        int BirthMonth = 04;
        int BirthYear = 2000;
        
        String Password = Name + "-" + Surname + "-" + FavouriteColor + "-" + (BirthDay + BirthMonth + BirthYear);
        System.out.println(Password);

    }
}
