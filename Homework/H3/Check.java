package Exception.Homework.H3;

import java.util.Scanner;

public class Check {
    /**
     * Проверка на длину массива(количества введенных данных)
     * @param data массив строк с данными
     */
    void checkLenghtArr(String[] data) {
        if (data.length > 6) throw new RuntimeException("Введено больше данных");
        else if (data.length < 6) throw new RuntimeException("Введено меньше данных");
    }

    /**
     * Проверка ФИО на некоректный ввод
     * @param data массив строк с данными
     */
    void checkFIO(String[] data) {
        String regex = "[a-zA-Z]+\\.?";
        for (int i = 0; i < 3; i++) {
            if (!data[i].matches(regex) && i == 0) {
                throw new RuntimeException("Ошибка в фамилии");
            } else if (!data[i].matches(regex) && i == 1) {
                throw new RuntimeException("Ошибка в имени");
            } else if (!data[i].matches(regex) && i == 2) {
                throw new RuntimeException("Ошибка в отчестве");
            }
        }
     }

    /**
     * Проверка даты рождения
     * @param dateBirth строка из массива под индексом 3
     */
    void checkDateBirth(String dateBirth) {
        if (!dateBirth.matches(("^(1[0-2]|0[1-9]).(3[01]|[12][0-9]|0[1-9]).[0-9]{4}$"))) {
            throw new RuntimeException("Ошибка в дате рождения");
        }
    }

    /**
     * Проверка номера телефона
     * @param phoneNumber строка из массива под индексом 4
     */
    void checkPhoneNumber(String phoneNumber) {
        if (!phoneNumber.matches("[0-9]{3,15}")) {
            throw new RuntimeException("Ошибка в номере телефона");
        }
     }

    /**
     * Проверка Пола
     * @param sex строка из массива под индексом 5
     */
    void checkSex(String sex){
        if (!sex.equalsIgnoreCase("m") && !sex.equalsIgnoreCase("f"))
        {throw new RuntimeException("Ошибка пола");}
    }
}
