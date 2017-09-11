package top.dandan0214.booksite.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class DateUtils {
	public static LocalDate convertDateToLocalDate(Date date){
		
	    Instant instant = date.toInstant();
	    ZoneId zone = ZoneId.systemDefault();
	    LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
	    LocalDate localDate = localDateTime.toLocalDate();
	    return localDate;
	}
	
	public static LocalDateTime convertDateToLocalDateTime(Date date){
		
	    Instant instant = date.toInstant();
	    ZoneId zone = ZoneId.systemDefault();
	    LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
	    
	    return localDateTime;
	}
	
	public static Date formatDate(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		String sDate = simpleDateFormat.format(date);  
		try {
			return simpleDateFormat.parse(sDate);
		} catch (ParseException e) {
			e.printStackTrace();
			return date;
		}
		  
	}
	
	public static Date convertLocalDateTimeToDate(LocalDateTime localDateTime) {
		ZoneId zone = ZoneId.systemDefault();
		Instant instant = localDateTime.atZone(zone).toInstant();
		Date date = Date.from(instant);
		return date;
	}
	
	public static Date convertLocalDateToDate(LocalDate localDate) {
		 ZoneId zone = ZoneId.systemDefault();
		 Instant instant = localDate.atStartOfDay().atZone(zone).toInstant();
		 Date date = Date.from(instant);
		return date;
	}

	public static Date getFirstOfMonthDate(LocalDate date) {
		Month month = date.getMonth();
		int year = date.getYear();
		LocalDate first = LocalDate.of(year, month, 1);
		return convertLocalDateToDate(first);
	}

	public static Date getEndOfMonthDate(LocalDate date) {
		Month month = date.getMonth();
		int year = date.getYear();
		LocalDate end = LocalDate.of(year, month, month.maxLength());
		return convertLocalDateToDate(end);
	}
}
