package com.example.algamoney.api.security.util;

import java.util.Date;

public class GeradorDate {

	public static void main(String[] args) {
		// My clock 2020-11-07, 15:10:00 (BRST)
		Date date = new Date();  // 2020-11-07:16:10:00 	
		
		System.out.println("Data do sistema: " + date);
		
		int myTimeZone = 1; // my timeZone 
		// my timeZone = 1h = 1 * 60 * 60 * 1000 (millisecond);
		// 2020-11-07:16:10:00 = x (milliseconds)
		// finally, time in milliseconds (BRST-1) = x - myTimezone 
		
		date.setTime( date.getTime() - myTimeZone * 60 * 60 * 1000 );
		// date.toISOString() = 2020-11-07, 15:10:00 (BRST-1)
		
		System.out.println("Data do sistema modificada com time zone: " + date);
		
	}

}
