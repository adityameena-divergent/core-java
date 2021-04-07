package Assignment_7;

import java.util.Scanner;

public class FinallyClause {
    public static void main(String[] args) {

        add();

    }

    public static void add() {
        Scanner sc = null;
        try{
            sc = new Scanner(System.in);

            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x + y);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if(sc != null) {
                sc.close(); // Closing Scanner
            }
        }
    }


}
