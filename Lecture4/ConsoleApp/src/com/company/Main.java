package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Date standartDate = new Date(2015, 6, 13);
        Time standartTime = new Time(16, 20, 0);
        File file = new File("");
        try {
            FileOutputStream s = new FileOutputStream(file);
            FileInputStream anotherStream = new FileInputStream(file);
            Scanner scanner = new Scanner(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
