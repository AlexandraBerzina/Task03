package by.epam.tr.main.task3;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			String sDestination;
			String day;
			String dayTime;
			LocalTime time;
			int iTime;

			System.out.print("������� �� ���������� ����� ����������: ");
			sDestination = sc.next();
			printResult.printFind(findDestination.listOfDestination(Airport.airport, sDestination));
			System.out.print("������� �� ���������� ���� ������: ");
			day = sc.next();
			printResult.printFind(findDay.listOfDay(Airport.airport, day));
			System.out.print("������� �� ���������� ���� ������: ");
			dayTime = sc.next();
			System.out.print("������� ��� ������: ");
			iTime = sc.nextInt();
			while (iTime < 0 || iTime > 23) {
				System.out.print("������������ ��������. ������� ��� ������: ");
				iTime = sc.nextInt();
			}
			time = LocalTime.of(iTime, 00);
			printResult.printFind(findTime.listOfTime(Airport.airport, dayTime, time));

		}

	}