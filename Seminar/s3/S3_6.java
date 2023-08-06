package Exception.Seminar.s3;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class S3_6 extends IOException {
    public S3_6() {
        super("Файл не найден");
    }
}
