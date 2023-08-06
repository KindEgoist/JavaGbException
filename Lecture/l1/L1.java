package org.example.gB.lecture.l1;

import java.io.File;

public class L1 {
    public static void main(String[] args) {
//        System.out.println(getFileSize(new File("F:/!Learning/Java/untitled/src/main/java/org/example/gB/lecture/l1/key.txt")));
        System.out.println(divide(10, 0));
    }
    public static long getFileSize(File file){
        if(!file.exists()) // файл не существует?
            return -1L;
        return file.length();
    }
    public static int divide(int a1, int a2){
        if (a2 == 0) {
            throw new RuntimeException("Деление на 0 нельзя");
        }
        return a1 / a2;
    }
}
