package nl.mirte.practice;

import java.util.Comparator;
import java.util.Map;

public class CompareByFrequency implements Comparator<Map.Entry<String, MutableInteger>> {

    public int compare(Map.Entry<String, MutableInteger> obj1
            , Map.Entry<String, MutableInteger> obj2) {
        int c1 = obj1.getValue().intValue();
        int c2 = obj2.getValue().intValue();
        if (c1 < c2) {
            return -1;

        } else if (c1 > c2) {
            return 1;

        } else { // If counts are equal, compare keys alphabetically.
            return obj1.getKey().compareTo(obj2.getKey());
        }
    }

}
