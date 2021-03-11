package Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This has two methods `sortString()` & `checkAnagram()`
 */
public class TwoStringAnagram {

    /**
     * This method is helper method for sorting the string
     * It takes input string and then sort it using Arrays class sort method
     * @param str
     * @return It return sorted string.
     */
    private static String sortString(String str) {
        char ch[] = str.toLowerCase().toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch).trim();
    }

    /**
     * This method takes two string and compare both the string that it is anagram or not
     * @param s1
     * @param s2
     * @return return true if it is anagram otherwise return false.
     */
    public static boolean checkAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        s1 = sortString(s1);
        s2 = sortString(s2);

        return s1.equals(s2);
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(checkAnagram(s1, s2));

    }

}
