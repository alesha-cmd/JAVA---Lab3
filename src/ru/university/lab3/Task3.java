package ru.university.lab3;

import java.util.*;
public class Task3 {
    public void run(){
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Иван", "Иванов", 25));
        humans.add(new Human("Пётр", "Петров", 30));
        humans.add(new Human("Анна", "Сидорова", 22));
        humans.add(new Human("Иван", "Иванов", 25));

        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("HashSet: " + hashSet);

        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("TreeSet: " + treeSet);

        Set<Human> treeSetByLastName = new TreeSet<>(new HumanComapator());//Здесь задаём внешний компаратор. TreeSet будет использовать его, а не естественный порядок.
        treeSetByLastName.addAll(humans);
        System.out.println("TreeSet (по фамилии): " + treeSetByLastName);

        Set<Human> treeSetByAge = new TreeSet<>(new Comparator<Human>(){//Анонимный компаратор по возрасту. Не создаём отдельный файл — здесь правило одноразовое.
            @Override
            public int compare(Human h1, Human h2){
                return Integer.compare(h1.getAge(), h2.getAge());
            }
        });
        treeSetByAge.addAll(humans);
        System.out.println("TreeSet (по возрасту): " + treeSetByAge);
    }
}
