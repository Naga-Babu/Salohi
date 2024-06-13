package Method_overloading;

public class Metd_1 {

	public static void payments(String walletType, long uId) {
		System.out.println("Wallet Type: " + walletType);
		System.out.println("Uid: " + uId);

	}

	public static void payments(String cardType, long cardNo, int cvv) {
		System.out.println("Card type: " + cardType);
		System.out.println("card Number: " + cardNo);
		System.out.println("card CVV: " + cvv);
	}

	public static void payments(String userName, int pswd, long accNo, String accType) {
		System.out.println("User Name: " + userName);
		System.out.println("Account number: " + accNo);
		System.out.println("Password: " + pswd);
		System.out.println("Account Type: " + accType);

	}

	public static void main(String[] args) {
		payments("Phonepe", 5611816);
		payments("Master card", 998877445, 044);
		payments("Nagababu", 9989, 66554499, "Savings account");

	}

}
