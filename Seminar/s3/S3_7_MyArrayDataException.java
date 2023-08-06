package Exception.Seminar.s3;

import java.util.List;

public class S3_7_MyArrayDataException extends RuntimeException{
    public S3_7_MyArrayDataException(String message) {
        super(message);
    }
    public S3_7_MyArrayDataException(int i, int j){
        super(String.format("В ячейки [%s] [%s] не число!", i, j));
    }
    public S3_7_MyArrayDataException(List<Goal> goals){
        super(String.format("В ячейках %s не число!", goals));
    }

}
