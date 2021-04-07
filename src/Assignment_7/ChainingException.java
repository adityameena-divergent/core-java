package Assignment_7;

import java.util.Scanner;
import java.util.logging.Logger;

public class ChainingException {
    public static void main(String[] args) {

        chaining();

    }

    public static void chaining() {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(10/n);
        } catch (ArithmeticException e) {
            ArithmeticException ee = new ArithmeticException("Invalid Input");
            ee.initCause(e);
            throw ee;
        }
    }

//    public static void logger() {
//        try {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            System.out.println(10/n);
//        } catch (ArithmeticException e) {
////            Logger.
//        }
//    }
}
