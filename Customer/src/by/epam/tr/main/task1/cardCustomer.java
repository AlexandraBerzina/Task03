package by.epam.tr.main.task1;

import java.util.Scanner;

public class cardCustomer {
	public static Customer[] mCardCustomer(Customer[] base) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �������� ��������� ����");
		System.out.print("���������� ��������: ");
		Long a = sc.nextLong();
		System.out.print("������������ �������� ��������: ");
		Long b = sc.nextLong();
		int count=0;
		for (int i = 0; i < base.length; i++) {
			if (base[i].getCard() >= a && base[i].getCard() <= b) {
				count++;
			}
		}
		
		Customer[] cardCustomer = new Customer[count];
		for (int i = 0; i < base.length; i++) {
			if (base[i].getCard() >= a && base[i].getCard() <= b) {
				cardCustomer[i] = base[i];
			}
		}
		

		return cardCustomer;
	}
}