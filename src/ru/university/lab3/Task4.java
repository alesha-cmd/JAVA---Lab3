package ru.university.lab3;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Task4 {
    public void run() {
        String text = "Java is a programming language. Java is also an island. "
                + "Programming in Java is fun.";
        String[] words = text.toLowerCase().split("[^a-zа-я]+");//разбивает строку по регулярному выражению. ^ - отрицание
        Map<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                if (frequency.containsKey(word)) {
                    frequency.put(word, frequency.get(word) + 1);
                } else {
                    frequency.put(word, 1);
                }
            }
        }
        System.out.println("Текст: " + text);
        System.out.println("Частота слов: ");
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {//entrySet() даёт набор «пар» (Map.Entry) — каждая пара содержит ключ и значение.
            System.out.println(" " + entry.getKey() + " -> " + entry.getValue());//getKey() — слово, getValue() — его частота.
        }
    }
}
