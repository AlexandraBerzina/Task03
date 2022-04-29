package by.epam.tr.main.task2;

import java.util.Scanner;

public class author {
	public static Book[] findAuthor(Book[] library) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите необходимого автора на латинице: ");
		String s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < library.length; i++) {
			if (library[i].getAuthor().equalsIgnoreCase(s)) {
				count++;
			}
		}

		Book[] author = new Book[count];
		for (int i = 0; i < library.length; i++) {			
			if (library[i].getAuthor().equalsIgnoreCase(s)) {
				for (int j = 0; j < author.length; j++) {
					author[j] = library[i];
				}
			}

		}
		
		return author;

	}
}
