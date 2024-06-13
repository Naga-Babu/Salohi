package Method_overloading;

public class Metd_2 {

	public static void login(String userName, int pswd) {
		System.out.println("User Name: " + userName);
		System.out.println("Password: " + pswd);

	}

	public static void login(int loginId, int pswd) {
		System.out.println("LoginId: " + loginId);
		System.out.println("Password: " + pswd);
	}

	public static void login(long regNo, int pswd) {
		System.out.println("Registration number: " + regNo);
		System.out.println("password: " + pswd);
	}

	public static void main(String[] args) {
		login("Nagababu", 1234);
		login(9989, 123);
		login(9989327187l, 9989);

	}

}