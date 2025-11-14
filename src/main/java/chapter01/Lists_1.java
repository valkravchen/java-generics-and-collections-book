package chapter01;

import java.util.ArrayList;
import java.util.List;

public class Lists_1 {
    public static <T> List<T> toList(T[] arr) {
        List<T> list = new ArrayList<T>();
        for (T elt : arr) list.add(elt);
        return list;
    }

    static void main() {
        List<Integer> ints = Lists_1.toList(new Integer[]{1, 2, 3});
        List<String> words = Lists_1.toList(new String[]{"Hello", "world!"});
    }
}
