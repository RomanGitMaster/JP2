package JP2;

public class Tsk6 {
    //Create a method to count how many vowels are present in a string “documentation”
    public static int vowelCounter(String str) {
        if (str == null) return 0;
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "documentation";
        System.out.println(vowelCounter(string));

    }
}
