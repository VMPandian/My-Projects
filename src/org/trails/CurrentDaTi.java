package org.trails;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class CurrentDaTi {
	public static void main(String[] args) {
		SimpleDateFormat cdt = new SimpleDateFormat("dd/MM/yy h:mm:ss.SSS a");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("IST")));
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
		
		System.out.format("NOW = %tc", System.currentTimeMillis());
	}	         
} 

