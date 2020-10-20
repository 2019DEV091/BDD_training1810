package concertWebsite.model;

public class Book {
	
	private String name;

	public Book(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}
	
	
}
