package Exception.Homework.H3;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    /**
     * Запись в файл
     * @param user Объект User
     */
    void writeHuman(User user) {
        String pathFile = user.getLastName() + ".txt";

        try (FileWriter fileWriter = new FileWriter(pathFile, true)){
            fileWriter.write(user.toString() + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
