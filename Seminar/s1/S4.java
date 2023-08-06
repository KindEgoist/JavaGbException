package org.example.gB.seminar.s1;

/**
 * Задание 3
 * Реализуйте метод, принимающий в качестве аргумента целочисленный
 * двумерный массив.
 * Необходимо посчитать и вернуть сумму элементов этого массива. При этом
 * накладываем на метод 2 ограничения:
 * метод может работать только с квадратными массивами (кол-во строк = кол-
 * ву столбцов), и в каждой ячейке может лежать только значение 0 или 1. Если
 * нарушается одно из условий, метод должен бросить RuntimeException с
 * сообщением об ошибке.
 */
public class S4 {


    public static void main(String[] args) {
        int[][] arrayDouble = {
                {0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}};
        System.out.println(matrixSum(arrayDouble));
    }
    public static int matrixSum(int[][] arrayDouble){
        int sum = 0;

        isNotSquer(arrayDouble);
        for (int[] i : arrayDouble) {
            for (int j : i) {
                if (j == 0 || j == 1) sum += j;
                else throw new RuntimeException("ERROR");
            }
        }
        return sum;
    }

    /**
     * проверка на семитричный 2-х мерный массив
     * @param arrayDouble
     * @return
     */
    public static boolean isNotSquer(int[][] arrayDouble){
        for (int[] i : arrayDouble)
            if (i.length != arrayDouble.length) throw new RuntimeException("ERROR");
        return true;
    }
}
