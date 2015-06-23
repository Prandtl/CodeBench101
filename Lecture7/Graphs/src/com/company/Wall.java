package com.company;

/**
 * Created by Vasiliy on 6/20/2015.
 */
public class Wall implements Cell {
    @Override
    public boolean isFree() {
        return false;
    }
}
