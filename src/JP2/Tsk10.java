package JP2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Tsk10 {
    //How can you remove all duplicates from ArrayList?

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Boba", "Popa", "Ropa", "Kopa", "Ropa");
        List<String> uniqueList = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(uniqueList);

    }
}
