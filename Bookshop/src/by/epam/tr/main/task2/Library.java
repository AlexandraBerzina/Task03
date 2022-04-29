package by.epam.tr.main.task2;

import java.util.Scanner;

public class Library {
	static Book[] base() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите количество книг");
		int n = sc.nextInt();
		Book[] library = new Book[n];
		for (int i = 0; i < library.length; i++) {
			library[i] = newBook();
			library[i].setId(i + 1);

		}
		return library;

	}

	private static Book newBook() {
		Scanner sc = new Scanner(System.in);
		Book b = new Book(0, null, null, null, 0, 0, 0, null);
		b.setId(0);
		System.out.print("¬ведите название книги на латинице: ");
		b.setTitle(sc.nextLine());
		System.out.print("¬ведите автора: ");
		b.setAuthor(sc.nextLine());
		System.out.print("¬ведите наименование издательства на латинице: ");
		b.setPublishing(sc.nextLine());
		System.out.print("¬ведите год издани€: ");
		b.setYear(sc.nextInt());
		System.out.print("¬ведите количество страниц: ");
		b.setPage(sc.nextInt());
		System.out.print("¬ведите цену книги: ");
		b.setPrice(sc.nextInt());
		System.out.print("¬ведите тип переплета м€гкий - soft, твердый - hard : ");
		b.setCover(sc.next());
		return b;

	}

}
