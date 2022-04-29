package by.epam.tr.main.task1;

public class alphabeticCustomer {
	public static Customer[] mAlphabeticCustomer(Customer[] base) {

		Customer temp;
		for (int i = 0; i < base.length; i++) {
			for (int j = i + 1; j < base.length; j++) {
				if (base[i].getSurname().compareToIgnoreCase(base[j].getSurname()) > 0) {

					temp = base[i];
					base[i] = base[j];
					base[j] = temp;

				} else if (base[i].getSurname().compareToIgnoreCase(base[j].getSurname()) == 0) {
					if (base[i].getName().compareToIgnoreCase(base[j].getName()) > 0) {
						temp = base[i];
						base[i] = base[j];
						base[j] = temp;

					} else if (base[i].getName().compareToIgnoreCase(base[j].getName()) == 0) {
						if (base[i].getPatronymic().compareToIgnoreCase(base[j].getPatronymic()) > 0) {
							temp = base[i];
							base[i] = base[j];
							base[j] = temp;
						} else if (base[i].getPatronymic().compareToIgnoreCase(base[j].getPatronymic()) == 0) {
							if (base[i].getId() > base[j].getId()) {
								temp = base[i];
								base[i] = base[j];
								base[j] = temp;
							}

						}
					}

				}

			}
		}

		return base;
	}
}