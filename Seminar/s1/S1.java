package org.example.gB.seminar.s1;

/**
 * Задание 1
 * Реализуйте метод, принимающий в качестве аргумента целочисленный
 * массив.
 * Если длина массива меньше некоторого заданного минимума, метод
 * возвращает -1, в качестве кода ошибки, иначе - длину массива.
 */
public class S1 {
    public static void main(String[] args) {
        int[] ar = {1, 5, 5, 6};
        System.out.println(checkLenght(ar));
    }
    public static int checkLenght(int[] array){
        final int number = 5;
        if (array.length < number) return -1;
        else return array.length;
    }
}
