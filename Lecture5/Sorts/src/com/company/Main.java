package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        comparer = new LexicographicalComparer();
        String[] strings = new String[]{"abracadabra",
                "abracadabrabra",
                "John",
                "Yoko",
                "john",
                "bananas",
                "bananas"
        };
        String[] result = bubbleSort(strings);
    }

    public static void compareStrings(String a, String b) {
        int result = comparer.Compare(a, b);
        if (result < 0) {
            System.out.println(a + " is bigger than " + b);
        } else {
            if (result == 0) {
                System.out.println(a + " equals to " + b);
            } else {
                System.out.println(a + " is smaller than " + b);
            }
        }
    }

    static Comparer comparer;

    static String[] bubbleSort(String[] input) {
        String[] array = input.clone();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (comparer.Compare(array[j], array[j + 1]) > 0) {
                    String t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        return array;
    }
}
