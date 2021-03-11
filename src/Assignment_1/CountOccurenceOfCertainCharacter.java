package Assignment_1;


import java.util.HashMap;
import java.util.Scanner;

/**
 * This class has a method that count number of certain character in a given string
 */
public class CountOccurenceOfCertainCharacter {


    /**
     * This method takes a String and count number of certain character in a string,
     * In this method, it iterate each character in a string and then add the character as key in a HashMap and number of character occurs as value.
     * @param str @inputString
     * @return It returns the HashMap that contains number of character occurence.
     */
    public static HashMap<Character, Integer> countOccurence(String str) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(countOccurence(s));

    }

}

