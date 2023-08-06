package org.example.gB.seminar.s1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Задание 4
 * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве
 * аргумента целочисленный одномерный массив.
 * Метод должен пройтись по каждому элементу и проверить что он не равен
 * null. Реализуйте следующую логику:
 * 1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об
 * этом пользователя
 * 2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
 * “подсветить”
 */
public class S5 {


    public static void main(String[] args) {

        checkArray(new Integer[] {1, 2, null});
    }
    public static void checkArray(Integer[] arr){
        List<Integer> integerList = IntStream
                .range(0, arr.length)
                .filter(i -> arr[i] == null)
                .boxed()
                .toList();
//        List<Integer> integerList = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == null){
//                integerList.add(i);
//            }
//        }
        if (!integerList.isEmpty()) //throw new RuntimeException("Null в " + integerList);
            for (Integer el : integerList)
                System.err.printf("Ячейка: %d NULL\n", el);
        else System.out.println("Пустых ячеек не найдено");

    }


}
