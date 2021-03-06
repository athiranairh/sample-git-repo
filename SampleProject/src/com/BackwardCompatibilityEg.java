package com;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import java.util.Date;

import java.time.Instant;
import java.time.ZoneId;

public class BackwardCompatibilityEg {
   public static void main(String args[]){
      BackwardCompatibilityEg java8tester = new BackwardCompatibilityEg();
      java8tester.testBackwardCompatability();
   }
	
   public void testBackwardCompatability(){
	
      //Get the current date
      Date currentDate = new Date();
      System.out.println("Current date: " + currentDate);
      System.out.println("arun local date");
      System.out.println("testing");
      System.out.println("testing2");
		
      //Get the instant of current date in terms of milliseconds
      Instant now = currentDate.toInstant();
      ZoneId currentZone = ZoneId.systemDefault();
		
      LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
      System.out.println("Local date: " + localDateTime);
		
      ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
      System.out.println("Zoned date: " + zonedDateTime);
   }
}
