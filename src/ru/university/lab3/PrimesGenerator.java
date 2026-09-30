package ru.university.lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PrimesGenerator implements Iterable<Integer>{ //ключевое слово. Обязывает класс реализовать метод iterator().
    private final List<Integer> primes = new ArrayList<>();
    public PrimesGenerator(int count){
        int found = 0; //сколько простых чисел нашли
        int number = 2; //начиная с 2
        while (found < count){
            if (isPrime(number)){
                primes.add(number);
                found++;
            }
            number++;
        }
    }
    private boolean isPrime(int num){
        if (num < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    @Override
    public Iterator<Integer> iterator(){
        return primes.iterator();
    }
    public Iterator<Integer> reverseIterator(){
        return new Iterator<Integer>() {
            private int index = primes.size() - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Integer next() {
                return primes.get(index--);
            }
        };
    }
}
