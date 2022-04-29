package by.epam.tr.main.task2;

import java.util.Scanner;

public class Library {
	static Book[] base() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���������� ����");
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
		System.out.print("������� �������� ����� �� ��������: ");
		b.setTitle(sc.nextLine());
		System.out.print("������� ������: ");
		b.setAuthor(sc.nextLine());
		System.out.print("������� ������������ ������������ �� ��������: ");
		b.setPublishing(sc.nextLine());
		System.out.print("������� ��� �������: ");
		b.setYear(sc.nextInt());
		System.out.print("������� ���������� �������: ");
		b.setPage(sc.nextInt());
		System.out.print("������� ���� �����: ");
		b.setPrice(sc.nextInt());
		System.out.print("������� ��� ��������� ������ - soft, ������� - hard : ");
		b.setCover(sc.next());
		return b;

	}

}
