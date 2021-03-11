package Assignment_2;

import java.util.Scanner;

/**
 * This class has a method `SortArrayOfStringByLength()`
 */
public class SortArrayOfStringByLength {


    /**
     * This method takes a string array and sort it according to length of string
     * @param str @input string
     * @return It return sorted string array
     */
    public static String[] sortStringArray(String str[]) {

        for(int i = 0; i < str.length - 1; i++) {

            for(int j = i + 1; j < str.length; j++) {

                if(str[j].length() < str[i].length()) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        return str;
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
//        space saperated strings
        String s[] = sc.nextLine().split(" ");

        s = sortStringArray(s);

        for(String i : s) {
            System.out.println(i);
        }

    }

}
