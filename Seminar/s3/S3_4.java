package Exception.Seminar.s3;

/**
 * Создайте класс исключения, который будет выбрасываться при делении на 0.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class S3_4 extends ArithmeticException{
    public S3_4() {
    }

    public S3_4(String s) {
        super(s);
    }
}
