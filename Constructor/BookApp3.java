package Constructor;

public class BookApp3 {
	String name,colour,authorName;
	int price;
	int pages;
	public BookApp3(String name,String colour) {
		this.name=name;
		this.colour=colour;
		
	}
	public BookApp3(String name,String colour,int price) {
		this.name=name;
		this.colour=colour;
		this.price=price;
		
	}
	public BookApp3(String name,String colour,int price,int pages,String authorName) {
		this.name=name;
		this.colour=colour;
		this.price=price;
		this.pages=pages;
		this.authorName=authorName;
		
		}

	public static void main(String[] args) {
		BookApp3 B1=new BookApp3("Be curious","Black & whits");
		System.out.println("Book Name: "+B1.name);
		System.out.println(B1.colour);
		BookApp3 b2= new BookApp3("Be curious","Black & white",800);
		System.out.println("....................");
		System.out.println(b2.name);
		System.out.println(b2.colour);
		System.out.println(b2.price);
		BookApp3 b3=new BookApp3("Be curious","Black &white",800,1502,"philps");
		System.out.println(".....................");
		System.out.println(b3.name);
		System.out.println(b3.colour);
		System.out.println(b3.price);
		System.out.println(b3.pages);
		System.out.println(b3.authorName);
		

	}

}
