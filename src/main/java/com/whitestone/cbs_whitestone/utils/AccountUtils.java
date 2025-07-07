package com.whitestone.cbs_whitestone.utils;

import java.time.Year;

public class AccountUtils {
    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created!";
    public static final String ACCOUNT_CREATION_SUCCESS_CODE = "002";
    public static final String ACCOUNT_CREATION_SUCCESS_MESSAGE = "Account has been successfully created!";
    public static final String ACCOUNT_DOES_NOT_EXIST = "003";
    public static final String ACCOUNT_DOES_NOT_EXIST_MESSAGE = "The User with the given account number does not exist";
    public static final String ACCOUNT_FOUND = "004";
    public static final String ACCOUNT_FOUND_MESSAGE = "The User account was found";

//    Account Number - current year+random 6 digits = 2025123456 (6 digits - 100000 to 999999)
    public static String generateAccountNumber(){
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        int randNumber = (int)Math.floor(Math.random() * (max-min+1) + min);
        //Convert current year and random number to string and concatenate
        String year=String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        String accountNumber=year+randomNumber;
        return accountNumber;
    }
}
