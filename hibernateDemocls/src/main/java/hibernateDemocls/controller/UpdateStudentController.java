package hibernateDemocls.controller;

import java.util.Scanner;

import hibernateDemocls.Student;
import hibernateDemocls.dao.StudentDao;

public class UpdateStudentController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to update :");
		int id = sc.nextInt();

		System.out.println("1.update name\n2.update age\n3.update yop");
		System.out.println("Enter choice :");
		int choice = sc.nextInt();

		StudentDao sdao = new StudentDao();

		switch (choice) {
		case 1:
			System.out.println("Enter name to update :");
			String name = sc.next();
			Student s = sdao.fetchStudentById(id);
			if (s != null) {
				s.setName(name);
				sdao.updateStudentById(s);
				System.out.println("Data updated successfully.");
			} else {
				System.out.println("Invlid data !!!");
			}
			break;
		case 2:
			Student s1 = sdao.fetchStudentById(id);
			System.out.println("Enter age to update :");
			int age = sc.nextInt();
			if (s1 != null) {
				s1.setAge(age);
				sdao.updateStudentById(s1);
				System.out.println("Data updated >");
			} else {
				System.out.println("Invalid ID!");
			}
			break;
		case 3:
			Student s2 = sdao.fetchStudentById(id);
			System.out.println("Enter yop to update :");
			int yop = sc.nextInt();
			if (s2 != null) {
				s2.setYop(yop);
				sdao.updateStudentById(s2);
				System.out.println("Data updated >");
			} else {
				System.out.println("Invalid Id !");
			}
		}

	}

}
