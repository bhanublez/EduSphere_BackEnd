package com.service.EduSphere.PasswordSecurity;

import org.mindrot.jbcrypt.BCrypt;

import java.security.SecureRandom;

public class passwordDancer {
    public static String generatePassword() {
        final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String lower = upper.toLowerCase();
        final String digits = "0123456789";
        final String special = "~`!@#$%^&*()-_=+[]{}|;:'\",'.<>?";


        final String allCharacters = upper + lower + digits + special;
        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(index));
        }

        return password.toString();
    }

    //Advance Hashing function for encrypting password
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
        //Here BCrypt is a class and hashpw is a method of BCrypt class
        //BCrypt.gensalt(12) is a method of BCrypt class
        //Which is used to generate a salt for hashing
        //12 is the log_rounds
    }
}

