package by.epam.tr.main.task2;

import java.util.Scanner;

public class year {
	public static Book[] findYear(Book[] library) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите год, после которого были выпущены книги");
		int s = sc.nextInt();
		int count = 0;
		for (int i = 0; i < library.length; i++) {
			if (library[i].getYear() > s) {
				count++;
			}
		}

		Book[] year = new Book[count];
		for (int i = 0; i < library.length; i++) {
			if (library[i].getYear() > s) {
				for (int j = 0; j < year.length; j++) {
					year[j] = library[i];
				}
			}

		}

		return year;

	}

}
