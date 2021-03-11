package Assignment_2;

import java.util.Scanner;

/**
 * This class has a method `countOccurenceOfGivenString()`
 */
public class OccurenceOfGivenStringInAnotherGivenString {

    /**
     * This method takes two string as parameter s1 & s2 return the number of occurence s2 string in s1 string
     * @param s1 input string 1
     * @param s2 input string 2
     * @return count number of s2 in s1.
     */
    public static int countOccurenceOfGivenString(String s1, String s2) {

        int count = 0;

        for(int i = 0; i <= s1.length() - s2.length(); i++) {
            String temp = s1.substring(i, i + s2.length());
            if(temp.equals(s2))
                count++;
        }
        return count;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(countOccurenceOfGivenString(s1, s2));
    }

}
