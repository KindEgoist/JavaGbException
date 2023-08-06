package org.example.gB.seminar.s2;

public class S2_2 {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 1;
            String test = null;
            System.out.println(test.length());
        } catch (ArithmeticException e){
            System.err.println("Деление на 0 нельзя");
        } catch (NullPointerException e) {
            System.err.println("Длины строки нет");
        }
        System.out.println(number);
    }


}
