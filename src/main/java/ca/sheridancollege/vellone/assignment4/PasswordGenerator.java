package ca.sheridancollege.vellone.assignment4;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

    public static String encrypt(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return  encoder.encode(password);
    }

    public static void main(String[] args){
        System.out.println(encrypt("5k_&7Pm"));
    }
}

