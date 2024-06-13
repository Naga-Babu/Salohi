package Modifiers;

public class Modifier_4 {
	public static void main(String[] args) {
        int number = 17;

        checkEven(number);
        checkPrime(number);
    }

    public static void checkEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is not an even number.");
        }
    }

    public static void checkPrime(int num) {
    	int num1=35;
        boolean isPrime = true;
        if (num1 <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num1); i++) {
                if (num1 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num1 + " is a prime number.");
        } else {
            System.out.println(num1 + " is not a prime number.");
        }
    }

}
