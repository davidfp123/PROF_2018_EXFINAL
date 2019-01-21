package es.upm.grise.profundizacion2018.examenFinal;

import java.util.Calendar;

public class MyCalendar {

    private Calendar calendar;

    public MyCalendar(){
        Calendar calendar = Calendar.getInstance();
    }

    public int getHour(){
      return calendar.get(Calendar.HOUR_OF_DAY );
    };
}