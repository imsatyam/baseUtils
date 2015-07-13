package com.satyam.app.util.base.lang;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * Provides utility methods for date
 * @author Satyam Shandilya
 *
 */
public abstract class DateUtil {
	
	/**
	 * Converts a date into String.
	 * @param date date to be formatted
	 * @param formatter Default formatter if any
	 * @return
	 */
	public static String dateToString(LocalDate date, DateTimeFormatter formatter){
		
		Assert.notNull(date);
		Assert.notNull(formatter);
		
		return date.format(formatter);
	}
	
	/**
	 * Formats the LocalDateTime object into String
	 * @param dateTime
	 * @param formatter
	 * @return
	 */
	public static String dateToString(LocalDateTime dateTime, DateTimeFormatter formatter){
		
		Assert.notNull(dateTime);
		Assert.notNull(formatter);
		
		return dateTime.format(formatter);
	}
	
	/**
	 * Format date to string using a date format
	 * @param date	
	 * @param dateFormat
	 * @return
	 */
	public static String dateToString(LocalDate date, String dateFormat){
		
		Assert.notNull(date);
		Assert.hasLength(dateFormat);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
		return date.format(formatter);
	}
	
	/**
	 * Format date-time to string using a date format
	 * @param date	
	 * @param dateFormat
	 * @return
	 */
	public static String dateToString(LocalDateTime dateTime, String dateFormat){
		
		Assert.notNull(dateTime);
		Assert.hasLength(dateFormat);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
		return dateTime.format(formatter);
	}
	
	
	/**
	 * String to Date utility
	 * @param dateString
	 * @param formatter
	 * @return
	 */
	public static LocalDate stringToDate(String dateString, DateTimeFormatter formatter){
		
		Assert.notNull(formatter);
		Assert.hasLength(dateString);
		
		return LocalDate.parse(dateString, formatter);
		
	}
	
	/**
	 * String to Date-time utility
	 * @param dateString
	 * @param formatter
	 * @return
	 */
	public static LocalDateTime stringToDateTime(String dateString, DateTimeFormatter formatter){
		
		Assert.notNull(formatter);
		Assert.hasLength(dateString);
		
		return LocalDateTime.parse(dateString, formatter);
		
	}
	
	/**
	 * String to Date utility
	 * @param dateString
	 * @param pattern
	 * @return
	 */
	public static LocalDate stringToDate(String dateString, String pattern){
		
		Assert.hasLength(pattern);
		Assert.hasLength(dateString);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);		
		return LocalDate.parse(dateString, formatter);
		
	}
	
	/**
	 * String to Date-time utility
	 * @param dateString
	 * @param formatter
	 * @return
	 */
	public static LocalDateTime stringToDateTime(String dateString, String pattern){
		
		Assert.hasLength(pattern);
		Assert.hasLength(dateString);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);		
		return LocalDateTime.parse(dateString, formatter);
		
	}

}
