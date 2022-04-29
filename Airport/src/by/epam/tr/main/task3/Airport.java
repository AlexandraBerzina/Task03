package by.epam.tr.main.task3;

import java.time.*;

public class Airport {
	
	static Airline a1 = new Airline("moscow", 1, "tu-134", LocalTime.of(18, 50), LocalDate.of(2022, 04, 25));
	static Airline a2 = new Airline("spb", 2, "airbus A321", LocalTime.of(06, 15), LocalDate.of(2022, 04, 26));
	static Airline a3 = new Airline("minsk", 3, "ан-148", LocalTime.of(14, 30), LocalDate.of(2022, 04, 27));
	static Airline a4 = new Airline("paris", 4, "boeing 777 ", LocalTime.of(9, 30), LocalDate.of(2022, 04, 28));
	static Airline a5 = new Airline("rome", 5, "airbus A320", LocalTime.of(18, 30), LocalDate.of(2022, 04, 29));
	static Airline a6 = new Airline("london", 6, "airbus A330", LocalTime.of(16, 15), LocalDate.of(2022, 04, 30));
	static Airline a7 = new Airline("berlin", 7, "boeing 787", LocalTime.of(23, 45), LocalDate.of(2022, 05, 01));
	
	static Airline [] airport =  new Airline [] {a1, a2, a3, a4, a5, a6, a7}; {
	
	for (int i = 0; i < 7; i++) {
		airport [i].print();
	}
}
}