package Constructor;

public class BookApp {

	String name;
	int price;
	String author;
	String publisher;

	public BookApp(String bname, int bprice, String bauthor, String bpublisher) {
		name = bname;
		price = bprice;
		author = bauthor;
		publisher = bpublisher;
		System.out.println("BookName"+name);
		System.out.println("Book price"+bprice);
		System.out.println("Book Author"+bauthor);
		System.out.println("Book pblisher"+bpublisher);

	}

	public static void main(String[] args) {
		BookApp B1 = new BookApp("my life journey", 100, "john philips", "india times");
		BookApp B2 = new BookApp("find your iwn way", 520, "nelson", "times of india");
		BookApp B3 = new BookApp("Be curious", 700, "philp", "bcc");
	}

}
