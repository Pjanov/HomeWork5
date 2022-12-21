package ru.pjanov;

public class Main {
    public static void main(String[] args) {

        TelephoneDirectory td = new TelephoneDirectory();

        td.phoneNumbers.add("123");
        td.phoneNumbers.add("456");
        td.phoneBook.putIfAbsent("Andrey",td.phoneNumbers);

        System.out.println(td.phoneBook);

    }
}