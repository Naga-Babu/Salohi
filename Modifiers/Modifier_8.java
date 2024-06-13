package Modifiers;

public class Modifier_8 {
	public static void cir(float pie, int radius) {
		pie = pie * radius * radius;
		System.out.println("area of circle " + pie);
	}

	public static void main(String[] args) {
		cir(3.14f, 5);

	}

}
