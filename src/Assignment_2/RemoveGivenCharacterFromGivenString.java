package Assignment_2;

import java.util.Scanner;

/**
 * This class has a method `RemoveGivenCharacterFromGivenString()`
 */
public class RemoveGivenCharacterFromGivenString {

    /**
     * This method takes two input string & character,
     * It removes the given character from  given string
     * @param str input string
     * @param ch input character
     * @return It return string after remove the character.
     */
    public static String removeGivenCharacter(String str, char ch) {

        String s = "";
        char c[] = str.toCharArray();

        for(int i = 0; i < str.length(); i++) {
            if (c[i] == ch) {
                continue;
            } else {
                s += c[i];
            }
        }
        return s;
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        char c = sc.nextLine().charAt(0);
        String s = sc.nextLine();

        System.out.println(removeGivenCharacter(s, c));

    }

}
