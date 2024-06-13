package Constructor;

public class Student {

		String name;
		int roll_no;
		public Student(String sname,int roll_n0){
			name=sname;
			roll_no=roll_n0;
			System.out.println(name);
			System.out.println(roll_no);
			
			}
		public static void main(String[] args) {
			Student s1=new Student("Nagababu",1002);
			Student s2=new Student("Raju",1003);

			
		}

}
