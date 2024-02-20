package com.tms.lesson12_HW.task;

import com.tms.lesson12_HW.constant.RegExConst;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void searchNecessaryInfo(String string){
        Pattern docs = Pattern.compile(RegExConst.DOCUMENT_NUMBER_REGEX);
        Pattern email = Pattern.compile(RegExConst.EMAIL_ADDRESS_REGEX, Pattern.CASE_INSENSITIVE);
        Pattern phoneNumber = Pattern.compile(RegExConst.PHONE_NUMBER_REGEX);

        Matcher docsMatch = docs.matcher(string);
        Matcher mailMatch = email.matcher(string);
        Matcher phoneMatch = phoneNumber.matcher(string);


        while (mailMatch.find()) {
            System.out.println(mailMatch.group());
        }
        while (phoneMatch.find()) {
            System.out.println(phoneMatch.group());
        }
        while (docsMatch.find()) {
            System.out.println(docsMatch.group());
        }
    }
}
