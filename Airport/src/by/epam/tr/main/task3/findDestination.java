package by.epam.tr.main.task3;

public class findDestination {
	static Airline[] listOfDestination(Airline[] mas, String s) {
		Airline[] result = new Airline[count(mas, s)];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i].getDestination().compareToIgnoreCase(s) == 0) {
				for (int j = 0; j < result.length; j++) {
					result[j] = mas[i];

				}

			}
		}

		return result;

	}

	private static int count(Airline[] mas, String s) {
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i].getDestination().compareToIgnoreCase(s) == 0) {
				count++;

			}
		}
		return count;
	}
}
