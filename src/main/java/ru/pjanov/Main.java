package ru.pjanov;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.set("Ivanov", "123", "89651234567");
        phoneBook.set("Smirnov", "456", "89658901234");
        phoneBook.set("Sidorov", "789", "89655678901");

        System.out.println(phoneBook.getKey("Sidorov"));
        System.out.println(phoneBook);
    }
}