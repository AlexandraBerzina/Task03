package by.epam.tr.main.task1;

public class Customer {
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String adress;
	private Long card;
	private int account;
	
	public Customer (int id, String surname, String name, String patronymic, String adress, Long card, int account) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.adress = adress;
		this.card = card;
		this.account = account;
		
	}
		
	public void setId(int id) {
		this.id = id;
	}

	public  int getId() {
		return id;
	}

	public void setSurname(String surname) {
		if (surname.matches(".*[a-zA-Z]")) {
			this.surname = surname;
		}
	}

	public String getSurname() {
		return surname;
	}

	public void setName(String name) {
		if (name.matches(".*[a-zA-Z]")) {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public void setPatronymic(String patronymic) {
		if (patronymic.matches(".*[a-zA-Z]")) {
			this.patronymic = patronymic;
		}
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setAdress(String adress) {
		this.adress = adress;
		
	}

	public String getaAdress() {
		return adress;
	}

	public void setCard(Long card) {
		if (card >= 1000000000000000L && card <= 9999999999999999L) {
			this.card = card;
		}
	}

	public Long getCard() {
		return card;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getAccount() {
		return account;
	}
		
	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", adress=" + adress + ", card=" + card + ", account=" + account + "]";
	}

	void print() {
		  System.out.print("Номер клиента: " + id + " ");
		  System.out.print("Фамилия клиента: " + surname + " ");
		  System.out.print("Имя клиента: " + name + " ");
		  System.out.print("Отчество клиента: " + patronymic +" ");
		  System.out.print("Адрес клиента: " + adress + " ");
		  System.out.print("Номер карты клиента: " + card + " ");
		  System.out.print("Счет клиента: " + account);
		  System.out.print("\n");
		 }

}