package by.epam.tr.main.task1;

import java.util.Scanner;

public class Base {
	public static Customer [] base (){
		Scanner sc = new Scanner (System.in);
		System.out.println ("¬ведите количество клиентов");
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
		System.out.print ("¬ведите фамилию на латинице: ");
		c.setSurname (sc.next());
		sc.nextLine();
		System.out.print("¬ведите им€ на латинице: ");
		c.setName(sc.next());
		System.out.print("¬ведите отчество на латинице: ");
		c.setPatronymic(sc.next());
		sc.nextLine();
		System.out.print("¬ведите страну на латинице: ");
		String country = sc.nextLine();
		while (!country.matches(".*[a-zA-Z+\s]")) {
			System.out.print ("¬ведите населенный пункт на латинице: ");
			country = sc.nextLine();
			}
		
		System.out.print ("¬ведите населенный пункт на латинице: ");
		String city = sc.nextLine();
		while (!city.matches(".*[a-zA-Z+\s]")) {
			System.out.print ("¬ведите населенный пункт на латинице: ");
			city = sc.nextLine();
			}
		System.out.print ("¬ведите улицу на латинице: ");
		String street = sc.nextLine();
		while (!street.matches(".*[a-zA-Z+ \s + \\d + '-' ]")) {
			System.out.print ("¬ведите улицу на латинице: ");
			street = sc.nextLine();
			}
		sc.nextLine();
		System.out.print ("¬ведите номер дома: ");
		String number = sc.next();
		while (!number.matches(".*[0-9 + '-'  + '/']")) {
			System.out.print ("¬ведите номер дома: ");
			number = sc.next();
			}
		System.out.print ("¬ведите корпус дома, если нет поставите прочерк: ");
		String housing = sc.next();		
		while (!housing.matches(".*[0-9] ") || (!housing.matches (".*[-]")))  {
			System.out.print ("¬ведите корпус дома, если нет поставите прочерк: ");
			housing = sc.next();
			}
	
		System.out.print ("¬ведите номер квартиры, если нет поставите прочерк: ");
		String flat = sc.next();
		while (!flat.matches(".*[0-9, '-']")) {
			System.out.print ("¬ведите номер квартиры, если нет поставите прочерк: ");
			housing = sc.next();
			}
		
		
		c.setAdress ("—трана " + country + ", " + " " + "н.п. " + city + ", " + " " + "улица " +  street + ", " + " " + "номер дома " + number + ", " + " " + "корпус " + housing + ", " + " " + "квартира " + flat);
		System.out.println ("¬ведите номер карты (16 символов)");
		c.setCard(sc.nextLong());
		System.out.println ("¬ведите номер счета");
		c.setAccount(sc.nextInt());
		return c;
		
	}
	
	
	
	

}