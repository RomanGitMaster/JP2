package JP2;

public class Tsk1 {
    //Write a program to swap 2 String without a temporary variable?
    public static String[] swapStrings(String str1, String str2) {
        return new String[]{str2, str1};
    }

    public static void main(String[] args) {
        String string1 = "String1";
        String string2 = "String2";
        System.out.println("Before: " + string1 + " " + string2);

       /* string1 = string1.concat(string2);
        string2 = string1.substring(0, string2.length());
        string1 = string1.substring(string2.length());

        System.out.println("After: " + string1 + " " + string2);
*/
        String[] swapped = swapStrings(string1, string2);
        string1= swapped[0];
        string2=swapped[1];
        System.out.println("After: " + string1 + " " + string2);


    }
}
