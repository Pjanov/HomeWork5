package ru.pjanov;


import java.util.*;

public class Main {
    static Map<String, List<String>> phoneNote = new HashMap<>();

    public static void main(String[] args) {

        // создать запись в телефонном справочнике
        phoneNote.putIfAbsent("Ivanov", Arrays.asList("123", "89651234567"));
        phoneNote.putIfAbsent("Smirnov", Arrays.asList("456", "89658901234"));
        phoneNote.putIfAbsent("Sidorov", Arrays.asList("789", "89655678901"));
        System.out.println(phoneNote);

        // получить по фамилии номера телефонов
        System.out.println(phoneNote.get("Ivanov"));
        System.out.println(phoneNote.get("Smirnov"));
        System.out.println(phoneNote.get("Sidorov"));
    }
}