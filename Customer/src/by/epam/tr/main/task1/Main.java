package by.epam.tr.main.task1;

public class Main {

	public static void main(String[] args) {
		Customer[] base = Base.base();
		
		System.out.println("������� � ���������� �������");
		printCustomer.mPrintCustomer (alphabeticCustomer.mAlphabeticCustomer(base));
		
		System.out.println("������� c ������� � ��������� ���������");
		printCustomer.mPrintCustomer (cardCustomer.mCardCustomer (base));

	}

}
