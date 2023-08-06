package Exception.Seminar.s3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Перепишите код, воспользовавшись механизмом try-with-resources
 */
public class S3_1 {
    public static void main(String[] args) {
        Path path = Path.of("F:\\GB\\Java\\untitled\\src\\main\\java\\Exception\\Seminar\\s3\\1.txt");
        Path path2 = Path.of("F:\\GB\\Java\\untitled\\src\\main\\java\\Exception\\Seminar\\s3\\2.txt");

        try {
            rwLine(path, path2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * БЫЛО
     */
//    public static void rwLine(Path pathRead, Path pathWrite) throws IOException{
//        BufferedReader in = null;
//        BufferedWriter out = null;
//        try {
//            in = Files.newBufferedReader(pathRead);
//            out = Files.newBufferedWriter(pathWrite);
//            out.write(in.readLine());
//        } finally {
//            try {
//                if(in != null) in.close();
//            } catch (IOException e) {}
//            try {
//                if(out != null) out.close();
//            } catch (IOException e) {}
//        }
//    }

    /**
     * Стало
     */
    public static void rwLine(Path pathRead, Path pathWrite) throws IOException{

        try(BufferedReader in = Files.newBufferedReader(pathRead);
            BufferedWriter out = Files.newBufferedWriter(pathWrite)) {

            out.write(in.readLine());
        }
    }
}
