package ru.university.lab3;

import java.util.Iterator;

public class Task2 {
    public void run(){
        int N = 10;
        PrimesGenerator generator = new PrimesGenerator(N);
        System.out.println("Первые " + N + " простых чисел (прямой порядок): ");
        for (Integer prime : generator){
            System.out.print(prime + " ");
        }
        System.out.println();

        System.out.print("Первые " + N + " простых чисел (Обратный порядок): ");
        for (Iterator<Integer> it = generator.reverseIterator(); it.hasNext(); ){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
