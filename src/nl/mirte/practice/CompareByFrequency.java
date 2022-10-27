package nl.mirte.practice;

import java.util.Comparator;
import java.util.Map;

public class CompareByFrequency implements Comparator<Map.Entry<String, Integer>> {

    public int compare(Map.Entry<String, Integer> object1
            , Map.Entry<String, Integer> object2) {
        int c1 = object1.getValue().intValue();
        int c2 = object2.getValue().intValue();
        if (c1 < c2) {
            return -1;

        } else if (c1 > c2) {
            return 1;

        } else { // If counts are equal, compare keys alphabetically.
            return obj1.getKey().compareTo(obj2.getKey());
        }
    }


    private Comparator<Map.Entry<String, Integer>> wfListSorted = new CompareByFrequency();



}
