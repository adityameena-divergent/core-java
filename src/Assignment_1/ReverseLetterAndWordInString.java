package Assignment_1;

import java.util.Scanner;

/**
 * This class has two method 1 is public and another one private helper method,
 * The public method reverse() takes a string and reverse each word as well as each character in  each word in string.
 */
public class ReverseLetterAndWordInString {

    /**
     * This method is helper method,
     * It Takes a input string return the reverse character of that word,
     * First it convert the input string into character array,
     * Then we take two variable for first index and last index,
     * Then we take a while loop,
     * It swap the character between left index and right index and increment left index & decrement right index,
     * It will repeat above steps while left index is less than right index.
     * @param str
     * @return After reverse the character array, It convert into string and return it.
     */
    private static String reverseWord(String str) {
        int leftIdx = 0;
        int rightIdx = str.length() - 1;

        char ch[] = str.toCharArray();

        while(leftIdx < rightIdx) {
            char temp = ch[leftIdx];
            ch[leftIdx] = ch[rightIdx];
            ch[rightIdx] = temp;
            leftIdx++;
            rightIdx--;
        }
        return String.valueOf(ch);
    }

    /**
     * It takes the input string with space separated words,
     * First it split the string by space,
     * then reverse each word using above helper method and also reverse each word in array of string,
     * Then concate it in new string with space separated words,
     * @param str
     * @return After concatenation return the string.
     */
    public static String reverse(String str) {

        String strArray[] = str.split(" ");

//        reversing character in a word
        for(int i = 0; i < strArray.length; i++) {
            strArray[i] = reverseWord(strArray[i]);
        }

        int leftIdx = 0;
        int rightIdx = strArray.length - 1;
//      reversing string array
        while (leftIdx < rightIdx) {
            String temp = strArray[leftIdx];
            strArray[leftIdx] = strArray[rightIdx];
            strArray[rightIdx] = temp;
            leftIdx++;
            rightIdx--;
        }

        String newStr = "";

        for(int i = 0; i < strArray.length; i++) {
            newStr = newStr + strArray[i] + " ";
        }
        return newStr;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s));

    }

}
