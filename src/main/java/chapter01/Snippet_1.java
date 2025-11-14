package chapter01;

import java.util.ArrayList;
import java.util.List;

public class Snippet_1 {
    static void main() {
        List<String> words  = new ArrayList<String>();
        words.add("Hello ");
        words.add("world!");
        String s = words.get(0) + words.get(1);
        assert s.equals("Hello World!");
    }
}
