package com.company;

import java.util.Date;

/**
 * Created by Vasiliy on 6/13/2015.
 */
public class FunkyAppointment extends Event {
    public FunkyAppointment(int day, int month, int year, int hour, int min) {
        super(new Date(day, month,year),"");
    }

}
