package Assignment_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * This class has a single method `MostAppearancesCharacterInGivenString()`.
 */
public class MostAppearancesCharacterInGivenString {

    /**
     * This method takes a string and return the most appearance character.
     * First it will takes a empty Map,
     * Then, It will iterate through each character of input string,
     * It will the put the character as key and 1 as value in Map if that character is not contains that character key,
     * Otherwise, it increment the value of that key by 1.
     * Finally, it will return the character key from  Map that has max value, otherwise return null if string is empty.
     * @param str
     * @return
     */
    public static char mostAppearanceCharacter(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int max = 0;
        char maxChar = ' ';

        Iterator itr = map.entrySet().iterator();

        while(itr.hasNext()) {
            Map.Entry entry = (Map.Entry)itr.next();

            char currKey = (char)entry.getKey();
            int currValue = (int)entry.getValue();

            if (currValue > max) {
                max = currValue;
                maxChar = currKey;
            }
        }

        return maxChar;

    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(mostAppearanceCharacter(s));

    }

}
