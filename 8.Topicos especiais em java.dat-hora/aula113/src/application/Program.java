package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2023-05-23");
		LocalDateTime d05 = LocalDateTime.parse("2023-05-23T01:30:26");
		Instant d06 = Instant.parse("2023-05-23T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		LocalDate nextWeekLocalDate1 = d04.plusYears(7);
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
		System.out.println(nextWeekLocalDate1);
		System.out.println();
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println(pastWeekLocalDateTime);
		System.out.println(nextWeekLocalDateTime);
		System.out.println();
		Instant pastWeekInstant = d06.minus(7,ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7,ChronoUnit.DAYS);
		
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		System.out.println();
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atTime(0,0)); //Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t3 = Duration.between(pastWeekInstant,d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println(t1.toDays());
		System.out.println(t2.toDays());
		System.out.println(t3.toDays());
		System.out.println(t4.toDays());
	}	
}
