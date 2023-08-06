package Exception.Homework.H3;

public class Center {
    /**
     * Запуск -> Ввод данных -> Проверка данных -> Присваевание объекту User данных -> Запись данных в файлы\файл
     */
    void start(){
    DataInput dataInput = new DataInput();
    User user = dataInput.inOutData();
    Writer writer = new Writer();

    try {
       writer.writeHuman(user);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}

}
