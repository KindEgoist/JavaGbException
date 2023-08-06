package Exception.Seminar.s3;

import java.io.IOException;

/**
 *  * Создайте метод Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
 *  Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Подумайте,
 *  что должно происходить при закртии этого ресурса? Напишите метод для пероверки, закрыт ли ресурс.
 *  При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class S3_3 implements AutoCloseable{
    private int number;
    private boolean isNoteClose;

    public S3_3() {
        this.number = 0;
        this.isNoteClose = true;
    }

    public int getNumber() {
        return number;
    }

    public void add() throws IOException {
            if (isNoteClose) System.out.println(number++);
            else throw new IOException("Вы обратились к закрытому ресурсу");
    }

    @Override
    public void close() throws Exception {
        isNoteClose = false;
    }
}
