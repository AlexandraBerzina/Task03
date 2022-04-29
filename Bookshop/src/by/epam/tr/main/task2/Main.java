package by.epam.tr.main.task2;

public class Main {

	public static void main(String[] args) {
		Book[] library = Library.base();

		System.out.println("Список книг заданного автора");
		printbook.printLibrary(author.findAuthor(library));

		System.out.println("Список книг заданного издательства");
		printbook.printLibrary(publishing.findPublishing(library));

		System.out.println("Список книг, выпущенных после заданного года");
		printbook.printLibrary(year.findYear(library));

	}

}
