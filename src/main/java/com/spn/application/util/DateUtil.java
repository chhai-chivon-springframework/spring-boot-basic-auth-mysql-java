package com.spn.application.util;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Chhai Chivon on 07-May-18
 */
public class DateUtil {

    private DateUtil(){}

    public static Date getToday(){
        return Calendar.getInstance().getTime();
    }

}
