package org.example.gB.seminar.s2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class S2_3 {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("F:/!Learning/Java/untitled/pom.xml");
//            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("cathc exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("start");
            if (test != null){
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exeption while close");
                }
            }
            System.out.println("finish");
        }
    }
}
