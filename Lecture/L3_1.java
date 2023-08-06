package org.example.lekciya;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class L3_1 {
    public static void main(String args[]) {
        FileReader reader = null;
        try {
            reader = new FileReader(new
                    File("file.txt"));
// Полезная работа, связанная с чтением  файла..
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

        try (FileReader reader2 = new FileReader(new File("file.txt"))) {
// Полезная работа, связанная с чтением файла..
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
