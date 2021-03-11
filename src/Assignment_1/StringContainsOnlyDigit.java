package Assignment_1;

import java.util.Scanner;

/**
 * This class has a method StringContainsOnlyDigit() that check if input string contains only digit.
 */
public class StringContainsOnlyDigit {


    /**
     * This method return true if string contains only numeric digit otherwise it return false.
     * First, it will iterate through each character in a string then it check if the ASCII value of character is not between 48 and 57 then it will return false otherwise true.
     * @param str
     * @return
     */
    public static boolean checkString(String str) {

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch < 48 || ch > 57) return false;
        }
        return true;
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkString(s));

    }
}
