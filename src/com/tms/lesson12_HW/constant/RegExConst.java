package com.tms.lesson12_HW.constant;

public interface RegExConst {
    String SPLIT_STRING_INTO_ABBREVIATIONS_REGEX = "\\b[A-Z]{2,6}\\b";
    String EMAIL_ADDRESS_REGEX = "[a-z0-9_\\.-]+@[a-z0-9_\\.-]+\\.[a-z]{2,3}";
    String PHONE_NUMBER_REGEX = "\\+\\(\\d{2}\\)\\d{7}";
    String DOCUMENT_NUMBER_REGEX = "\\d{4}-\\d{4}-\\d{2}";

}
