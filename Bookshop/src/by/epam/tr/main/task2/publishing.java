package by.epam.tr.main.task2;

import java.util.Scanner;

public class publishing {
	public static Book[] findPublishing(Book[] library) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите наименование неоходимого издания на латинице");
		String s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < library.length; i++) {
			if (library[i].getPublishing().compareToIgnoreCase(s) == 0) {
				count++;
			}
		}

		Book[] publishing = new Book[count];
		for (int i = 0; i < library.length; i++) {
			if (library[i].getPublishing().compareToIgnoreCase(s) == 0) {
			for (int j = 0; j < publishing.length; j++) {
				
					publishing[j] = library[i];
				}
			}

		}
		for (int i = 0; i < publishing.length; i++) {
			publishing[i].print();
		}
		return publishing;

	}
}
