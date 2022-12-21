package ru.pjanov;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и
 * телефонных номеров. Учесть, что под одной фамилией может находиться несколько телефонных номеров.
 * Важно: Каждый пользователь - уникальный ключ в коллекции. В выбранной Вами коллекции не должно
 * быть повторений имён
 */
public class TelephoneDirectory {
    ArrayList<String> phoneNumbers = new ArrayList<>();
    Map<String, ArrayList<String>> phoneBook = new TreeMap<>();
}
