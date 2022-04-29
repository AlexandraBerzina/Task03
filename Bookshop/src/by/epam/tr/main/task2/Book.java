package by.epam.tr.main.task2;

public class Book {
	private int id;
	private String title;
	private String author;
	private String publishing;
	private int year;
	private int page;
	private int price;
	private String cover;

	public Book(int id, String title, String author, String publishing, int year, int page, int price, String cover) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishing = publishing;
		this.year = year;
		this.page = page;
		this.price = price;
		this.cover = cover;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title.matches(".*[a-zA-Z+\\s]")) {
			this.title = title;
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		if (author.matches(".*[a-zA-Z+\\s]")) {
			this.author = author;
		}
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		if (publishing.matches(".*[a-zA-Z+\\s]")) {
			this.publishing = publishing;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 0 && year <= 2022) {
			this.year = year;
		}
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page > 0) {
			this.page = page;
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >0) {
		this.price = price;
		}
	}

	public String getCover() {
		return cover;
		
	}
	public void setCover(String cover) {
		if (cover.equalsIgnoreCase("soft") | cover.equalsIgnoreCase("hard")) {
		this.cover = cover;
		}
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publishing=" + publishing + ", year="
				+ year + ", page=" + page + ", price=" + price + ", cover=" + cover + "]";
	}
	public void print () {
		  System.out.print("Номер книги: " + id + " ");
		  System.out.print("Наименование книги: " + title + " ");
		  System.out.print("Автор: " + author + " ");
		  System.out.print("Наименование издательства: " + publishing +" ");
		  System.out.print("Год издания: " + year + " ");
		  System.out.print("Количество страниц: " + page + " ");
		  System.out.print("Цена книги: " + price + " ");
		  System.out.print("Тип переплета: " + cover);
		  System.out.print("\n");
	}

}
