package Assignment_2;

import java.util.Scanner;

/**
 * This class has a method that concate same string in given number of time.
 */
public class ConcatenatesTheSameStringGivenNumberOfTimes {

    /**
     * This takes a input string and an interger,
     * First it will create a empty string and then append the input string in given number of times.
     * @param str input string
     * @param n integer number
     * @return It return string after concatenation.
     */
    public static String concatenateString(String str, int n) {
        String s = "";
        for(int i = 1; i <= n; i++) {
            s += str;
        }
        return s;
    }



    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String s = sc.nextLine();

        System.out.println(concatenateString(s, n));
    }

}
