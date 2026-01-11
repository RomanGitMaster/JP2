package JP2;

public class Tsk2 {
    //Find out how many alpha characters are present in a string?

    public static int stringAlphaCharCount(String str) {
        if (str == null) return 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    /*public static int stringAlphaCharCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).matches("[A-Za-z]")) {
                count++;
            }
        }
        return count;
    }
*/
    public static void main(String[] args) {
        String string = null;
        System.out.println(stringAlphaCharCount(string));
    }
}
