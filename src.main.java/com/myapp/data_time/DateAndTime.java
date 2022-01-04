package com.myapp.data_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class DateAndTime {

	/**
	 * LocalDate, LocalTime, LocalDateTime, Instant, Duration, and Period.
	 */
	LocalDate date = LocalDate.of(2014, 3, 23);

	public void localDateExample() {
		int year = date.getYear();
		Month month = date.getMonth();
		int day = date.getDayOfMonth();
		DayOfWeek dow = date.getDayOfWeek();
		int len = date.lengthOfMonth();
		boolean leap = date.isLeapYear();

		/**
		 * It’s also possible to obtains the current date from the system clock using
		 * the now factory method:
		 */
		LocalDate today = LocalDate.now();
		// Getting date and time by parsing String
		LocalDate date = LocalDate.parse("2014-03-18");
		LocalTime time = LocalTime.parse("13:45:20");
	}

	// Reading LocalDate values using a TemporalField
	public void localDateValue() {

		int year = date.get(ChronoField.YEAR);
		int month = date.get(ChronoField.MONTH_OF_YEAR);
		int day = date.get(ChronoField.DAY_OF_MONTH);
	}

	// Creating a LocalTime and reading its values
	public void localTimeValue() {

		LocalTime time = LocalTime.of(13, 45, 20);
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
	}

}
