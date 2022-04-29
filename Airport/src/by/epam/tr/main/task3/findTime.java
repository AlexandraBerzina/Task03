package by.epam.tr.main.task3;


import java.time.LocalTime;

public class findTime {
	static Airline[] listOfTime(Airline[] mas, String s, LocalTime t) {

		Airline[] result = new Airline[count(mas, s, t)];
		for (int i = 0; i < mas.length; i++) {
			if ((mas[i].getDay().getDayOfWeek().toString().compareToIgnoreCase(s) == 0)
					&& (mas[i].getTime().isAfter(t))) {
				for (int j = 0; j < result.length; j++) {
					result[j] = mas[i];

				}

			}
		}

		return result;

	}

	private static int count(Airline[] mas, String s, LocalTime t) {

		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if ((mas[i].getDay().getDayOfWeek().toString().compareToIgnoreCase(s) == 0)
					&& (mas[i].getTime().isAfter(t))) {
				count++;

			}
		}
		
		return count;
	}

}
