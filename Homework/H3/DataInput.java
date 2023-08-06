package Exception.Homework.H3;

import java.util.Scanner;

public class DataInput {
    /**
     * Полученные данные отправляет на проверку
     * @return объект с проверенными данными
     */
      User inOutData(){
        String[] data = input();
        Check check = new Check();
        check.checkLenghtArr(data);
        check.checkFIO(data);
        check.checkDateBirth(data[3]);
        check.checkPhoneNumber(data[4]);
        check.checkSex(data[5]);
        return new User(data[0],data[1],data[2],data[3],data[4],data[5]);
    }

    /**
     * Ввод данных
     * @return массив строк
     */
    private static String[] input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные через пробел\n" +
                "Фамилия, Имя, Отчество, Дата рождения, Телефон, Пол\n" +
                "Пример: Burmistrov Maxim Valerevich 08.09.1983 89139066684 m");
        return scanner.nextLine().split(" ");
    }




}
