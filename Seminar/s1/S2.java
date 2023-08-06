package org.example.gB.seminar.s1;

import java.util.Scanner;

/**Задание 2
        Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
        значение.
        Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
        1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве
        кода ошибки.
        2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
        3. если вместо массива пришел null, метод вернет -3
        4.Напишите метод, в котором реализуйте взаимодействие с пользователем.
        То есть, этот метод запросит искомое число у пользователя, вызовет первый,
        обработает возвращенное значение и покажет читаемый результат пользователю.
        Например, если вернулся -2, пользователь увидит сообщение: “Искомый элемент не найден”.
*/
 public class S2 {
    public static void main(String[] args) {

        int[] ar = {1, -3, 5, 5, 5};
        show(ar);

    }
     public static int error(int[] ar, int num){
         final int a = 5;
         if (ar == null || ar.length == 0) return -3;
         else if (ar.length < a) return -1;
         for (int i = 0; i < ar.length; i++) {
             if (ar[i] == num) {
                 return i;
             }
         }
         return -2;
     }
     public static void show(int[] ar){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (error(ar, number) == -3) System.err.println("Пустой массив");
        else if (error(ar, number) == -1) System.err.println("Длина массива маленькая");
        else if (error(ar, number) == -2) System.err.println("Элемент не найден");
        else System.out.println("Элемент раван " + error(ar, number));
     }

}
