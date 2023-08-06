package Exception.Seminar.s3;

public class S3_7_MyArraySizeException extends RuntimeException{
    public S3_7_MyArraySizeException() {
        super("Массив не квадратный!");
    }
}
