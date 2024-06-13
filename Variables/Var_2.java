package Variables;

public class Var_2 {

	static String uname = "Nagababu Gade";
	static String pswd = "Babu@9989";
	static int followers = 506;
	static int following = 321;
	static int frnds = 456;
	static int blocks = 11;
	static int groups = 10;

	public static void instagram() {
		System.out.println("informartion about instagram details");
		System.out.println("User Name: " + uname);
		System.out.println("Password: " + pswd);
		System.out.println("Followers: " + followers);
		System.out.println("Following: " + following);
	}

	public static void facebook() {
		System.out.println("informartion about facebook details");
		System.out.println("User Name: " + uname);
		System.out.println("Password: " + pswd);
		System.out.println("Friends: " + frnds);
	}

	public static void whatsapp() {
		System.out.println("informartion about whatsapp details");

		System.out.println("User Name: " + uname);
		System.out.println("Password: " + pswd);
		System.out.println("Blocks: " + blocks);
		System.out.println("Groups: " + groups);
	}

	public static void main(String[] args) {
		instagram();
		facebook();
		whatsapp();

	}

}
