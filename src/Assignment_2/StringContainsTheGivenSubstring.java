package Assignment_2;

import java.util.Scanner;

/**
 * This class a method `StringContainsTheGivenSubstring()`
 */
public class StringContainsTheGivenSubstring {

    /**
     * This method takes two string str and substr,
     * It checks the substr is present in str.
     * @param str
     * @param substr
     * @return It return true if substring present in string otherwise it return false.
     */
    public static boolean checkSubstring(String str, String substr) {

        for(int i = 0; i <= str.length() - substr.length(); i++) {

            String temp = str.substring(i, i + substr.length());
            if(temp.equals(substr))
                return true;
        }
        return false;
    }



    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine(); // string
        String s2 = sc.nextLine(); // substring

        System.out.println(checkSubstring(s1, s2));

    }

}
