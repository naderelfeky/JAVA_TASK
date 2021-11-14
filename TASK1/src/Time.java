package com.company;
import java.lang.*;
import java.time.*;


public class Time {
    private long hour;
    private long minute;
    private long second;
    public Time(){                                 // constructor for set the current time

        second = LocalDateTime.now().getSecond();  //to set value of second with current second

        minute = LocalDateTime.now().getMinute();  //to set value of minute with current minute

        hour= LocalDateTime.now().getHour();        //to set value of hour with current hour

    }
    public Time(long timeInMilliSecond){
        timeInMilliSecond/=1000;                     //to convert timeInMilliSecond form milli_second to second

        second=timeInMilliSecond%(60);               //to cal second

        timeInMilliSecond/=(60);                     //to convert timeInMilliSecond form second to minute

        minute=timeInMilliSecond%(60);               //to cal second

        timeInMilliSecond/=(60);                     //to convert timeInMilliSecond form  minute to hour

        hour=timeInMilliSecond%24;                   //to cal hour
    }

    public Time(long hour,long minute, long second ){ //constructor with three attribute(hour ,minute,second)

      this.second=second;                          //to set second(fields class) equal parameter value

      this.minute=minute;                          //to set minute(fields class) equal parameter value

      this.hour=hour;                              //to set hour(fields class) equal parameter value
    }

    public long getHour(){
        return hour;
    }


    public long getMinute() {
        return minute;
    }


    public long getSecond() {
        return second;
    }


    public void setTime(long elapseTime){         // method that sets a new time for the object using the elapsed time
        elapseTime/=1000;                     //to convert elapseTime form milli_second to second

        second=elapseTime%(60);               //to cal second

        elapseTime/=(60);                     //to convert elapseTime form second to minute

        minute=elapseTime%(60);               //to cal second

        elapseTime/=(60);                     //to convert elapseTime form  minute to hour

        hour=elapseTime%24;                   //to cal hour
    }


}
