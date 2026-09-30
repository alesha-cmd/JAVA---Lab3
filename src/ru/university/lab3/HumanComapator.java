package ru.university.lab3;

import java.util.Comparator;
public class HumanComapator implements Comparator<Human>{ //Отдельный класс-компаратор для сортировки по одной фамилии, без учёта имени и возраста.
    @Override
    public int compare(Human h1, Human h2){
        return h1.getLastName().compareTo(h2.getLastName());
    }
}
