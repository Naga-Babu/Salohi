package Variables;

public class FoodOrderApp {

    static String restaurantName = "Kritunga Restaurant";
    static int noOfDishesOrdered = 5;
    static double price = 150.75;

    int orderId;
    double discountAmt;

    public static void orderDetails() 
    {
    	FoodOrderApp n1 = new FoodOrderApp();
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Number of Dishes Ordered: " + noOfDishesOrdered);
        System.out.println("Total Price: " + price);
        System.out.println("Order ID: " + n1.orderId);
        System.out.println("Discount Amount: " + n1.discountAmt);
    }

    public void deliveryPerson(String address, int waitCharges) 
    {
        System.out.println("Delivery Address: " + address);
        System.out.println("Wait Charges: " + waitCharges);
        
        orderDetails();
    }

    public void zomatoPartner() 
    {
        
        int foodRating = 3;
        int deliveryRating = 5;
        int hygienicRating = 5;
        
        System.out.println("Food Rating: " + foodRating);
        System.out.println("Delivery Rating: " + deliveryRating);
        System.out.println("Hygienic Rating: " + hygienicRating);

        deliveryPerson("flat no:201,mens99 wear bulding krishna nagar hyderabad", 50);
    }

    public static void main(String[] args) 
    {
    	FoodOrderApp n2 = new FoodOrderApp();
        n2.zomatoPartner();
    }
}