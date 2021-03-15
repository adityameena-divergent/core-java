package Assignment_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PermutationOfString {

    static Set<String> set = new HashSet<>();

    /**
     * It is a helper method that swap the character
     * @param s input string
     * @param x int index 1
     * @param y int index 2
     * @return string after swapping the character
     */
    private static String swapChar(String s, int x, int y) {
        char ch[] = s.toCharArray();
        char temp = ch[x];
        ch[x] = ch[y];
        ch[y] = temp;

        return String.valueOf(ch);
    }


    /**
     * It is a recursive method that takes a string with left most index & right most index of string,
     * It print all permutation of given string
     * @param s input string
     * @param leftIdx left index
     * @param rightIdx right index
     */
    public static void permutation(String s, int leftIdx, int rightIdx) {
        if (leftIdx == rightIdx) {
            if (set.contains(s))
                return;
            set.add(s);
            System.out.println(s);
            return;
        }

        for(int i = leftIdx; i <= rightIdx; i++) {
            s = swapChar(s, leftIdx, i);
            permutation(s, leftIdx + 1, rightIdx);
            s = swapChar(s, leftIdx, i);
        }

    }


    /**
     * It is iterative method that print all permutation of given string
     * @param str @input string
     */
    public static void permutationItr(String str) {

        for(int i = 0; i < str.length() - 1; i++) {

            for(int j = 0; j < str.length(); j++) {

                str = swapChar(str, i, j);
                System.out.println(str);
                str = swapChar(str, i, j);

            }
        }
    }



    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        permutation(s, 0, s.length() - 1);

        permutationItr(s);

    }
}
