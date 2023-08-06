package Exception.Homework.H2;

public class H2_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 6, 5, 7, 8, 9, 4, 7, 7};
        int d = 0;
        divisionByNumber(arr, d);
    }
    private static void divisionByNumber(int[] intArray, int d) {
        try {
            double catchedRes1 = intArray[8] / 0;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.err.println("Catching exception: " + e);
        }
    }

}
