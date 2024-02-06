package hibernateDemocls.controller;

import java.util.Scanner;

import hibernateDemocls.Student;
import hibernateDemocls.dao.StudentDao;

public class FetchStudentController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to fetch :");
		int id = sc.nextInt();

		StudentDao s = new StudentDao();
		Student s1 = s.fetchStudentById(id);

		if (s1 != null) {
			System.out.println(s1.getId() + "\t" + s1.getName() + "\t" + s1.getAge() + "\t" + s1.getYop());
		} else {
			System.out.println("Invalid Id!!!");
		}

	}

}
