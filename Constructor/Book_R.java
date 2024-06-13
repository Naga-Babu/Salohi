package Constructor;

public class Book_R {
	String name, colour, authorName;
	int price;
	char Grade;

	public Book_R(String name, String colour, String authorName) {
		this.name = name;
		this.colour = colour;
		this.authorName = authorName;
	}
 
	public Book_R(String name, String colour, String authorName, int price, char Grade) {
		this.name = name;
		this.colour = colour;
		this.authorName = authorName;
		this.price = price;
		this.Grade = Grade;
	}

	public static void main(String[] args) {
		Book_R B1 = new Book_R("Be curious", "black", "john");
		System.out.println("Book Name: " + B1.name);
		System.out.println("Book Colour: " + B1.colour);
		System.out.println("Book Author: " + B1.authorName);
		Book_R B2 = new Book_R("Be curious", "black", "john", 500, 'A');
		System.out.println("......................");
		System.out.println("Book Name: " + B2.name);
		System.out.println("Book Colour: " + B2.colour);
		System.out.println("Book Author: " + B2.authorName);
		System.out.println("Book Price: " + B2.price);
		System.out.println("Grade: "+B2.Grade);
	}

}
