package com.company;

import sun.util.calendar.BaseCalendar;

import java.util.Date;

/**
 * Created by Vasiliy on 6/13/2015.
 */
public interface IEvent extends ICalendarNotification {
    Date getDate();
}
