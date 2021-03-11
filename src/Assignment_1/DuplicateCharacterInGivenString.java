package Assignment_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This class a method that count number duplicate character
 */
public class DuplicateCharacterInGivenString {


    /**
     * This method takes a string and count number of duplicate character in a given string,
     * It iterate through each character and if it contains in a Set then it increment by 1 the count variable otherwise it add current character to set
     * @param str
     * @return It return count variable.
     */
    public static int countCharacter(String str) {
        int count = 0;
        Set<Character> set = new HashSet<Character>();

        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (set.contains(ch)) count++;
            else set.add(ch);
        }

        return count;
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countCharacter(s));

    }
}
