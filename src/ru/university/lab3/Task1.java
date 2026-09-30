package ru.university.lab3;

import java.lang.reflect.Array;
import java.util.*;
public class Task1 {
    public void run(){
        int N = 10;
        Integer[] array = new Integer[N];
        Random random = new Random();
        for (int i = 0; i < N; i++){
            array[i] = random.nextInt(101);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        List<Integer> list = new ArrayList<>(Arrays.asList(array)); //список фиксированной длины
        System.out.println("Список: " + list);

        Collections.sort(list);
        System.out.println("По возрастанию: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("По убыванию: " + list);

        Collections.shuffle(list);
        System.out.println("Перемешанный: " + list);

        Collections.rotate(list, 1);
        System.out.println("Циклический сдвиг на 1: " + list);

        Set<Integer> unique = new LinkedHashSet<>(list);
        System.out.println("Уникальные элементы: " + unique);

        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (Integer num : list){
            if (!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("Дублирующиеся элементы: " + duplicates);

        Integer[] newArray = list.toArray(new Integer[0]);
        System.out.println("Массив из списака: " + Arrays.toString(newArray));

        Map<Integer, Integer> frequency = new HashMap<>();
        for (Integer num : list){
            if (frequency.containsKey(num)){
                frequency.put(num, frequency.get(num) + 1);
            }
            else {
                frequency.put(num, 1);
            }
        }
        System.out.println("Частота вхождений: " + frequency);
    }
}
