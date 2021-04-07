package Assignment_7;

public class InternalError {

    public static void printNumber(int n) {
        System.out.println(n);
        printNumber(n + 1);
    }

    public static void main(String[] args) {

        printNumber(1); // StackOverflowError

    }
}
