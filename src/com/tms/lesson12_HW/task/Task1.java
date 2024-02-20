package com.tms.lesson12_HW.task;

import com.tms.lesson12_HW.constant.RegExConst;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void getAbbreviations(String string){
        String[] mas = string.split(" ");
        String result = String.join(" ", mas);
        Pattern pattern = Pattern.compile(RegExConst.SPLIT_STRING_INTO_ABBREVIATIONS_REGEX);
        Matcher matcher = pattern.matcher(result);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
