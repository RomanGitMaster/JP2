package JP2;

import java.util.Arrays;

public class Tsk5 {
    /***
     * Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams,
     * meaning they contain the same characters in a different order. For example, "listen"
     * and "silent" are anagrams.
     */
    public static boolean isAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();
        if (str1.length() != str2.length()) return false;
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagrams(str1, str2));


    }
}
