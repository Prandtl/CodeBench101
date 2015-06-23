package com.company;

import java.awt.geom.Point2D;

/**
 * Created by Vasiliy on 6/23/2015.
 */
public class PointWithParent  {
    private int x;
    private int y;
    private PointWithParent parent;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public PointWithParent(PointWithParent parent){
        this.parent = parent;
    }

    public PointWithParent getParent() {
        return parent;
    }
}
