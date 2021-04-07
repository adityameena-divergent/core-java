package Assignment_7;

import java.util.Scanner;

public class TryWithResourceHandler {
    public static void main(String[] args) {

        add();
    }

    /**
     * Creating object in try
     */
    public static void add() {
        try(Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x+y);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Passing object in try
     */
    public static void addTwoNumber() {
        Scanner sc = new Scanner(System.in);
        try(sc) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x+y);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
