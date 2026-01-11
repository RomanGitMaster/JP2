package JP2;

public class Tsk9 {
    /***
     * Find the First Non-Repeating Character in a String: Given a string, find and return the
     * first non-repeating character. For example, in the string "abracadabra", the first
     * non-repeating character is 'c'.
     */
    public static void firstNonRepeatingChar(String string) {
        for (int i = 0; i < string.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < string.length(); j++) {
                if (i != j && string.charAt(i) == string.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                System.out.println("The first non-repeating character is " + string.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }

    public static void main(String[] args) {
        String string = "abradadabra";
        firstNonRepeatingChar(string);

    }
}