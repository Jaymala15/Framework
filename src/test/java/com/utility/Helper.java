package com.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

    public String getCurrentDate()
    {
        DateFormat date = new SimpleDateFormat("MM_dd_yyyy HH:MM:SS");
        Date currentDate = new Date();
        return date.format(currentDate);
    }
}
