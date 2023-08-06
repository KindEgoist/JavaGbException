package org.example.gB.seminar.s2;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class S2_1 {
    public static void main(String[] args) {
/**
        // NullPointerException Обращение к несуществующему объекту

        String name = null;
        System.out.println(name.length());
*/

/**
        // ClassCastException Неверное приведение типов

        Object obj = new String("123");
        File file = (File) obj;
        System.out.println(file);
*/

/**
        // NumberFormatException Неверное преобразование символьной строки в числовой формат

        String number = "123df";
        int result = Integer.parseInt(number);
        System.out.println(result);
*/

/**
        // UnsupportedOperationException Попытка выполнения нереализованного метода

        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());
*/
    }
}
