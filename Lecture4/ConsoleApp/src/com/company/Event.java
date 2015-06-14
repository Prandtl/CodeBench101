package com.company;

import java.util.Date;

/**
 * Created by Vasiliy on 6/13/2015.
 */
public class Event implements IEvent {
    public Event(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public String getMessage() {
        return date.toGMTString() + ": " + message;
    }

    public String getRawMessage()
    {
        return message;
    }

    private Date date;
    private String message;
}
