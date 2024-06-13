package Modifiers;

public class Modifier_10 {
	public static void details(String cname, String sname, String pyear, String percent, String backlogs,
			String rollNo) {
		System.out.println("------Details-----");
		System.out.println(cname);
		System.out.println(sname);
		System.out.println(pyear);
		System.out.println(percent);
		System.out.println(backlogs);
		System.out.println(rollNo);
	}

	public static void main(String[] args) {
		details("SVKP&Dr.K S Raju art's & science college", "Nagabau Gade", "2022", "82%", "0", "201617");
		details("SVKP&Dr.K S Raju art's & science college", "Lokesh kandiboina", "2022", "79%", "0", "201616");
		details("SVKP&Dr.K S Raju art's & science college", "Yashwanth pilli", "2022", "80%", "0", "201615");
		details("SVKP&Dr.K S Raju art's & science college", "Bhavya Makireddy", "2022", "85%", "0", "201614");
		details("SVKP&Dr.K S Raju art's & science college", "Devi polukonda", "2022", "84%", "0", "201613");

	}

}
