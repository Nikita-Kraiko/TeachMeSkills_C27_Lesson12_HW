package com.tms.lesson12_HW.run;

import com.tms.lesson12_HW.task.Task1;
import com.tms.lesson12_HW.task.Task2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        String string = scanner.nextLine();
        Task1.getAbbreviations(string);
        String text = "2222-2222-24 kraiko@mail.ru +(29)32112345";
        Task2.searchNecessaryInfo(text);
    }
}
