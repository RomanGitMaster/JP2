package JP2;

public class Tsk7 {
    /***
     * Count the Number of Words in a String: Write a function to count the number of words
     * in a given string. Words are separated by spaces or punctuation. For example, the input
     * "Hello, world!" should return 2.
     */

    public static int wordsCount(String str) {
        if (str == null || str.isBlank()) return 0;
        String[] strings = str.trim().split("[a-zA-Z]+");

        return strings.length;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(wordsCount(str));

    }
}
