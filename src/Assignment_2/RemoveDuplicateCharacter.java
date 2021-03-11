package Assignment_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This class has a method `removeDuplicate()`
 */
public class RemoveDuplicateCharacter {


    /**
     * THis method takes a string and remove duplicate characters
     * @param str input string
     * @return string with unique character
     */
    public static String removeDuplicate(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        Set<Character> set = new HashSet<>();

        for(int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (set.contains(ch)) {
                list.remove(i);
            } else {
                set.add(ch);
            }
        }

        char ch[] = new char[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ch[i] = list.get(i);
        }

        return String.valueOf(ch);
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(removeDuplicate(s));
    }

}
