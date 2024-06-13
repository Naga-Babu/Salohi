package Variables;

public class Var_1 {
	 static String Variable1 = "Air cooler";
     static String Variable2 = "Kenstar";
     static int Variable3 = 6000;
     static String Variable4= "White";


    public static void display() {
        System.out.println("Item informartion");
        System.out.println("Device name: " + Variable1);
        System.out.println("Device brand: " + Variable2);
        System.out.println("Device price: " + Variable3);
        System.out.println("Device colour: " + Variable4);


    }

    public static void main(String[] args) {
        display();
    }

}
