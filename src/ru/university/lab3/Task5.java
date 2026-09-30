package ru.university.lab3;

import java.util.HashMap;
import java.util.Map;
public class Task5 {
    public void run(){
        Map<String, Integer> original = new HashMap<>();
        original.put("one", 1);
        original.put("two", 2);
        original.put("three", 3);
        System.out.println("Исходный Map: " + original);

        Map<Integer, String> swapped = swapKeysAndValues(original);
        System.out.println("Обмененный Map: " + swapped);
    }

    public static <K, V> Map<V, K> swapKeysAndValues(Map<K, V> original){
        Map<V, K> swapped = new HashMap<>();
        for (Map.Entry<K, V> entry : original.entrySet()){ //Обходим все пары исходной мапы.
            // У каждой пары берём value и делаем его ключом в новой мапе, а key — значением. То есть «переворачиваем» пару
            swapped.put(entry.getValue(), entry.getKey());
        }
        return swapped;
    }
}
