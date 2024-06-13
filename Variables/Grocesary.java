package Variables;

public class Grocesary {
	 static String iname = "Urad Dhal";
	 static String bname = "Aashirvad";
	 int cost = 110;
	 String quantity = "1 kg";

	public static void cusOrder() {
		System.out.println("Order Details");
		System.out.println("Item Name: " + iname);
		System.out.println("Brand: " + bname);
		Grocesary G=new Grocesary();
		System.out.println("Price: " + G.cost);
		System.out.println("Quantity: "+ G.quantity);

	}
	public void deliveryPartner() {
		System.out.println("........Charges.......");
		int maskCharges=10;
		int tax=5;
		int sCharges=12;
		System.out.println("Mask Charges: "+ maskCharges);
		System.out.println("Tax: "+tax);
		System.out.println("Sanitizer charges"+sCharges);
		}

	public static void main(String[] args) {
		cusOrder();
		Grocesary G1=new Grocesary();
		G1.deliveryPartner();
	}

}
