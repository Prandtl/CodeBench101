package com.company;

/**
 * Created by Vasiliy on 6/16/2015.
 */
public class LexicographicalComparer implements Comparer {
    @Override
    public int Compare(String a, String b) {
        return a.compareTo(b);
    }
}
