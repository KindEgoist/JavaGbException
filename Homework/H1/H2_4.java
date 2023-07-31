package Exception.Homework.H1;

import java.util.Scanner;

public class H2_4 {
    public static void main(String[] args) {
    showString();
    }
    private static void showString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        if (!str.isEmpty()) System.out.println(str);
        else {
            System.err.println("Введена пустая cтрока. Повторите!");
            showString();
        }
    }
}
