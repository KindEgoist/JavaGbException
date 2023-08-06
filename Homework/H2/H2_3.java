package Exception.Homework.H2;

public class H2_3 {
    public static void main(String[] args)  {
        int a = 90;
        int b = 3;
        int[] arr = {1, 2};

        divisionByNumber(a,b);
        printSum(a,b);
        showIndex(arr);



    }
    private static void divisionByNumber(int a, int b){
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e){
            System.err.println("Деление на 0 нельзя");
        }
    }
    private static void printSum(Integer a, Integer b)  {
        System.out.println(a + b);
    }
    private static void showIndex(int[] arr){
        try {
            System.out.println(arr[3] = 9);

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        }catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

}

