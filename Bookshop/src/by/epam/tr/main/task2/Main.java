package by.epam.tr.main.task2;

public class Main {

	public static void main(String[] args) {
		Book[] library = Library.base();

		System.out.println("������ ���� ��������� ������");
		printbook.printLibrary(author.findAuthor(library));

		System.out.println("������ ���� ��������� ������������");
		printbook.printLibrary(publishing.findPublishing(library));

		System.out.println("������ ����, ���������� ����� ��������� ����");
		printbook.printLibrary(year.findYear(library));

	}

}
