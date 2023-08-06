package Exception.Seminar.s3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * для S3_4 S3_5 S3_6
 */
public class MainClass {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, null};
        emtyIndex(arr, 1);
        try {
            nonExisted("F:\\GB\\Java\\untitled\\src\\main\\java\\Exception\\Seminar\\s3\\3.txt");
        } catch (S3_6 e) {
            throw new RuntimeException(e);
        }

    }
    public static void emtyIndex(Integer[] arr, int index){
        if(arr[index] == null) throw new S3_5();
        System.out.println("Все хорошо");
    }
    public static void nonExisted(String path) throws S3_6{
        File file = new File(path);
        if (!file.exists()) throw new S3_6();
        System.out.println("Все хорошо 2");


    }
}
