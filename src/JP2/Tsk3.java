package JP2;

public class Tsk3 {
    //Reverse a String: Write a function to reverse a given string. For example, given the
    //input "Hello", the output should be "olleH".

    public static String stringCustomReverse(String str) {
        if (str == null) return null;
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static String stringCustomReverse2(String str) {
        if (str == null) return null;
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str2;
    }

    public static void main(String[] args) {
        String str = "Hello";
        str=stringCustomReverse2(str);
        System.out.println(str);
    }

}


