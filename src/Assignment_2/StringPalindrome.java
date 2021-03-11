package Assignment_2;

import java.util.Scanner;

/**
 * This class has a method `palindrom()`
 */
public class StringPalindrome {

    /**
     * This method takes a string and then reverse it,
     * Then it compare both input string and reversed string
     * @param s input string
     * @return It return true if input string is equal to reversed string, otherwise it return false.
     */
    public static boolean palindrome(String s) {

        char ch[] = s.toCharArray();

        int leftIdx = 0;
        int rightIdx = ch.length - 1;

        while(leftIdx < rightIdx) {
            char temp = ch[leftIdx];
            ch[leftIdx] = ch[rightIdx];
            ch[rightIdx] = temp;
            leftIdx++;
            rightIdx--;
        }

        return s.equals(String.valueOf(ch));
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(palindrome(s));

    }

}
