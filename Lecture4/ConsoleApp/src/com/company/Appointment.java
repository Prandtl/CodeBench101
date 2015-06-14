package com.company;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Vasiliy on 6/13/2015.
 */
public class Appointment extends Event {

    public Appointment(Date date,Time time, String message) {
        super(date, message);
        this.time = time;
    }

    @Override
    public String getMessage() {
        return getDate().toString()+" time is "+time.toString()+" : "+super.getMessage();
    }

    private Time time;
}
