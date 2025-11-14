package chapter01;

import java.util.ArrayList;
import java.util.List;

public class Lists_1 {
    public static <T> List<T> toList(T[] arr) {
        List<T> list = new ArrayList<T>();
        for (T elt : arr) list.add(elt);
        return list;
    }
}
