package org.example.Seminar.s02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Обработайте возможные исключительные ситуации. "Битые" значения в исходном массиве считайте нулями.
 * Можно внести в код правки, которые считаете необходимыми
 */
public class S2_2 {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                };
        sum2d(arr);


    }
    private static void sum2d(String[][] arr){

        try {
            System.out.println(summa(arr));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Блок catch");
            fillAR(arr, arr.length);
            System.out.println(summa(arr));
        }
        catch (NumberFormatException e){
            System.err.println(e.getMessage());
            System.err.println("Введено не число");
            System.exit(1); //выход из системы
        }

    }
    private static String[][] fillAR(String[][] arr, int length){
        for (int i = 0; i < length; i++) {

            if (arr[i].length < length) {
                String[] tmp = new String[length];
                System.arraycopy(arr[i],0, tmp,0, arr[i].length);// копирование массива,
                // 1аргумент - откуда копируем,
                // 2аргумент - с какой позиции(индекс),
                // 3аргумент - куда копируем,
                // 4аргумент - с какой позиции встовлять скопированое,
                // 5аргумент - до какой позиции(в нашем случае до длены массива)
                for (int j = arr[i].length; j < length; j++) {
                    tmp[j] = "0";
                }
                arr[i] = tmp;
            }
        }
        return arr;
    }
    private static int summa(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }


}
