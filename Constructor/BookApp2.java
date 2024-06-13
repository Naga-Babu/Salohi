package Constructor;

public class BookApp2 {
	String name;
	int price;
	String author;
	String publisher;

	public BookApp2(String bname, int bprice, String bauthor, String bpublisher) {
		this.name = bname;
		this.price = bprice;
		this.author = bauthor;
		this.publisher = bpublisher;

	}

	public static void main(String[] args) {
		BookApp2 B1 = new BookApp2("my life journey", 100, "john philips", "india times");
		System.out.println(B1.name);
		System.out.println(B1.price);
		System.out.println(B1.author);
		System.out.println(B1.publisher);
	}

}