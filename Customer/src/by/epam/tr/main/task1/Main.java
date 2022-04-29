package by.epam.tr.main.task1;

public class Main {

	public static void main(String[] args) {
		Customer[] base = Base.base();
		
		System.out.println("Клиенты в алфавитном порядке");
		printCustomer.mPrintCustomer (alphabeticCustomer.mAlphabeticCustomer(base));
		
		System.out.println("Клиенты c картами в указанном диапазоне");
		printCustomer.mPrintCustomer (cardCustomer.mCardCustomer (base));

	}

}
