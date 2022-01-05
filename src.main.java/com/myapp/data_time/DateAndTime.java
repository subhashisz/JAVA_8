package com.myapp.data_time;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.TimeZone;

public class DateAndTime {

	/**
	 * LocalDate, LocalTime, LocalDateTime, Instant, Duration, and Period.
	 */
	LocalDate date = LocalDate.of(2014, 3, 23);
	LocalTime time = LocalTime.of(14, 23);

	LocalTime time1 = LocalTime.of(14, 23);
	LocalTime time2 = LocalTime.of(14, 23);

	LocalDateTime dateTime1 = LocalDateTime.of(date, time);
	LocalDateTime dateTime2 = LocalDateTime.of(date, time);

	Instant instant1 = Instant.ofEpochSecond(3);
	Instant instant2 = Instant.ofEpochSecond(3);

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

	// Creating a LocalDateTime directly or by combining a date and a time

	public void localDateTimeExample() {
		// 2014-03-18T13:45:20
		LocalDateTime dt1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
		LocalDateTime dt2 = LocalDateTime.of(date, time);
		LocalDateTime dt3 = date.atTime(13, 45, 20);
		LocalDateTime dt4 = date.atTime(time);
		LocalDateTime dt5 = time.atDate(date);
	}

	public void epochtime() {
		/**
		 * Instant is intended for use only by a machine. It consists of a number of
		 * seconds and nanoseconds. As a consequence, it doesn’t provide any ability to
		 * handle units of time that are meaningful to humans.
		 */
		Instant.ofEpochSecond(3);
		int day = Instant.now().get(ChronoField.DAY_OF_MONTH);
		/**
		 * will just throw an exception like
		 * java.time.temporal.UnsupportedTemporalTypeException: Unsupported field:
		 * DayOfMonth
		 */
	}

	public void durationExample() {
		Duration d1 = Duration.between(time1, time2);
		Duration d2 = Duration.between(dateTime1, dateTime2);
		Duration d3 = Duration.between(instant1, instant2);
	}

	public void periodExample() {
		Period tenDays = Period.between(LocalDate.of(2014, 3, 8), LocalDate.of(2014, 3, 18));
	}

	// Creating Durations and Periods

	public void durationAndPeriod() {
		Duration threeMinutes = Duration.ofMinutes(3);
		Duration threeMinutes1 = Duration.of(3, ChronoUnit.MINUTES);
		Period tenDays = Period.ofDays(10);
		Period threeWeeks = Period.ofWeeks(3);
		Period twoYearsSixMonthsOneDay = Period.of(2, 6, 1);
	}

	// Building a DateTimeFormatter

	public void dateTimeFormater() {
		DateTimeFormatter italianFormatter = new DateTimeFormatterBuilder().appendText(ChronoField.DAY_OF_MONTH)
				.appendLiteral(". ").appendText(ChronoField.MONTH_OF_YEAR).appendLiteral(" ")
				.appendText(ChronoField.YEAR).parseCaseInsensitive().toFormatter(Locale.ITALIAN);
	}

	// Zone

	public void zoneExample() {
		ZoneId romeZone = ZoneId.of("Europe/Rome");
		ZoneId zoneId = TimeZone.getDefault().toZoneId();
	}

	// Applying a time zone to a point in time

	public void timeZonePoint() {
		ZoneId romeZone = ZoneId.of("Europe/Rome");
		LocalDate date = LocalDate.of(2014, Month.MARCH, 18);
		ZonedDateTime zdt1 = date.atStartOfDay(romeZone);
		LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
		ZonedDateTime zdt2 = dateTime.atZone(romeZone);
		Instant instant = Instant.now();
		ZonedDateTime zdt3 = instant.atZone(romeZone);
	}

	public void timeZonePointOtherApprocah() {
		ZoneId romeZone = ZoneId.of("Europe/Rome");
		Instant instant = Instant.now();
		LocalDateTime timeFromInstant = LocalDateTime.ofInstant(instant, romeZone);
	}
	
	

}
