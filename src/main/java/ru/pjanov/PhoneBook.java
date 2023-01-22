package ru.pjanov;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> data;
    private String lastName;
    private List<String> phoneNumbers;

    {
        data = new TreeMap<>();
        lastName = "?";
        phoneNumbers = new ArrayList<>();
    }

    public PhoneBook() {}

    @Override
    public String toString() {
        return String.format("%s", data);
    }

    public void set(String lastName, String... phoneNumbers) {
        this.lastName = lastName;
        this.data.putIfAbsent(this.lastName, List.of(phoneNumbers));
    }

    public String getKey(String lastName) {
        return lastName + ": " + this.data.get(lastName);
    }

    public Map<String, List<String>> getData() {
        return data;
    }

    public void setData(Map<String, List<String>> data) {
        this.data = data;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}

