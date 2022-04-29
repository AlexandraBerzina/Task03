package by.epam.tr.main.task3;
import java.time.LocalDate;
import java.time.LocalTime;


public class Airline {
	private String destination;
	private int number;
	private String type;
	private LocalTime time;
	private LocalDate day;
	
	
	public Airline(String destination, int number, String type, LocalTime time, LocalDate day) {
		super();
		this.destination = destination;
		this.number = number;
		this.type = type;
		this.time = time;
		this.day = day;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
			this.time = time;
	}
	public LocalDate getDay() {
		
		return day;
	}
	public void setDay(LocalDate day) {
		
		this.day = day;
	}
	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", number=" + number + ", type=" + type + ", time=" + time
				+ ", day=" + day + "]";
	}

public void print () {
	
	  System.out.print("Пункт назначения: " + destination + " ");
	  System.out.print("Номер рейса: " + number + " ");
	  System.out.print("Тип самолета: " + type + " ");
	  System.out.print("Время вылета: " + time +" ");
	  System.out.print("День вылета: " + day.getDayOfWeek() + " ");
	   System.out.print("\n");

		
	}

}