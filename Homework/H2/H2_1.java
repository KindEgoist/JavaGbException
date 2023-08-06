package Exception.Homework.H2;

import java.util.Scanner;

public class H2_1 {
    public static void main(String[] args) {
        showFloat();
    }
    private static void showFloat(){
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(scanner.nextFloat());
        }
        catch (RuntimeException e){
            System.err.println("Введено не число! Повторите попытку");
            showFloat();
        }
    }
}
