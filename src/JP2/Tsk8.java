package JP2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Tsk8 {
//You have a list of strings and you want to keep only those that start with “A” and you
//want to return them in lower case".

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Collections.addAll(list, "Abrakadabra", "Pabramabra", "Alabra", "tatarabra", "Akabra");
        list.removeIf(s->!s.startsWith("A"));

        for (int i = 0; i < list.size() ; i++) {
            list.set(i, list.get(i).toLowerCase() );
        }

        System.out.println(list);

    }
}
