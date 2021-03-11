package Assignment_1;

import java.util.*;

/**
 * This class has a method that return first non repeated character.
 */
public class FirstNonRepeatedCharacter {


    /**
     * This method iterate through each character, it remove the character if it is present in a List and add it in Set,
     * Then if above condition fail then it check the current character in a Set if it is not present in a List then it will append the character in List
     * @param str
     * @return It return first character in List if List is not empty, otherwise it return null.
     */
    public static char nonRepeatedCharacter(String str) {

        List<Character> list = new ArrayList<>();
        Set<Character> repeated = new HashSet<>();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (list.contains(ch)) {
                list.remove(list.indexOf(ch));
                repeated.add(ch);
            } else if (!repeated.contains(ch)) {
                list.add(ch);
            }
        }
        return list.get(0);
    }

    public static void main(String agrs[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(nonRepeatedCharacter(s));

    }
}
