package com.company;

import sun.misc.Queue;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] stringVersion = new String[]{
                "11111",
                "10101",
                "10101",
                "10001",
                "11111"};
        Cell[][] lab = labyrinthCreator(stringVersion);
    }

    static Cell[][] labyrinthCreator(String[] stringVersion) {
        ArrayList<Cell[]> workInProgress = new ArrayList<Cell[]>();
        for (String string : stringVersion) {
            ArrayList<Cell> row = new ArrayList<Cell>();
            for (int i = 0; i < string.length(); i++) {
                row.add(string.charAt(i) == '0' ?
                        new FreeCell() :
                        new Wall());
            }
            workInProgress.add(row.toArray(new Cell[row.size()]));
        }
        return workInProgress.toArray(new Cell[workInProgress.size()][]);
    }

    static List<PointWithParent> getPath(PointWithParent a,PointWithParent b,Cell[][] labirynth) throws IllegalArgumentException, InterruptedException {
        if(a.getX()<0||a.getY()<0||b.getX()<0||b.getY()<0)
        {
            throw new IllegalArgumentException("bad coordinates");
        }
        int width = labirynth[0].length;
        int height = labirynth.length;
        if(a.getX()>=width||a.getY()>=height||b.getX()>=width||b.getY()>=height)
        {
            throw new IllegalArgumentException("bad coordinates");
        }

        Queue<PointWithParent> queue = new Queue<PointWithParent>();

        queue.enqueue(a);
        while(true)
        {
            PointWithParent element = queue.dequeue();
            for(int i=-1;i<2;i++)
            {
                for(int j=-1;i<2;i++)
                {

                }
            }
        }
    }
}
