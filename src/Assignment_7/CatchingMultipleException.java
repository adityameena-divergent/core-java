package Assignment_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchingMultipleException {
    public static void main(String[] args) {



    }

    public static void catchingMultipleExceptionByMultipleCatchBlock() {
        try {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            System.out.println(10/n);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
    }

    public static void catchingMultipleExceptionBySingleCatchBlock() {
        try {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            System.out.println(10/n);
        } catch (NumberFormatException | ArithmeticException | InputMismatchException e) {
            System.out.println(e);
        }
    }


}
