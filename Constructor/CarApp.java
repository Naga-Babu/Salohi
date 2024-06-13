package Constructor;
//create a car app and declare 5 instance variales i.e name, colour,price,model,capacity

public class CarApp {
	String name,colour,model;
	double price;
	int capacity;
	public CarApp(String name,String colour) {
		this.name=name;
		this.colour=colour;
		
	}
	public CarApp(String name,String colour,double price) {
		this.name=name;
		this.colour=colour;
		this.price=price;
		
	}
	public CarApp(String name,String colour,double price,int capacity,String model) {
		this.name=name;
		this.colour=colour;
		this.price=price;
		this.capacity=capacity;
		this.model=model;
		
		}

	

	public static void main(String[] args) {
		CarApp c1=new CarApp("Shift","Red");
		System.out.println(c1.name);
		System.out.println(c1.colour);
		CarApp c2=new CarApp("Shift","Red",115000);
		System.out.println(".....................");
		System.out.println(c2.name);
		System.out.println(c2.colour);
		System.out.println(c2.price);
		CarApp c3=new CarApp("Shift","Red",1150000,5,"Maruthi");
		System.out.println("......................");
		System.out.println(c3.name);
		System.out.println(c3.colour);
		System.out.println(c3.price);
		System.out.println(c3.capacity);
		System.out.println(c3.model);
				

	}

}
