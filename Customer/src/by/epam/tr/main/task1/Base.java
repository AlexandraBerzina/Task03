package by.epam.tr.main.task1;

import java.util.Scanner;

public class Base {
	public static Customer [] base (){
		Scanner sc = new Scanner (System.in);
		System.out.println ("������� ���������� ��������");
		int n = sc.nextInt();
		Customer [] base = new Customer [n];
		for (int i = 0; i < base.length; i++) {
			base [i] = newCustomer ();
			base [i].setId(i+1);
		
		}
		

		return base;
			
		}

	
	public static Customer newCustomer () {
		Scanner sc = new Scanner (System.in);
		Customer c = new Customer (0, null, null, null, null, null, 0);
		c.setId (0);
		System.out.print ("������� ������� �� ��������: ");
		c.setSurname (sc.next());
		sc.nextLine();
		System.out.print("������� ��� �� ��������: ");
		c.setName(sc.next());
		System.out.print("������� �������� �� ��������: ");
		c.setPatronymic(sc.next());
		sc.nextLine();
		System.out.print("������� ������ �� ��������: ");
		String country = sc.nextLine();
		while (!country.matches(".*[a-zA-Z+\s]")) {
			System.out.print ("������� ���������� ����� �� ��������: ");
			country = sc.nextLine();
			}
		
		System.out.print ("������� ���������� ����� �� ��������: ");
		String city = sc.nextLine();
		while (!city.matches(".*[a-zA-Z+\s]")) {
			System.out.print ("������� ���������� ����� �� ��������: ");
			city = sc.nextLine();
			}
		System.out.print ("������� ����� �� ��������: ");
		String street = sc.nextLine();
		while (!street.matches(".*[a-zA-Z+ \s + \\d + '-' ]")) {
			System.out.print ("������� ����� �� ��������: ");
			street = sc.nextLine();
			}
		sc.nextLine();
		System.out.print ("������� ����� ����: ");
		String number = sc.next();
		while (!number.matches(".*[0-9 + '-'  + '/']")) {
			System.out.print ("������� ����� ����: ");
			number = sc.next();
			}
		System.out.print ("������� ������ ����, ���� ��� ��������� �������: ");
		String housing = sc.next();		
		while (!housing.matches(".*[0-9] ") || (!housing.matches (".*[-]")))  {
			System.out.print ("������� ������ ����, ���� ��� ��������� �������: ");
			housing = sc.next();
			}
	
		System.out.print ("������� ����� ��������, ���� ��� ��������� �������: ");
		String flat = sc.next();
		while (!flat.matches(".*[0-9, '-']")) {
			System.out.print ("������� ����� ��������, ���� ��� ��������� �������: ");
			housing = sc.next();
			}
		
		
		c.setAdress ("������ " + country + ", " + " " + "�.�. " + city + ", " + " " + "����� " +  street + ", " + " " + "����� ���� " + number + ", " + " " + "������ " + housing + ", " + " " + "�������� " + flat);
		System.out.println ("������� ����� ����� (16 ��������)");
		c.setCard(sc.nextLong());
		System.out.println ("������� ����� �����");
		c.setAccount(sc.nextInt());
		return c;
		
	}
	
	
	
	

}