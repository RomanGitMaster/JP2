package JP2;

public class Tsk4 {
    /***
     * Check if a String is Palindrome: Determine whether a given string is a palindrome,
     * which means it reads the same forwards and backward. For example, "madam" is a
     * palindrome.
     */
    public static boolean isPolindrome(String str) {
        if (str == null || str.isBlank()) return false;
        str = str.replace(" ", "").toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        return reversed.equals(str);
    }

    public static void main(String[] args) {
        String string = "madam";
        System.out.println(isPolindrome(string));
    }
}
