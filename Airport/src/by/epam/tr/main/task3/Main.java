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

			System.out.print("Введите на английском пункт назначения: ");
			sDestination = sc.next();
			printResult.printFind(findDestination.listOfDestination(Airport.airport, sDestination));
			System.out.print("Введите на английском день вылета: ");
			day = sc.next();
			printResult.printFind(findDay.listOfDay(Airport.airport, day));
			System.out.print("Введите на английском день вылета: ");
			dayTime = sc.next();
			System.out.print("Введите час вылета: ");
			iTime = sc.nextInt();
			while (iTime < 0 || iTime > 23) {
				System.out.print("Некорректное значение. Введите час вылета: ");
				iTime = sc.nextInt();
			}
			time = LocalTime.of(iTime, 00);
			printResult.printFind(findTime.listOfTime(Airport.airport, dayTime, time));

		}

	}