package com.company;
import java.lang.*;
import java.time.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(java.time.LocalTime.now());
//       System.out.println(LocalDateTime.now().getHour());
//       System.out.println(LocalDateTime.now().getMinute());

        Time s=new Time(java.lang.System.currentTimeMillis());
        s.setTime(555550000);
        System.out.println(s.getHour() +" "+ s.getMinute()+" "+s.getSecond());

    }

}
