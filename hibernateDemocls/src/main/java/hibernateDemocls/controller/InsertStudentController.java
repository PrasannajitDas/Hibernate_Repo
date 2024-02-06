package hibernateDemocls.controller;

import java.util.Scanner;

import hibernateDemocls.Student;
import hibernateDemocls.dao.StudentDao;

//This is the class which will be displayed to the client .so we should not connect this class with database .

public class InsertStudentController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id :");
		int id = sc.nextInt();

		System.out.println("Enter name :");
		String name = sc.next();

		System.out.println("Enter age :");
		int age = sc.nextInt();

		System.out.println("Enter yop :");
		int yop = sc.nextInt();

		Student s1 = new Student();
		s1.setId(id);
		s1.setName(name);
		s1.setAge(age);
		s1.setYop(yop);

		StudentDao studentdao = new StudentDao();
		studentdao.saveStudent(s1);

	}

}
