package Assignment_1;

import java.util.Scanner;

/**
 * This class has a method that count Number of vowels and consonents.
 */
public class CountNumberOfVowelsAndConsonents {


    /**
     * This is a private method for checking if given character is vowel or not.
     * @param ch
     * @return return true if given character is vowel otherwise return false.
     */
    private static boolean checkVowel(char ch) {
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }

    /**
     * This is a private method for checking if given character is consonent or not.
     * @param ch
     * @return return true if given character is consonent otherwise return false, only if checkVowel() method return false in countVowelAndConsonents() method
     */
    private static boolean checkConsonent(char ch) {
        if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
            return true;
        return false;
    }

    /**
     * This method takes a string input and count number of vowels and consonents in given string.
     * @param str
     * @return it return string with number of vowels and consonents.
     */
    public static String countVowelAndConsonents(String str) {
        int vowels = 0;
        int consonents = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (checkVowel(ch))
                vowels++;
            else if (checkConsonent(ch))
                consonents++;
        }
        return "Vowel: " + vowels + ", Consonent: " + consonents;
    }



    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(countVowelAndConsonents(s));

    }
}

