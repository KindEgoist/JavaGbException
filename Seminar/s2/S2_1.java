package org.example.Seminar.s02;
/**
 * Изучите данный код. Все ли с ним хорошо? Если нет, скорректируйте код, попробуйте обосновать свое решение.
 */

import java.util.Arrays;
import java.util.Scanner;

public class S2_1 {
    public static void main(String[] args) {
      run();

    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в котором записать занчение 1");

        try {
            if (scanner.hasNextInt()){
                int index = scanner.nextInt();
                arr[index] = 1;
            }
            else throw new ClassCastException("Неправельное приведение типов");

        } catch (ArrayIndexOutOfBoundsException e){
            throw new ClassCastException("Указан индекс за пределом массива");
            
        }
        System.out.println(Arrays.toString(arr));
    }

}
                                                 