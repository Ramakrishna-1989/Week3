package week3.day1;

public class Students {

	public static void main(String[] args) {

		Students stu1 = new Students();
		stu1.getStudentInfo(1001);
		stu1.getStudentInfo(1001, "Tom");
		stu1.getStudentInfo("Test123@gmail.com", 9876543210l);
	}

	public void getStudentInfo(int id) {
		System.out.println("Method contains only id");
	}

	public void getStudentInfo(int id , String Name) {
		System.out.println("Method contains id and Name");
	}

	public void getStudentInfo(String email , long Phoneno) {
		System.out.println("Method Contains email and Phone number");
	}
}
